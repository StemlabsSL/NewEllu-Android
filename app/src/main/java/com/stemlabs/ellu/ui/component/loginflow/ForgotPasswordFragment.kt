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
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import com.stemlabs.ellu.utils.Validations
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.fragment_forgot_password.imgBackArrow
import kotlin.reflect.jvm.internal.impl.load.java.Constant


class ForgotPasswordFragment(var whereFrom: String) : BaseFragment() {
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
        return inflater.inflate(R.layout.fragment_forgot_password, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.GONE
        if (whereFrom.equals("login")) {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signin)
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Forgot Password?"
        } else {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signup)
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome back!"
        }
        ccp.contentColor = ContextCompat.getColor(baseActivity!!, R.color.white)
        ccp.setCountryForNameCode("ES")
        imgBackArrow.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        imgVerificationCode.setOnClickListener(View.OnClickListener {
            it.hideKeyboard()
            if (Validations.isFieldEmpty(ETPhone_ForGot.text.toString())) {
                showBaseToast(LL_Forgot, getString(R.string.Warning_enter_phone))
            } else if (Validations.isInvalidNumber(ETPhone_ForGot.text.toString())) {
                showBaseToast(LL_Forgot, getString(R.string.Warning_short_phone))
            } else {
                sendOtp()

            }

        })
    }

    fun sendOtp() {
        var type = ""
        if (whereFrom.equals("login")) {
            type = "forgot"
        }
        showBaseProgressDialog(mContext, getString(R.string.please_wait))
        WebService.mInstance.Forgot(type = type, phone = ETPhone_ForGot.text.toString(), countryCode = ccp.selectedCountryCodeWithPlus, command = object : ForgotCommand {
            override fun onSuccess(response: ForgotModel) {
                LL_Forgot.hideKeyboard()
                hideBaseProgressDialog()
                if (response.success == true) {


                    SharedPref.getInstance(mContext).setString(Constants.USER_PHONE, response.data.phone)
                    SharedPref.getInstance(mContext).setString(Constants.USER_OTP, response.data.otp)
                    SharedPref.getInstance(mContext).setString(Constants.USER_CPP, ccp.selectedCountryCodeWithPlus)
                    replaceFragment(VerifyOtpFragment(whereFrom), true)


                }

            }

            override fun onError(message: String) {
                hideBaseProgressDialog()
                showBaseToast(LL_Forgot, message)

            }

        })

    }

}