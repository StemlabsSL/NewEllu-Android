package com.stemlabs.ellu.ui.component.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.calendar.fragment.AddNewEventFragment
import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment
import com.stemlabs.ellu.ui.component.chat.fragment.VideoCallFragment
import com.stemlabs.ellu.ui.component.home.adapter.CallLogAdapter
import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment
import com.stemlabs.ellu.ui.model.CallLogModel
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_call_log.*
import kotlinx.android.synthetic.main.fragment_main_chat.*
import kotlinx.android.synthetic.main.profile_toolbar.*

class CallLogFragment : BaseFragment(), View.OnClickListener {

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call_log, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (baseActivity as HomeActivity).setBottomVisibility()
        imgProfile.visibility = View.GONE
        imgChatToolbarUserProfile.setOnClickListener(this)
        imgSearch.setOnClickListener(this)
        imgClose.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        //(baseActivity as HomeActivity).bottomNavigation.visibility = View.VISIBLE
        var callLogList = ArrayList<CallLogModel>()
        callLogList.addAll(CallLogModel.getCallLogList())
        var callLogAdapter = CallLogAdapter(mutableListOf())
        callLogAdapter.setCallLogClickListener(object : CallLogAdapter.CallLogClick {
            override fun itemClickAt(position: Int) {
                replaceFragment(VideoCallFragment(), true)

            }

            override fun phoneClickAt(position: Int) {
                replaceFragment(VideoCallFragment(), true)

            }

            override fun videoClickAt(position: Int) {
                replaceFragment(VideoCallFragment("video"), true)

            }
        })
        rvCallLog.adapter = callLogAdapter

        callLogAdapter.updateList(callLogList)
        imgAddCall.setOnClickListener(View.OnClickListener {
            replaceFragment(NewGroupFragment("call"), true)
        })
    }


    override fun onDestroyView() {
        super.onDestroyView()
        (baseActivity as HomeActivity).setBottomVisibility(false)
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgChatToolbarUserProfile -> {
                (baseActivity as HomeActivity).drawerOpen()
            }

            R.id.imgSearch -> {
                llSearchToolbar.makeVisible()
                llProfileToolbar.makeGone()
            }
            R.id.imgClose -> {
                llSearchToolbar.makeGone()
                llProfileToolbar.makeVisible()
            }
            R.id.imgLeftIcon -> {
                llSearchToolbar.makeGone()
                llProfileToolbar.makeVisible()
            }
        }
    }
}