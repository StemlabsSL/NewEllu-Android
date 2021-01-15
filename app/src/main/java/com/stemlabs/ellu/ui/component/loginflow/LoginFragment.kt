package com.stemlabs.ellu.ui.component.loginflow

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.Validations
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.imgBackArrow


class LoginFragment : BaseFragment() {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }

    lateinit var mContext: Context

    var isPasswordVisible = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
//        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.VISIBLE
        (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome Back!"
        imgBackArrow.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })


        tvForgotpassworsd.setOnClickListener(View.OnClickListener {
            replaceFragment(ForgotPasswordFragment("login"), true)
        })

        imgPasswordVisibilityLogin.setOnClickListener(View.OnClickListener {

            if (isPasswordVisible) {
                imgPasswordVisibilityLogin.setImageDrawable(resources.getDrawable(R.drawable.ic_eye_visible))
                isPasswordVisible = !isPasswordVisible
                ET_password_Login.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                imgPasswordVisibilityLogin.setImageDrawable(resources.getDrawable(R.drawable.eyeoff))
                isPasswordVisible = !isPasswordVisible
                ET_password_Login.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }

        })
        imgSignIn.setOnClickListener(View.OnClickListener {
            if (Et_Email_LOGIN.text.toString().isEmpty()) {
                showBaseToast(LL_Login, "Please enter email id")
            } else if (Validations.isInvalidEmail(Et_Email_LOGIN.text.trim().toString())) {
                showBaseToast(LL_Login, getString(R.string.invalid_email_id))
            } else if (ET_password_Login.text.toString().isEmpty()) {
                showBaseToast(LL_Login, "Please enter password")

            } else if (ET_password_Login.text.toString().length < 6) {
                showBaseToast(LL_Login, getString(R.string.password_length))
            } else {
                login()
            }

//            replaceFragment(AboutBandFragment(), true)
        })
    }

    fun login() {
        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        WebService.mInstance.Login(email = Et_Email_LOGIN.text.toString().trim(), password = ET_password_Login.text.toString(), deviceId = "1", command = object : ForgotCommand {
            override fun onSuccess(response: ForgotModel) {
                LL_Login.hideKeyboard()
                hideBaseProgressDialog()
                com.stemlabs.ellu.utils.SharedPref.getInstance(mContext).setString(Constants.USER_ID, response.data._id)
                val nextScreenIntent = Intent(context, HomeActivity::class.java)
                startActivity(nextScreenIntent)
                baseActivity!!.finish()
            }

            override fun onError(message: String) {
                hideBaseProgressDialog()
                showBaseToast(LL_Login, message)
            }

        })
    }


}