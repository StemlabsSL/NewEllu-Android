package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.ViewModelFactory
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.fragment.ContactsAllSosPagerFragment
import com.stemlabs.ellu.ui.component.customize.fragment.CustomizeBandFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.home.LinkFragment
import com.stemlabs.ellu.ui.component.sos.SosFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_about_band.*
import kotlinx.android.synthetic.main.profile_toolbar.*
import javax.inject.Inject

class AboutBandFragment : BaseFragment(), View.OnClickListener {
    private var rotation: Animation? = null
    private var zoomInzoomOut: Animation? = null
    var isStartedAnimated = true

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

//    lateinit var aboutBandViewModel: AboutBandViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_about_band, container, false)

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        imgChatToolbarUserProfile.setOnClickListener(this)
        llMick.setOnClickListener(this)
        imgProfile.setOnClickListener(this)
        if (rotation == null) {
            rotation = AnimationUtils.loadAnimation(context, R.anim.zoom_image)
            zoomInzoomOut = AnimationUtils.loadAnimation(context, R.anim.zoom_in_zoom_out)
            rotation!!.setRepeatCount(Animation.INFINITE)
            zoomInzoomOut!!.setRepeatCount(Animation.INFINITE)
        }


        (baseActivity as HomeActivity).setBottomVisibility()

        llLink.setOnClickListener(View.OnClickListener {
            replaceFragment(LinkFragment(), true)
        })
        llCustomize.setOnClickListener(View.OnClickListener {
            replaceFragment(CustomizeBandFragment(), true)
        })

        llAboutBand.setOnClickListener(View.OnClickListener {
            replaceFragment(AboutBandDetailFragment(), true)
        })
        llSOS.setOnClickListener(View.OnClickListener {
            replaceFragment(SosFragment(""), true)

        })
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onDestroyView() {
        super.onDestroyView()
        (baseActivity as HomeActivity).setBottomVisibility(false)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgChatToolbarUserProfile -> {
                (baseActivity as HomeActivity).drawerOpen()
            }
            R.id.imgProfile -> {
                replaceFragment(ContactsAllSosPagerFragment(), true)
            }

            R.id.llMick -> {
                if (isStartedAnimated) {
                    isStartedAnimated = false
                    startAnimation()
                } else {
                    isStartedAnimated = true
                    stopAnimation()
                }
            }

        }
    }

    fun startAnimation() {
        imgMicrophone.makeGone()
        imgRingView.makeVisible()
        imgAudioAnimate.makeVisible()
        imgRingView.startAnimation(rotation)
        imgAudioAnimate.startAnimation(zoomInzoomOut)
    }

    fun stopAnimation() {
        imgRingView.clearAnimation()
        imgAudioAnimate.clearAnimation()
        imgMicrophone.makeVisible()
        imgRingView.makeGone()
        imgAudioAnimate.makeGone()

    }

}