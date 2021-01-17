package com.stemlabs.ellu.ui.component.loginflow

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.remote.service.WebService
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.ForgotModel
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.SignupCommand
import com.stemlabs.ellu.ui.component.loginflow.modelsignup.Signupmodel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.Validations
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_forgot_password.imgBackArrow
import kotlinx.android.synthetic.main.fragment_verify_otp.*
import kotlinx.android.synthetic.main.view_otp.*


class VerifyOtpFragment(var fromWhere: String) : BaseFragment() {

    lateinit var otp: String
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    lateinit var mContext: Context


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verify_otp, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.GONE





        setAutoOtp()



        if (fromWhere.equals("login")) {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signin)
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Forgot Password?"
        } else {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signup)
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome Back!"
        }
        imgBackArrow.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        imgVerifyOTPHere.setOnClickListener(View.OnClickListener {

            verificationOtp()

        })

        Resend_otp.setOnClickListener(View.OnClickListener {
            showBaseProgressDialog(mContext, "Please wait")
            var type = ""
            if (fromWhere.equals("login")) {
                type = "forgot"
            }
            WebService.mInstance.resendOtp(type = type,phone = SharedPref.getInstance(mContext).getString(Constants.USER_PHONE), countryCode = SharedPref.getInstance(mContext).getString(Constants.USER_CPP), command = object : ForgotCommand {
                override fun onSuccess(response: ForgotModel) {
                    hideBaseProgressDialog()
                    showBaseToast(LL_verify, response.message)

                    if (response.success == true) {

                        val ET_1: Char = response.data.otp.get(0)
                        val ET_2: Char = response.data.otp.get(1)
                        val ET_3: Char = response.data.otp.get(2)
                        val ET_4: Char = response.data.otp.get(3)
                        val ET_5: Char = response.data.otp.get(4)
                        otp_edit_1.setText(ET_1.toString())
                        otp_edit_2.setText(ET_2.toString())
                        otp_edit_3.setText(ET_3.toString())
                        otp_edit_4.setText(ET_4.toString())
                        otp_edit_5.setText(ET_5.toString())
                    }


                }

                override fun onError(message: String) {
                    hideBaseProgressDialog()
                    showBaseToast(LL_verify, message)

                }

            })

        })

    }

    fun verificationOtp() {
        if (Validations.isFieldEmpty(otpView.otp.toString())) {
            showBaseToast(LL_verify, getString(R.string.please_enter_otp))
            return
        }
        if (otpView.otp.length < 5) {
            showBaseToast(LL_verify, getString(R.string.invalid_otp))
            return
        }

        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        WebService.mInstance.OtpVeriofy(name = SharedPref.getInstance(mContext).getString(Constants.USER_NAME), email = SharedPref.getInstance(mContext).getString(Constants.USER_EMAIL), password = SharedPref.getInstance(mContext).getString(Constants.USER_PASSWORD), phone = SharedPref.getInstance(mContext).getString(Constants.USER_PHONE), deviceId = "1", latitude = "0", longitude = "0", otp = otpView.otp.toString(), socialId = SharedPref.getInstance(mContext).getString(Constants.SOCIAL_ID), avatar = SharedPref.getInstance(mContext).getString(Constants.PRO_ID), command = object : SignupCommand {
            override fun onSuccess(response: Signupmodel) {
                hideBaseProgressDialog()
                if (response.success == true) {

                    if (fromWhere.equals("login")) {
                        replaceFragment(ResetPasswordFragment(), false)
                    } else {
                        com.stemlabs.ellu.utils.SharedPref.getInstance(mContext).setString(Constants.USER_ID, response.data._id)
                        replaceFragment(ResetPasswordSuccessfullyFragment(fromWhere), false)
                    }
                }

            }

            override fun onError(message: String) {
                hideBaseProgressDialog()
                showBaseToast(LL_verify, message)
            }

        })
    }

    fun setAutoOtp() {

        otp = SharedPref.getInstance(mContext).getString(Constants.USER_OTP)
        val ET_1: Char = otp.get(0)
        val ET_2: Char = otp.get(1)
        val ET_3: Char = otp.get(2)
        val ET_4: Char = otp.get(3)
        val ET_5: Char = otp.get(4)
        otp_edit_1.setText(ET_1.toString())
        otp_edit_2.setText(ET_2.toString())
        otp_edit_3.setText(ET_3.toString())
        otp_edit_4.setText(ET_4.toString())
        otp_edit_5.setText(ET_5.toString())


    }




}