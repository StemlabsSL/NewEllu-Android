package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_add_new_contact.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class AddNewContactFragment : BaseFragment() ,View.OnClickListener{



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_new_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        tvSaveLBL.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Add New Contact"
    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {


    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.tvSaveLBL->{
                baseActivity!!.onBackPressed()
            }
            R.id.imgLeftIcon->{
                baseActivity!!.onBackPressed()
            }
        }
    }
}