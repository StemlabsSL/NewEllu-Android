package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog
import kotlinx.android.synthetic.main.fragment_about_band_detail.*
import kotlinx.android.synthetic.main.fragment_add_alarm.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class AboutBandDetailFragment : BaseFragment(), View.OnClickListener {

    lateinit var deviceNameDialog: AlarmNameDialog
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_band_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        deviceNameDialog = AlarmNameDialog("devicename","devicename")
        llResetBand.setOnClickListener(this)
        llDeviceName.setOnClickListener(this)
        llTips.setOnClickListener(this)
        llUpdateBand.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "About Band"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.llResetBand -> {
                replaceFragment(ResetBandFragment(), true)
            }
            R.id.llTips -> {
                replaceFragment(TipsDetailFragment(), true)
            }
            R.id.llDeviceName -> {
                if (deviceNameDialog != null && deviceNameDialog!!.isAdded()) {
                    return;
                }
                deviceNameDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                deviceNameDialog!!.setRedeemListener(object : AlarmNameDialog.OnClickSet {
                    override fun setClickSet(name: String) {
                        tvUsernameBand.text = name
                    }
                })

            }
            R.id.llUpdateBand -> {
                replaceFragment(UpdateBandFragment(""), true)

            }
        }
    }
}