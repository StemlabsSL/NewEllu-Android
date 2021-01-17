package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_pager.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class PagerFragment : BaseFragment() {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        tvSendLBL.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
    }

}