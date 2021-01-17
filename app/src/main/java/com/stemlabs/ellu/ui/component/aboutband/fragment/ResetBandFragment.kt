package com.stemlabs.ellu.ui.component.aboutband.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_reset_band.*
import kotlinx.android.synthetic.main.noraml_toolbar.*

class ResetBandFragment : BaseFragment(),View.OnClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_reset_band, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun initView() {
        tvResetBandLBL.setOnClickListener(this)

    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text= "Reset Band"
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.imgLeftIcon->{
                baseActivity!!.onBackPressed()
            }
            R.id.tvResetBandLBL->{
                baseActivity!!.onBackPressed()
            }
        }
    }


}