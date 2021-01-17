package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ContactHeaderModel
import com.stemlabs.ellu.data.model.ContactModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.adapter.ContactHeaderAdapter
import kotlinx.android.synthetic.main.fragment_contacts_all_sos_pager.*
import kotlinx.android.synthetic.main.noraml_toolbar.*

class ContactsAllSosPagerFragment : BaseFragment(), View.OnClickListener {

    var contactHeaderList = ArrayList<ContactHeaderModel>()
    lateinit var contactHeaderAdapter: ContactHeaderAdapter
    var status: String = "All"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts_all_sos_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun initView() {
        imgAllContact.setOnClickListener(this)
        imgSOS.setOnClickListener(this)
        imgPager.setOnClickListener(this)
        llAddNewContact.setOnClickListener(this)

        contactHeaderAdapter = ContactHeaderAdapter(mutableListOf(), "ContactsAllSoSPager")
        contactHeaderAdapter.setContactClickEventListener(object : ContactHeaderAdapter.OnSelectContact {
            override fun getProfileClickedAt(outerPosition: Int, innerPosition: Int) {
                //replaceFragment(StoryBoardFragment(), true)
            }

            override fun getRowClickedAt(outerPosition: Int, innerPosition: Int) {
                replaceFragment(SOSProfileFragment(), true)
            }

            override fun getNotificationClickedAt(outerPosition: Int, innerPosition: Int) {

            }

            override fun getSOSClickedAt(outerPosition: Int, innerPosition: Int) {

            }

            override fun getRadioClickedAt(outerPosition: Int, innerPosition: Int) {

            }
        })
        rvAllSOSPagerContact.adapter = contactHeaderAdapter
        setAllContactsData()
    }


    private fun setHeader() {
        tvToolbarTitle.text = "All Contacts"
        imgLeftIcon.setOnClickListener(this)

    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.imgAllContact -> {
                status = "All"
                imgAllContact.setImageResource(R.drawable.ic_person_blue_contact)
                imgSOS.setImageResource(R.drawable.ic_sos_grey_contact)
                imgPager.setImageResource(R.drawable.ic_notification_grey_contact)
                tvToolbarTitle.text = "All Contacts"
                tvAddNewContactLBL.text = "Add New Contact"
                setAllContactsData()

            }
            R.id.imgSOS -> {
                status = "SOS"

                imgAllContact.setImageResource(R.drawable.ic_person_grey_contact)
                imgSOS.setImageResource(R.drawable.ic_sos_blue_contact)
                imgPager.setImageResource(R.drawable.ic_notification_grey_contact)
                tvToolbarTitle.text = "SOS Contacts"
                tvAddNewContactLBL.text = "Edit SOS Contacts"
                setSOSData()


            }
            R.id.imgPager -> {
                status = "Pager"
                imgAllContact.setImageResource(R.drawable.ic_person_grey_contact)
                imgSOS.setImageResource(R.drawable.ic_sos_grey_contact)
                imgPager.setImageResource(R.drawable.ic_notification_blue_contact)
                tvToolbarTitle.text = "Pager Contacts"
                tvAddNewContactLBL.text = "Edit Pager Contacts"
                setPagerData()
            }
            R.id.llAddNewContact -> {
                if (status.equals("All")) {
                    replaceFragment(AddNewContactFragment(), true)
                } else {
                    replaceFragment(EditSosPagerContactFragment(status), true)
                }
            }
        }
    }

    private fun setSOSData() {
        var contactOneList = ArrayList<ContactModel>()
        var contactTwoList = ArrayList<ContactModel>()
        contactHeaderList.clear()
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_three, "Adam Smith", false, true))
        contactOneList.add(ContactModel(R.drawable.ic_women_sample_two, "Beatrice Bane", false, true))
        contactTwoList.add(ContactModel(R.drawable.ic_men_sample_one, "Brandon Austin", false, true))
        contactHeaderList.add(ContactHeaderModel("A", contactOneList))
        contactHeaderList.add(ContactHeaderModel("B", contactTwoList))
        contactHeaderAdapter.updateList(contactHeaderList)
    }

    private fun setPagerData() {
        var contactOneList = ArrayList<ContactModel>()
        var contactTwoList = ArrayList<ContactModel>()
        contactHeaderList.clear()
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_one, "Adam Smith", true))
        contactTwoList.add(ContactModel(R.drawable.ic_women_sample_one, "Beatrice Bane", true))
        contactTwoList.add(ContactModel(R.drawable.ic_men_sample_three, "Brandon Austin", true))
        contactHeaderList.add(ContactHeaderModel("A", contactOneList))
        contactHeaderList.add(ContactHeaderModel("B", contactTwoList))
        contactHeaderAdapter.updateList(contactHeaderList)
    }

    private fun setAllContactsData() {
        var contactOneList = ArrayList<ContactModel>()
        var contactTwoList = ArrayList<ContactModel>()
        contactHeaderList.clear()
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_two, "Andrew James", false, false))
        contactOneList.add(ContactModel(R.drawable.ic_women_sample_two, "Adam Smith", true, true))
        contactOneList.add(ContactModel(R.drawable.ic_men_sample_three, "Angelina Julius", false, true))

        contactTwoList.add(ContactModel(R.drawable.ic_women_sample_one, "Beatrice Bane", true, false))
        contactTwoList.add(ContactModel(R.drawable.ic_men_sample_two, "Brian Cook", false, false))
        contactTwoList.add(ContactModel(R.drawable.ic_women_sample_two, "Brandon Austin", true, true))


        contactHeaderList.add(ContactHeaderModel("A", contactOneList))
        contactHeaderList.add(ContactHeaderModel("B", contactTwoList))
        contactHeaderAdapter.updateList(contactHeaderList)
    }

}