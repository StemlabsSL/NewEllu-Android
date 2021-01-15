package com.stemlabs.ellu.ui.component.newgroup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.newgroup.adapter.ContactSendAdapter
import kotlinx.android.synthetic.main.fragment_contacts_to_send.*
import kotlinx.android.synthetic.main.noraml_toolbar.*

class ContactsToSendFragment : BaseFragment(), View.OnClickListener {
    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts_to_send, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setHeader()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        imgContactSend.setOnClickListener(this)
        tvToolbarTitle.text = "Contacts to Send"
    }

    private fun initView() {
        var adapter = ContactSendAdapter()
        rvContactSend.adapter = adapter
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.imgContactSend -> {
                baseActivity!!.onBackPressed()
            }
        }
    }


}