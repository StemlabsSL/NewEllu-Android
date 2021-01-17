package com.stemlabs.ellu.ui.component.loginflow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_forgot_password.*
import kotlinx.android.synthetic.main.fragment_reset_password.*
import kotlinx.android.synthetic.main.fragment_reset_password.imgSuccessReset
import kotlinx.android.synthetic.main.fragment_reset_password_successfully.*
import kotlinx.android.synthetic.main.fragment_reset_password_successfully.llMain


class ResetPasswordSuccessfullyFragment(var status: String) : BaseFragment() {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reset_password_successfully, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.GONE

        if (status.equals("reset")) {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signin)
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Forgot Password?"
            tvRegisteredSuccessFully.text = "Password Reset\nSuccessfully!"
        } else {
            llMain.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient_signup)
            tvRegisteredSuccessFully.text = "Registered\nSuccessfully!"
            (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome Back!"
        }

        imgSuccessReset.setOnClickListener(View.OnClickListener {
            if (status.equals("reset")) {
                val nextScreenIntent = Intent(context, LoginFlowActivity::class.java)
                startActivity(nextScreenIntent)
                baseActivity!!.finish()
            } else {
                val nextScreenIntent = Intent(context, HomeActivity::class.java)
                startActivity(nextScreenIntent)
                baseActivity!!.finish()
            }
        })
    }


}