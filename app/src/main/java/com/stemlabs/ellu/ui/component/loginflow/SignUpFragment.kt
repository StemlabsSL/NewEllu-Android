package com.stemlabs.ellu.ui.component.loginflow

import android.content.Context
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.Validations
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_sign_up.*
import kotlinx.android.synthetic.main.fragment_sign_up.imgBackArrow


class SignUpFragment : BaseFragment() {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    lateinit var mContext: Context

    var isPasswordVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.VISIBLE
        (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome!"




        imgBackArrow.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })

        imgSignUP.setOnClickListener(View.OnClickListener {

            checkValidations()


        })



        imgPasswordVisibility.setOnClickListener(View.OnClickListener {
            if (isPasswordVisible) {
                imgPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.ic_eye_visible))
                isPasswordVisible = !isPasswordVisible
                ET_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                imgPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.eyeoff))
                isPasswordVisible = !isPasswordVisible
                ET_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        })

        imggConfirmPasswordVisibility.setOnClickListener(View.OnClickListener {
            if (isPasswordVisible) {
                imggConfirmPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.ic_eye_visible))
                isPasswordVisible = !isPasswordVisible
                ET_confirm_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                imggConfirmPasswordVisibility.setImageDrawable(resources.getDrawable(R.drawable.eyeoff))
                isPasswordVisible = !isPasswordVisible
                ET_confirm_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        })


    }


    fun ApiSignup() {

        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        WebService.mInstance.SignUp(name = ET_name.text.trim().toString(), email = ET_email.text.toString().trim(), password = ET_password.text.toString(), deviceId = "1", latitude = "0", longitude = "0", socialid = "", image = "", command = object : SignupCommand {
            override fun onSuccess(response: Signupmodel) {
                LL_Layout.hideKeyboard()
                hideBaseProgressDialog()
                if (response.success == true) {

                    SharedPref.getInstance(mContext).setString(Constants.USER_NAME, ET_name.text.toString())
                    SharedPref.getInstance(mContext).setString(Constants.USER_EMAIL, ET_email.text.toString())
                    SharedPref.getInstance(mContext).setString(Constants.USER_PASSWORD, ET_password.text.toString())

                    replaceFragment(ForgotPasswordFragment("signup"), true)

                }
            }

            override fun onError(message: String) {
                hideBaseProgressDialog()
                showBaseToast(LL_Layout, message)
                Log.e("error", message)
            }

        })


    }

    fun checkValidations() {

        when {
            Validations.isFieldEmpty(ET_name.text?.toString()?.trim() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.warning_enter_first_name))

            Validations.isFieldEmpty(ET_email.text?.toString()?.trim() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.warning_enter_email))

            Validations.isInvalidEmail(ET_email.text?.trim().toString() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.invalid_email_id))
            Validations.isFieldEmpty(ET_password.text?.toString()?.trim() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.warning_enter_password))

            Validations.isShortPassword(ET_password.text?.toString()?.trim() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.warning_short_password))

            Validations.isFieldEmpty(ET_confirm_password.text?.toString()?.trim() ?: "")
            -> showBaseToast(LL_Layout, getString(R.string.warning_enter_con_password))


            ET_password.text.toString().length < 6
            -> showBaseToast(LL_Layout, getString(R.string.password_length))
            (ET_password.text.toString() != ET_confirm_password.text.toString())
            -> showBaseToast(LL_Layout, getString(R.string.password_mismatch))

            else -> {

                ApiSignup()


            }
        }

    }
}