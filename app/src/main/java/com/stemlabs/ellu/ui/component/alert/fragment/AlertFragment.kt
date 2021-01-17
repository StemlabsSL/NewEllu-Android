package com.stemlabs.ellu.ui.component.alert.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.AlertHeaderModel
import com.stemlabs.ellu.data.model.AlertModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alert.adapter.AlertHeaderAdapter
import com.stemlabs.ellu.ui.component.chat.fragment.ContactsAllSosPagerFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import kotlinx.android.synthetic.main.fragment_alert.*
import kotlinx.android.synthetic.main.profile_toolbar.*


class AlertFragment : BaseFragment(), View.OnClickListener {

    var alertHeaderList = ArrayList<AlertHeaderModel>()
    var alertList = ArrayList<AlertModel>()
    var alert2List = ArrayList<AlertModel>()
    lateinit var alertHeaderAdapter: AlertHeaderAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alert, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        (baseActivity as HomeActivity).setBottomVisibility()
        imgChatToolbarUserProfile.setOnClickListener(this)
        imgProfile.setOnClickListener(this)
        alertHeaderList.clear()
        alertList.clear()
        alert2List.clear()
        alertList.add(AlertModel(R.drawable.ic_men_sample_one, ContextCompat.getColor(baseActivity!!, R.color.colorEDD425), R.drawable.ic_location_alert, "John Smith", "Shared Location", "Here is my Location!", "Now"))
        alertList.add(AlertModel(R.drawable.ic_women_sample_one, ContextCompat.getColor(baseActivity!!, R.color.color00BB31), R.drawable.ic_notification_alert, "Jane Doe", "Sent Pager", "Message", "2 mins ago"))
        alertList.add(AlertModel(R.drawable.ic_men_sample_three, ContextCompat.getColor(baseActivity!!, R.color.colorF28D98), R.drawable.ic_meet_alert, "Eric", "Sent Let's Meet", "Here Let's meet at Starbucks.", "2 Hours"))
        alert2List.add(AlertModel(R.drawable.ic_men_sample_three, ContextCompat.getColor(baseActivity!!, R.color.transparent), R.drawable.ic_falg_alert, "Eric", "Sent Aware", "I am going to haunted house!", "2 Hours"))
        alertHeaderList.add(AlertHeaderModel("Today", alertList))
        alertHeaderList.add(AlertHeaderModel("October 24,2020", alert2List))
        alertHeaderAdapter = AlertHeaderAdapter(mutableListOf())
        alertHeaderAdapter.getClickAt(object : AlertHeaderAdapter.OnSwipeEvent {
            override fun swipeEventAt(outerPosition: Int, innerPosition: Int) {
                if (alertHeaderList.size > 0) {
                    alertHeaderList.get(outerPosition).arrayList.removeAt(innerPosition)
                    if (alertHeaderList.get(outerPosition).arrayList.size == 0) {
                        alertHeaderList.removeAt(outerPosition)
                    }
                    alertHeaderAdapter.updateList(alertHeaderList)
                }
            }
        })
        rvAlert.adapter = alertHeaderAdapter
        alertHeaderAdapter.updateList(alertHeaderList)
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgChatToolbarUserProfile -> {
                (baseActivity as HomeActivity).drawerOpen()
            }
            R.id.imgProfile -> {
                replaceFragment(ContactsAllSosPagerFragment(), true)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        (baseActivity as HomeActivity).setBottomVisibility(false)

    }
}