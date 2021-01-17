package com.stemlabs.ellu.ui.component.loginflow

import android.content.Context
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CommonResponse
import com.stemlabs.ellu.data.model.request.ApiRequest
import com.stemlabs.ellu.data.remote.handler.CommonHandler
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_reset_password.*
import kotlinx.android.synthetic.main.fragment_reset_password.imgPasswordVisibility
import kotlinx.android.synthetic.main.fragment_reset_password.rootView
import kotlinx.android.synthetic.main.fragment_sign_up.*


class ResetPasswordFragment : BaseFragment() {


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    lateinit var mContext: Context
    var isPasswordVisible = true


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reset_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.GONE
        (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Forgot Password?"

        imgPasswordVisibility.setOnClickListener(View.OnClickListener {
            if (isPasswordVisible) {
                imgPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.ic_eye_visible))
                isPasswordVisible = !isPasswordVisible
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                imgPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.eyeoff))
                isPasswordVisible = !isPasswordVisible
                password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        })
        imgSuccessReset.setOnClickListener(View.OnClickListener {

            resetPassword()

        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    fun showMessage(message: String) {
        showBaseToast(rootView, message)
    }

    fun resetPassword() {
        if (password.text.toString().isEmpty()) {
            showMessage("Please enter new password")
            return;
        }

        if (password.text.toString().length < 6) {
            showMessage(getString(R.string.warning_short_password))
            return;
        }

        if (edtConfirmPassword.text.toString().isEmpty()) {
            showMessage("Please enter confirm password")
            return;
        }

        if (!edtConfirmPassword.text.toString().equals(password.text.toString())) {
            showMessage("Confirm password does not match")
            return;
        }
        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        val request = ApiRequest()
        request.password = password.text.toString()
        request.phone = SharedPref.getInstance(mContext).getString(Constants.USER_PHONE)
        WebService.mInstance.resetPassword(request, object : CommonHandler {
            override fun onSuccess(response: CommonResponse) {
                rootView.hideKeyboard()
                hideBaseProgressDialog()
                if (response.success) {
                    replaceFragment(ResetPasswordSuccessfullyFragment("reset"), true)
                } else {
                    showBaseToast(rootView, response.message)
                }
            }

            override fun onError(message: String) {
                showBaseToast(rootView, message)
                hideBaseProgressDialog()
            }

        })
    }

}