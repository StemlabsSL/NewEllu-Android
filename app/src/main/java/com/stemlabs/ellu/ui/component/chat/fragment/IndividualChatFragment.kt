package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.IndividualChatHeaderModel
import com.stemlabs.ellu.data.model.IndividualChatModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog
import com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment
import com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatHeaderAdapter
import com.stemlabs.ellu.ui.component.chat.dialog.*

import com.stemlabs.ellu.ui.component.chat.medialinkdocs.MediaLinkDocsFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.ui.component.meet.fragment.MeetCardAnimationFragment
import com.stemlabs.ellu.ui.component.meet.fragment.MeetSenderFragment
import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment
import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityFragment
import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityMapFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.chat_toolbar.*
import kotlinx.android.synthetic.main.chat_toolbar.imgCall
import kotlinx.android.synthetic.main.chat_toolbar.imgLeftIcon
import kotlinx.android.synthetic.main.chat_toolbar.imgMore
import kotlinx.android.synthetic.main.chat_toolbar.imgNotification
import kotlinx.android.synthetic.main.chat_toolbar.imgVideo
import kotlinx.android.synthetic.main.fragment_add_alarm.*
import kotlinx.android.synthetic.main.fragment_individual_chat.*
import kotlinx.android.synthetic.main.fragment_individual_chat.llAction
import kotlinx.android.synthetic.main.layout_message_type.*
import java.util.*
import kotlin.collections.ArrayList


class IndividualChatFragment(var fromWhere: String) : BaseFragment(), View.OnClickListener {

