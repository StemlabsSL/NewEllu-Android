package com.stemlabs.ellu.ui.component.aware.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_aware.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class AwareFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_aware, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun initView() {
        tvToolbarTitle.text = "Aware"
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        edtPickAPlace.setOnClickListener(View.OnClickListener {
            replaceFragment(AwareSelectAPlaceFragment("Place Selected"), false)
        })
    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }

    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }
}