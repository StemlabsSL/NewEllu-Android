package com.stemlabs.ellu.ui.component.sos

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.IndividualChatHeaderModel
import com.stemlabs.ellu.data.model.IndividualChatModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment
import com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatHeaderSosAdapter
import com.stemlabs.ellu.ui.component.chat.adapter.IndividualChatSosAdapter
import com.stemlabs.ellu.ui.component.chat.dialog.*
import com.stemlabs.ellu.ui.component.chat.fragment.ShareLocationFragment
import com.stemlabs.ellu.ui.component.chat.fragment.VideoCallFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.MediaLinkDocsFragment
import com.stemlabs.ellu.ui.component.proximity.fragment.ProximityFragment
import com.stemlabs.ellu.ui.component.sos.dialog.SosEndOverlayDialog
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.chat_toolbar_sos.*
import kotlinx.android.synthetic.main.chat_toolbar_sos.edtSearch
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgCall
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgLeftIcon
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgLeftIconSearch
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgMore
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgNotification
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgOnline
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgUserProfile
import kotlinx.android.synthetic.main.chat_toolbar_sos.imgVideo
import kotlinx.android.synthetic.main.chat_toolbar_sos.llSearch
import kotlinx.android.synthetic.main.chat_toolbar_sos.tvUserName
import kotlinx.android.synthetic.main.chat_toolbar_sos.viewDivider
import kotlinx.android.synthetic.main.fragment_sos.*
import kotlinx.android.synthetic.main.layout_message_type.*
import kotlin.collections.ArrayList


class SosFragment(var fromWhere: String) : BaseFragment(), View.OnClickListener {

    var chatList = ArrayList<IndividualChatHeaderModel>()
    lateinit var chatAdapter: IndividualChatHeaderSosAdapter
    var popUpChatItemDialog: PopUpChatItemDialog? = null
    var pagerDialog: PagerDialog? = null
    var sosEndDialog: SosEndOverlayDialog? = null
    var popUpReportChatDialog: ReportChatDialog? = null
    var shareLocationDialog: ShareLocationDialog? = null
    var popUpClearChatDialog: ReportChatDialog? = null
    var popUpBlockChatDialog: ReportChatDialog? = null
    var muteNotificationDialog: MuteNotificationDialog? = null
    var isSearchEnable = false


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sos, container, false)
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
        chatCustomerList.add(IndividualChatModel("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed ", "12:06 PM", "audio", "customer"))
        chatList.add(IndividualChatHeaderModel("SOS MAP", chatCustomerList))
    }

    private fun initView() {
        shareLocationDialog = ShareLocationDialog()
        muteNotificationDialog = MuteNotificationDialog()
        popUpReportChatDialog = ReportChatDialog("report")
        popUpClearChatDialog = ReportChatDialog("clear")
        popUpBlockChatDialog = ReportChatDialog("block")
        sosEndDialog = SosEndOverlayDialog()
        popUpChatItemDialog = PopUpChatItemDialog()
        pagerDialog = PagerDialog()
        imgMore.setOnClickListener(this)
        imgNotification.setOnClickListener(this)
        rvIndividualChat.apply {
            layoutManager = LinearLayoutManager(requireContext()).apply {
                stackFromEnd = true
            }
        }
        chatAdapter = IndividualChatHeaderSosAdapter(mutableListOf())
        chatAdapter.setChatClickEventListener(object : IndividualChatHeaderSosAdapter.OnSelectChatHeader {
            override fun getClickAt(outerposition: Int, innerposition: Int) {

            }

            override fun getClickAtHeader(position: Int) {
                replaceFragment(SosSendFragment(), true)
            }
        })
        rvIndividualChat.adapter = chatAdapter
        chatAdapter.updateList(chatList)
        imgCall.setOnClickListener(this)
        imgVideo.setOnClickListener(this)
        imgLeftIconSearch.setOnClickListener(this)
        imgLeftIcon.setOnClickListener(this)
        llFiles.setOnClickListener(this)
        llLocation.setOnClickListener(this)
        llAware.setOnClickListener(this)
        tvEndSosLBL.setOnClickListener(this)
        ivSend.setOnClickListener(this)
        if (fromWhere.equals("Group")) {
            imgFiles.setImageResource(R.drawable.ic_transmitter_gradient_badge)
            tvFiles.setText("Proximity")
            tvUserName.setText("Friends")
            //imgUserProfile.setImageResource(R.drawable.ic_group_default_chat)
            imgNotification.makeGone()
        }
    }

    private fun openChatAction() {
        if (popUpChatItemDialog != null && popUpChatItemDialog!!.isAdded()) {
            return;
        }
        popUpChatItemDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        popUpChatItemDialog!!.setChatPopUpListener(object : PopUpChatItemDialog.OnClickChatPopUp {
            override fun setClickPopUp(position: Int) {

            }
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ivSend -> {
                //replaceFragment(NewGroupFragment(), true)
            }
            R.id.tvEndSosLBL -> {
                if (sosEndDialog != null && sosEndDialog!!.isAdded()) {
                    return
                }
                sosEndDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")

            }
            R.id.imgVideo -> {
                if (isSearchEnable)
                    return
                replaceFragment(VideoCallFragment("video"), true)
            }
            R.id.imgLeftIconSearch -> {
                llProfile.makeVisible()
                llSearch.makeGone()
            }
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.imgCall -> {
                if (isSearchEnable)
                    return
                replaceFragment(VideoCallFragment(), true)
            }
            R.id.llFiles -> {
                if (fromWhere.equals("Group")) {
                    llAction.tag = ""
                    // imgPlusButton.rotation = 0.0f
                    llAction.makeGone()
                    replaceFragment(ProximityFragment("add"), true)
                }
            }
            R.id.llLocation -> {
                llAction.tag = ""
                //  imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                /*replaceFragment(ShareLocationFragment(), true)*/
                openShareLocationDialog()
            }
            R.id.llAware -> {
                llAction.tag = ""
                //  imgPlusButton.rotation = 0.0f
                llAction.makeGone()
                replaceFragment(AwareFragment(), true)
            }
            R.id.imgNotification -> {
                if (pagerDialog != null && pagerDialog!!.isAdded()) {
                    return;
                }
                pagerDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                pagerDialog!!.setChatPopUpListener(object : PagerDialog.OnClickChatPopUp {
                    override fun setClickPopUp() {
                    }
                })
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
                        R.id.actionSearch -> {
                            isSearchEnable = true
                            llProfile.makeGone()
                            llSearch.makeVisible()
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

    private fun openShareLocationDialog() {
        if (shareLocationDialog != null && shareLocationDialog!!.isAdded()) {
            return;
        }
        shareLocationDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        shareLocationDialog!!.setShareLocationListener(object : ShareLocationDialog.OnClickShareLocation {
            override fun setOKOnClickOnClickShareLocation() {
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


}