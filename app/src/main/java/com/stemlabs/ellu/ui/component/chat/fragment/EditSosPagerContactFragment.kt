package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ContactHeaderModel
import com.stemlabs.ellu.data.model.ContactModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter
import kotlinx.android.synthetic.main.fragment_edit_sos_pager_contact.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class EditSosPagerContactFragment(var fromWhere: String) : BaseFragment(), View.OnClickListener {

    var contactHeaderList = ArrayList<ContactHeaderModel>()
    lateinit var contactHeaderAdapter: ContactHeaderAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_sos_pager_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun initView() {
        contactHeaderAdapter = ContactHeaderAdapter(mutableListOf(), "EditContact")
        contactHeaderAdapter.setContactClickEventListener(object : ContactHeaderAdapter.OnSelectContact {
            override fun getProfileClickedAt(outerPosition: Int, innerPosition: Int) {
                //replaceFragment(StoryBoardFragment(), true)
            }

            override fun getRowClickedAt(outerPosition: Int, innerPosition: Int) {
               // replaceFragment(SOSProfileFragment(), true)

            }

            override fun getNotificationClickedAt(outerPosition: Int, innerPosition: Int) {

            }

            override fun getSOSClickedAt(outerPosition: Int, innerPosition: Int) {

            }

            override fun getRadioClickedAt(outerPosition: Int, innerPosition: Int) {
                contactHeaderList.get(outerPosition).contactList.get(innerPosition).isChecked = !contactHeaderList.get(outerPosition).contactList.get(innerPosition).isChecked
                contactHeaderAdapter.notifyDataSetChanged()
            }
        })
        rvEditContact.adapter = contactHeaderAdapter
        updateRecyclearView()
    }

    private fun updateRecyclearView() {
        var contactOneList = ArrayList<ContactModel>()
        var contactTwoList = ArrayList<ContactModel>()
        contactHeaderList.clear()
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_two, "Andrew James", false, false, false))
        contactOneList.add(ContactModel(R.drawable.ic_women_sample_two, "Adam Smith", false, false, false))
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_three, "Angelina Julius", false, false, false))

        contactTwoList.add(ContactModel(R.drawable.ic_women_sample_one, "Beatrice Bane", false, false, false))
        contactTwoList.add(ContactModel(R.drawable.ic_men_sample_two, "Brian Cook", false, false, false))
        contactTwoList.add(ContactModel(R.drawable.ic_women_sample_two, "Brandon Austin", false, false, false))


        contactHeaderList.add(ContactHeaderModel("A", contactOneList))
        contactHeaderList.add(ContactHeaderModel("B", contactTwoList))
        contactHeaderAdapter.updateList(contactHeaderList)
    }

    private fun setHeader() {
        if (fromWhere.equals("SOS")) {
            tvToolbarTitle.text = "Edit SOS Contacts"
        } else {
            tvToolbarTitle.text = "Edit Pager Contacts"
        }
        imgLeftIcon.setOnClickListener(this)
        tvSaveChangesLBL.setOnClickListener(this)
        llSelectAllContact.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.tvSaveChangesLBL -> {
                baseActivity!!.onBackPressed()
            }
            R.id.llSelectAllContact -> {
                if (TextUtils.isEmpty(llSelectAllContact.tag.toString())) {
                    llSelectAllContact.tag = "clicked"
                    imgRadioButton.setImageResource(R.drawable.ic_contact_check)
                    for (objout in contactHeaderList) {
                        for (objin in objout.contactList) {
                            objin.isChecked = true
                        }
                    }
                    contactHeaderAdapter.notifyDataSetChanged()

                } else {
                    llSelectAllContact.tag = ""
                    imgRadioButton.setImageResource(R.drawable.ic_contact_uncheck)
                    for (objout in contactHeaderList) {
                        for (objin in objout.contactList) {
                            objin.isChecked = false
                        }
                    }
                    contactHeaderAdapter.notifyDataSetChanged()
                }
            }
        }
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

}