    var chatList = ArrayList<IndividualChatHeaderModel>()
    lateinit var chatAdapter: IndividualChatHeaderAdapter
    var popUpChatItemDialog: PopUpChatItemDialog? = null
    var popUpReportChatDialog: ReportChatDialog? = null
    var popUpClearChatDialog: ReportChatDialog? = null
    var popUpBlockChatDialog: ReportChatDialog? = null
    var muteNotificationDialog: MuteNotificationDialog? = null
    var shareLocationDialog: ShareLocationDialog? = null
    var pagerDialog: PagerDialog? = null
    var isSearchEnable = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_individual_chat, container, false)
    }

    override fun initializeViewModel() {
    }

    override fun observeViewModel() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        initView()
    }

    private fun setData() {
        chatList.clear()
        var chatCustomerList = ArrayList<IndividualChatModel>()
        chatCustomerList.add(IndividualChatModel("Hello", "12:00 PM", "message", "customer"))
        chatCustomerList.add(IndividualChatModel("How are you? I am actually thinking meeting you near opera house!", "12:00 PM", "message", "customer"))
        chatCustomerList.add(IndividualChatModel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.", "12:04 PM", "message", "provider"))
        chatCustomerList.add(IndividualChatModel("Lorem ipsum dolor sit amet, consetetur sadipscing", "12:04 PM", "imagetext", "provider"))
        chatCustomerList.add(IndividualChatModel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ", "12:06 PM", "audio", "customer"))
        chatCustomerList.add(IndividualChatModel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ", "12:06 PM", "contact", "customer"))
        chatCustomerList.add(IndividualChatModel("Aware Sent", "12:06 PM", "aware", "customer"))
        chatCustomerList.add(IndividualChatModel("Sent a Pager", "12:06 PM", "pager", "customer"))
        chatCustomerList.add(IndividualChatModel("Adam Smith has sent you a SOS contact invitation", "12:06 PM", "sos", "customer"))

        if (fromWhere.equals("Group")) {
            chatCustomerList.add(IndividualChatModel("Angelina has sent a Proximity invitation to the group", "12:06 PM", "proximity", "customer"))
            chatCustomerList.add(IndividualChatModel("Proximity", "12:06 PM", "ProximityHeader", "customer"))
        }
        chatCustomerList.add(IndividualChatModel("Meeting in 20 mins", "12:06 PM", "meet", "customer"))
        chatCustomerList.add(IndividualChatModel("Meeting in 15 mins", "12:06 PM", "meet", "customer"))
        chatCustomerList.add(IndividualChatModel("Location", "12:06 PM", "location", "customer"))
        chatList.add(IndividualChatHeaderModel("October 24, 2020", chatCustomerList))

    }

    private fun initView() {
        popUpChatItemDialog = PopUpChatItemDialog()
        shareLocationDialog = ShareLocationDialog()
        muteNotificationDialog = MuteNotificationDialog()
        popUpReportChatDialog = ReportChatDialog("report")
        popUpClearChatDialog = ReportChatDialog("clear")
        popUpBlockChatDialog = ReportChatDialog("block")
        pagerDialog = PagerDialog()
        imgMore.setOnClickListener(this)
        imgNotification.setOnClickListener(this)
        imgPlusButton.setOnClickListener(this)
        frameAddAction.setOnClickListener(this)
        rvIndividualChat.apply {
            layoutManager = LinearLayoutManager(requireContext()).apply {
                stackFromEnd = true

            }
        }
        chatAdapter = IndividualChatHeaderAdapter(mutableListOf())
        chatAdapter.setChatClickEventListener(object : IndividualChatHeaderAdapter.OnSelectChatHeader {
            override fun getClickAt(outerposition: Int, innerposition: Int) {

                if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("proximity")) {
                    replaceFragment(ProximityFragment("search"), true)
                } else if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("ProximityHeader")) {
                    replaceFragment(ProximityMapFragment(), true)
                } else if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("aware")) {
                    replaceFragment(AwareSelectAPlaceFragment("Tracking"), true)
                } else if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("contact")) {
                    replaceFragment(ContactsAllSosPagerFragment(), true)
                } else if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("meet")) {
                    if (innerposition == (chatList.get(outerposition).arrayList.size - 2)) {
                        replaceFragment(MeetSenderFragment("Created"), true)
                    } else {
                        replaceFragment(MeetCardAnimationFragment("Receiver"), true)
                    }
                } else if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("message") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("imagetext") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("audio")) {
                    openChatAction()
                }
            }

            override fun getSwipeEvent(outerposition: Int, innerposition: Int) {
                if (chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("message") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("imagetext") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("audio") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("contact") || chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("proximity")|| chatList.get(outerposition).arrayList.get(innerposition).messageType.equals("sos")) {
                    llReplyChat.makeVisible()
                }
            }
        })
        rvIndividualChat.adapter = chatAdapter
        chatAdapter.updateList(chatList)
        imgCall.setOnClickListener(this)
        imgVideo.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        imgLeftIconSearch.setOnClickListener(this)
        llFiles.setOnClickListener(this)
        llLocation.setOnClickListener(this)
        llContact.setOnClickListener(this)
        llAware.setOnClickListener(this)
        imgUserProfile.setOnClickListener(this)
        llLetMeet.setOnClickListener(this)
        imgClose.setOnClickListener(this)
        if (fromWhere.equals("Group")) {
            imgFiles.setImageResource(R.drawable.ic_transmitter_gradient_badge)
            tvFiles.setText("Proximity")
            tvUserName.setText("Friends")
            imgUserProfile.setImageResource(R.drawable.ic_group_default_chat)
            imgNotification.makeGone()
        }

        if (fromWhere.contains("OpenBottomSheet")) {
            llAction.tag = "visible"
            imgPlusButton.rotation = 45.0f
            llAction.makeVisible()
        }
    }

    private fun openChatAction() {
        if (popUpChatItemDialog != null && popUpChatItemDialog!!.isAdded()) {
            return;
        }
        popUpChatItemDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        popUpChatItemDialog!!.setChatPopUpListener(object : PopUpChatItemDialog.OnClickChatPopUp {
            override fun setClickPopUp(position: Int) {
                if (position == 0) {
                    llReplyChat.makeVisible()
                }
            }
        })


    }

    private fun openShareLocation() {
        if (shareLocationDialog != null && shareLocationDialog!!.isAdded()) {
            return;
        }
        shareLocationDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        shareLocationDialog!!.setShareLocationListener(object : ShareLocationDialog.OnClickShareLocation {
            override fun setOKOnClickOnClickShareLocation() {
            }
        })
    }


    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgVideo -> {

                replaceFragment(VideoCallFragment("video"), true)
            }
            R.id.imgCall -> {

                replaceFragment(VideoCallFragment(), true)
            }
            R.id.imgClose -> {
                llReplyChat.makeGone()
            }
            R.id.imgLeftIcon -> {
                /*if (edtSearch.visibility == View.VISIBLE) {
                    isSearchEnable = false
                    llProfile.makeGone()
                    llSearch.makeVisible()

                } else {
                }*/
                baseActivity!!.onBackPressed()

            }

            R.id.frameAddAction -> {
                imgPlusButton.performClick()
            }

            R.id.imgLeftIconSearch -> {
                llProfile.makeVisible()
                llSearch.makeGone()
            }

            R.id.imgPlusButton -> {
                if (TextUtils.isEmpty(llAction.tag.toString())) {
                    llAction.tag = "visible"
                    imgPlusButton.rotation = 45.0f
                    llAction.makeVisible()
                } else {
                    llAction.tag = ""
                    imgPlusButton.rotation = 0.0f
                    llAction.makeGone()
                }
            }
            R.id.llFiles -> {
                if (fromWhere.equals("Group")) {
                    llAction.tag = ""
                    imgPlusButton.rotation = 0.0f
                    llAction.makeGone()
                    replaceFragment(ProximityFragment("add"), true)
                }
            }
            R.id.llLocation -> {
                llAction.tag = ""
                imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                addFragment(ShareLocationFragment(), true)
                //openShareLocation()
            }
            R.id.llContact -> {
                llAction.tag = ""
                imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                replaceFragment(NewGroupFragment("IndividualChat"), true)
            }

            R.id.llLetMeet -> {
                llAction.tag = ""
                imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                addFragment(MeetSenderFragment("Sender"), true)
            }
            R.id.llAware -> {
                llAction.tag = ""
                imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                addFragment(AwareFragment(), true)
            }

            R.id.imgUserProfile -> {
                replaceFragment(StoryBoardFragment(), true)
            }

            R.id.imgNotification -> {
                addFragment(PagerFragment(), true)
                /* if (pagerDialog != null && pagerDialog!!.isAdded()) {
                     return;
                 }
                 pagerDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                 pagerDialog!!.setChatPopUpListener(object : PagerDialog.OnClickChatPopUp {
                     override fun setClickPopUp() {
                     }
                 })*/
            }
            R.id.imgMore -> {

                val popupMenu = PopupMenu(baseActivity, imgMore)
                popupMenu.menuInflater.inflate(R.menu.menu_more_chat, popupMenu.menu)
                var actionMore = popupMenu.menu.getItem(3)
                actionMore.subMenu.clearHeader()

                //itemPrice.setTitle("" + repo.labelPref.LBL_PRICE)
                /*var itemRating = popupMenu.menu.getItem(1)
                itemRating.setTitle("" + repo.labelPref.LBL_RATING)*/

                popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                    when (item.itemId) {
                        R.id.actionMuteNotification -> {
                            openMuteNotificationDialog()
                        }
                        R.id.actionMore -> {
                            // openPopUpMoreMenu(imgMore)
                        }
                        R.id.actionSearch -> {
                            isSearchEnable = true
                            llProfile.makeGone()
                            llSearch.makeVisible()
                        }

                        R.id.actionReport -> {
                            openReportDialog()
                        }

                        R.id.actionBlock -> {
                            openBlockUserDialog()
                        }
                        R.id.actionClearChat -> {
                            openClearChatDialog()
                        }


                        R.id.actionMediaLinks -> {
                            replaceFragment(MediaLinkDocsFragment(), true)
                        }
                        /* R.id.action_price -> {
                             Collections.sort(
                                     payload
                                     , MotoTaxiBidderListResponse.Payload.filterPriceComperator
                             )
                             binding.vmMotoAvailableDrivers!!.adapter!!.insert(payload.toMutableList())
                         }
                         R.id.action_rating -> {
                             Collections.sort(
                                     payload
                                     , MotoTaxiBidderListResponse.Payload.filterRatingComperator
                             )
                             binding.vmMotoAvailableDrivers!!.adapter!!.insert(payload.toMutableList())
                         }*/
                    }
                    true
                })
                popupMenu.show()
            }
        }
    }

    private fun openPopUpMoreMenu(actionMore: View) {
        val popupMenu = PopupMenu(baseActivity, actionMore)
        popupMenu.menuInflater.inflate(R.menu.menu_more_chat_more, popupMenu.menu)
        /*var itemPrice = popupMenu.menu.getItem(0)
        itemPrice.setTitle("" + repo.labelPref.LBL_PRICE)
        var itemRating = popupMenu.menu.getItem(1)
        itemRating.setTitle("" + repo.labelPref.LBL_RATING)*/
        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            when (item.itemId) {


            }
            true
        })
        popupMenu.show()
    }

    private fun openReportDialog() {
        if (popUpReportChatDialog != null && popUpReportChatDialog!!.isAdded()) {
            return;
        }
        popUpReportChatDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        popUpReportChatDialog!!.setReportChatPopUpListener(object : ReportChatDialog.OnClickReport {
            override fun setOKOnClickReport(isBlockContact: Boolean) {

            }

        })
    }

    private fun openClearChatDialog() {
        if (popUpClearChatDialog != null && popUpClearChatDialog!!.isAdded()) {
            return;
        }
        popUpClearChatDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        popUpClearChatDialog!!.setReportChatPopUpListener(object : ReportChatDialog.OnClickReport {
            override fun setOKOnClickReport(isBlockContact: Boolean) {

            }

        })
    }

    private fun openBlockUserDialog() {
        if (popUpBlockChatDialog != null && popUpBlockChatDialog!!.isAdded()) {
            return;
        }
        popUpBlockChatDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        popUpBlockChatDialog!!.setReportChatPopUpListener(object : ReportChatDialog.OnClickReport {
            override fun setOKOnClickReport(isBlockContact: Boolean) {

            }

        })
    }

    private fun openMuteNotificationDialog() {
        if (muteNotificationDialog != null && muteNotificationDialog!!.isAdded()) {
            return;
        }
        muteNotificationDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        muteNotificationDialog!!.setChatPopUpListener(object : MuteNotificationDialog.OnClickMuteNotification {
            override fun setOKOnClickMuteNotification(muteFor: String, isShowNotification: Boolean) {

            }

        })
    }
}