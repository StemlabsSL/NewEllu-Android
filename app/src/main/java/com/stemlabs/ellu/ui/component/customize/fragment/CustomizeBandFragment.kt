package com.stemlabs.ellu.ui.component.customize.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedBandModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.customize.adapter.CustomizedBandAdapter
import kotlinx.android.synthetic.main.fragment_customize_band.*
import kotlinx.android.synthetic.main.noraml_toolbar.*

class CustomizeBandFragment : BaseFragment(), View.OnClickListener {

    var customizedBandList = ArrayList<CustomizedBandModel>()
    lateinit var customizedBandAdapter: CustomizedBandAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_customize_band, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Customize Band"
    }

    private fun initView() {
        customizedBandList = CustomizedBandModel.getCustomizedBandList()
        customizedBandAdapter = CustomizedBandAdapter(mutableListOf())
        customizedBandAdapter.setClickListener(object : CustomizedBandAdapter.OnSelect {
            override fun getClickAt(position: Int) {
                replaceFragment(CustomizeBandDetailFragment(customizedBandList.get(position).customizedBandTitle,customizedBandList.get(position).imgCustomizedBand),true)
            }

            override fun getSwitchClickedAt(position: Int) {
                customizedBandList.get(position).isClicked=!customizedBandList.get(position).isClicked
                customizedBandAdapter.notifyDataSetChanged()
            }
        })
        rvCustomizeBand.adapter = customizedBandAdapter
        customizedBandAdapter.updateList(customizedBandList)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
        }
    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

}