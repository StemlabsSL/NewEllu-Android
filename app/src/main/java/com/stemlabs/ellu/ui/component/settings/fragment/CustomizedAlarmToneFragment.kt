package com.stemlabs.ellu.ui.component.settings.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedVibrationModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.settings.adapter.CustomizeVibrationAdapter
import kotlinx.android.synthetic.main.fragment_customized_alarm_tone.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class CustomizedAlarmToneFragment : BaseFragment(), View.OnClickListener {

    lateinit var customizeVibrationAdapter: CustomizeVibrationAdapter
    var vibrationToneList = ArrayList<CustomizedVibrationModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_customized_alarm_tone, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        setHeader()
        tvSetLBL.setOnClickListener(this)
        customizeVibrationAdapter = CustomizeVibrationAdapter(mutableListOf())
        customizeVibrationAdapter.setVibrationListener(object : CustomizeVibrationAdapter.OnClickVibration {
            override fun setClickVibrationAt(position: Int) {
                if (vibrationToneList.size > 0) {
                    for (i in vibrationToneList.indices) {
                        if (position == i) {

                            if (!vibrationToneList.get(position).isClicked) {
                                vibrationToneList.get(position).isClicked = true
                            } else {
                                vibrationToneList.get(position).isClicked = false
                            }
                        } else {
                            vibrationToneList.get(i).isClicked = false
                        }
                        customizeVibrationAdapter.notifyDataSetChanged()

                    }
                }
            }
        })
        vibrationToneList = CustomizedVibrationModel.getVibrationList()
        customizeVibrationAdapter.updateList(vibrationToneList)
        rvVibrationPattern.adapter = customizeVibrationAdapter

    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Vibration Pattern"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tvSetLBL -> baseActivity!!.onBackPressed()
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
        }
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }
}