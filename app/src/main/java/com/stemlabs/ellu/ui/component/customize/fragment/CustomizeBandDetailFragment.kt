package com.stemlabs.ellu.ui.component.customize.fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.settings.fragment.CustomizedAlarmToneFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_customize_band_detail.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class CustomizeBandDetailFragment(var fromWhere: String,var headerDrawable: Int) : BaseFragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_customize_band_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        tvToolbarTitle.text = "" + fromWhere
        imgLeftIcon.setOnClickListener(this)
    }

    private fun initView() {
        llVibrationIntensity.setOnClickListener(this)
        llVibrationPattern.setOnClickListener(this)
        //imgCustomizedBandFrom.setImageResource(headerDrawable)
        when (fromWhere) {
            "Alarm" -> {
                imgCustomizedBandFrom.setImageResource(R.drawable.ic_customized_alarm_transparent)

            }
            "Timer" -> {
                imgCustomizedBandFrom.setImageResource(R.drawable.ic_customized_timer_transparent)
            }
            "Calendar" -> {
                imgCustomizedBandFrom.setImageResource(R.drawable.ic_customized_calendar_transparent)
            }
            "Alert" -> {
                imgCustomizedBandFrom.setImageResource(R.drawable.ic_customized_alert_transparent)
            }
            "Messages" -> {
                imgCustomizedBandFrom.setImageResource(R.drawable.ic_customized_chat_transparent)
            }
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.llVibrationIntensity -> {
                if (TextUtils.isEmpty(llVibrationIntensity.tag.toString())) {
                    llVibrationIntensity.tag = "clicked"
                    imgVibrationIntensityArrow.rotation = 270.0f
                    seekbarVibrationIntensity.makeVisible()
                } else {
                    llVibrationIntensity.tag = ""
                    imgVibrationIntensityArrow.rotation = 90.0f
                    seekbarVibrationIntensity.makeGone()
                }
            }
            R.id.llVibrationPattern -> {
                replaceFragment(CustomizedAlarmToneFragment(), true)
            }
        }

    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


}