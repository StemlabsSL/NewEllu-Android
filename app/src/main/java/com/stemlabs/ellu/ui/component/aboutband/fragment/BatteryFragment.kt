package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.loginflow.LoginFlowActivity
import com.stemlabs.ellu.utils.Constants
import kotlinx.android.synthetic.main.noraml_toolbar.*


class BatteryFragment : BaseFragment(), View.OnClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_battery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Battery"
        initView()
    }

    private fun initView() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
        }
    }


}