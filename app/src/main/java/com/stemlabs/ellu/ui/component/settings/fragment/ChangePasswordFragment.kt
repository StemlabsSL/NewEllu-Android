package com.stemlabs.ellu.ui.component.settings.fragment

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.profile.fragment.presenter.SettingFragmentPresenter
import com.stemlabs.ellu.ui.component.profile.fragment.view.SettingFragmentView
import com.stemlabs.ellu.ui.component.settings.dialog.ErrorChangePasswordDialog
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import kotlinx.android.synthetic.main.fragment_change_password.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class ChangePasswordFragment : BaseFragment(), View.OnClickListener, SettingFragmentView {

    var mView: View? = null
    var userid = ""
    var isPasswordVisible = true
    lateinit var errorPasswordDialog: ErrorChangePasswordDialog
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mView = inflater.inflate(R.layout.fragment_change_password, container, false)
        return mView;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    lateinit var mContext: Context

    lateinit var mPresenter: SettingFragmentPresenter

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    private fun initView() {
        userid = SharedPref.getInstance(mContext).getString(Constants.USER_ID)
        mPresenter = SettingFragmentPresenter(mContext, this)
        imgNewPasswordVisibility.setOnClickListener(this)
        errorPasswordDialog = ErrorChangePasswordDialog()
        setHeader()
        tvConfirmLBL.setOnClickListener(this)
        tvHomeLBL.setOnClickListener(this)
    }

    private fun setHeader() {
        tvToolbarTitle.text = "Change Password"
        imgLeftIcon.setOnClickListener(this)
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.tvConfirmLBL -> {
                changePassword()
            }
            R.id.tvHomeLBL -> {
                (baseActivity as HomeActivity).manageBottomView("chat")
                /*if (errorPasswordDialog != null && errorPasswordDialog!!.isAdded()) {
                        return;
                    }
                    errorPasswordDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")*/

            }
            R.id.imgNewPasswordVisibility -> {
                if (isPasswordVisible) {
                    imgNewPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.ic_eye_visible))
                    isPasswordVisible = !isPasswordVisible;
                    edtNewPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    imgNewPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.eyeoff))
                    isPasswordVisible = !isPasswordVisible;
                    edtNewPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        }
    }

    override fun onSuccessfullyChangePassword(response: CommonResponse) {
        llChangePassword.visibility = View.GONE
        llChangePasswordSuccess.visibility = View.VISIBLE
        imgLeftIcon.visibility = View.INVISIBLE
    }

    override fun showMessage(message: String) {
        showBaseToast(rootView, message)
    }

    override fun hideProgressBar() {
        hideBaseProgressDialog()
    }

    override fun showProgressBar(message: String) {
        showBaseProgressDialog(mContext, message)
    }

    fun changePassword() {
        if (edtOldPassword.text.toString().isEmpty()) {
            showMessage("Please enter old password")
            return;
        }

        if (edtNewPassword.text.toString().isEmpty()) {
            showMessage("Please enter new password")
            return;
        }

        if (edtNewPassword.text.toString().length < 6) {
            showMessage("Password length must be greater than or equal to 6")
            return;
        }
        if (edtConfirmPassword.text.toString().isEmpty()) {
            showMessage("Please enter confirm password")
            return;
        }

        Log.e("pass", "")
        if (!edtConfirmPassword.text.toString().equals(edtNewPassword.text.toString())) {
            showMessage(getString(R.string.password_mismatch))
            return;
        }
        val request = ApiRequest();
        request.userId = userid
        // request.oldPassword = edtOldPassword.text.toString()
        request.newPassword = edtNewPassword.text.toString()
        request.password = edtOldPassword.text.toString()
        mPresenter.changePassword(request)
    }


//Hide Password

}