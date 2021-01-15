package com.stemlabs.ellu.ui.component.loginflow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import kotlinx.android.synthetic.main.activity_login_flow.*
import kotlinx.android.synthetic.main.fragment_intro.*


class IntroFragment : BaseFragment() {
    private var slideFromLeft: Animation? = null
    private var slideFromRight: Animation? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        slideFromLeft = AnimationUtils.loadAnimation(context, R.anim.slide_in_from_left_anim)
        slideFromRight = AnimationUtils.loadAnimation(context, R.anim.slide_in_from_right_anim)
        llSignUp.startAnimation(slideFromLeft)
        llSignIn.startAnimation(slideFromRight)

        (baseActivity as LoginFlowActivity).llFBGoogle.visibility = View.VISIBLE
        (baseActivity as LoginFlowActivity).tvWelcomeLBL.text = "Welcome!"
        imgSignInArrow.setOnClickListener(View.OnClickListener {
            replaceFragment(LoginFragment(), true)
        })
        imgSignUpArrow.setOnClickListener(View.OnClickListener {
            replaceFragment(SignUpFragment(), true)
        })
    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {


    }


}