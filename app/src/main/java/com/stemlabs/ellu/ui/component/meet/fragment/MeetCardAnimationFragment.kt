package com.stemlabs.ellu.ui.component.meet.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_meet_card_animation.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class MeetCardAnimationFragment(var fromWhere: String) : BaseFragment(), View.OnClickListener {
    lateinit var fadeIn: Animation
    lateinit var fadeOut: Animation
    lateinit var slantAnimation: Animation

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meet_card_animation, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        tvToolbarTitle.text = "Lets Meet"
        imgLeftIcon.setOnClickListener(this)
    }

    private fun initView() {
        fadeIn = AnimationUtils.loadAnimation(baseActivity!!, R.anim.fade_in)
        fadeOut = AnimationUtils.loadAnimation(baseActivity!!, R.anim.fade_out)
        slantAnimation = AnimationUtils.loadAnimation(baseActivity!!, R.anim.slide_top)
        if (fromWhere.equals("Sent")) {
            tvOpenInvitationLBL.makeGone()
            startAnimation()
        }



        tvOpenInvitationLBL.setOnClickListener(this)
        frameEnvelop.setOnClickListener(this)
    }

    private fun startAnimation() {
        frameEnvelop.animation = fadeIn

        fadeIn.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                imgEnvelop.setImageResource(R.drawable.slant_envelop)
                frameToFrom.makeGone()
                frameEnvelop.animation = slantAnimation
            }

            override fun onAnimationRepeat(animation: Animation?) {
            }
        })

        /*fadeOut.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                frameEnvelop.animation = slantAnimation
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })*/

        slantAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?) {
                baseActivity!!.onBackPressed()

            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
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
            R.id.tvOpenInvitationLBL -> {
                frameEnvelop.isClickable = true
                imgEnvelop.makeGone()
                imgOpenEnvelop.makeVisible()
                tvOpenInvitationLBL.makeGone()
            }
            R.id.frameEnvelop -> {
                replaceFragment(MeetSenderFragment(fromWhere), false)
            }
        }
    }
}