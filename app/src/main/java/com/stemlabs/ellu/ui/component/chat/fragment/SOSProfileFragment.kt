package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_s_o_s_profile.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import kotlinx.android.synthetic.main.noraml_toolbar.imgLeftIcon


class SOSProfileFragment : BaseFragment(), View.OnClickListener {

    var isBlocked = false
    var isEnableName = false
    var isEnableMobile = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_s_o_s_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        imgEditSOSName.setOnClickListener(this)
        imgEditSOSMobile.setOnClickListener(this)
        imgRightIcon.setOnClickListener(this)
        llBlockUser.setOnClickListener(this)
        llSendSOSContact.setOnClickListener(this)
        tvToolbarTitle.text = ""
        llMainToolbar.elevation=0.0f
        imgRightIcon.makeVisible()
        imgRightIcon.setImageResource(R.drawable.ic_more_black)
    }

    private fun initView() {
        tvSendLBL.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
            R.id.tvSendLBL -> {
                tvSOSContactLBL.text = "SOS Contact"
                tvSendLBL.makeGone()
                tvSOSLBL.makeVisible()
                switchSosContact.makeVisible()
            }
            R.id.llSendSOSContact -> {
               // replaceFragment(IndividualChatFragment("Individual Chat"), true)

            }

            R.id.llBlockUser -> {
                if (isBlocked) {
                    isBlocked = false
                    llBlockedBackground.makeGone()
                    imgRightIcon.makeVisible()
                    imgLeftIcon.makeVisible()
                    //normal_toolbar.makeVisible()
                    tvBlockUser.text = "BLOCK THIS USER"
                    llBlockUser.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.block_user_bg)
                    llMainToolbar.background = ContextCompat.getDrawable(baseActivity!!, R.color.colorWhite)
                } else {
                    isBlocked = true
                    imgRightIcon.makeInvisible()
                    imgLeftIcon.makeVisible()
                    llBlockedBackground.makeVisible()
                    //normal_toolbar.makeGone()
                    llBlockUser.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.bg_gradient)
                    tvBlockUser.text = "UNBLOCK USER"
                    llMainToolbar.background = ContextCompat.getDrawable(baseActivity!!, R.color.colorE2E2E2)

                }
            }

            R.id.imgEditSOSName -> {
                if (isEnableName) {
                    imgEditSOSName.setImageResource(R.drawable.ic_edit)
                    isEnableName = false
                    tvUserName.makeVisible()
                    tvUserName.text = edtUserName.text
                    edtUserName.makeGone()
                } else {
                    imgEditSOSName.setImageResource(R.drawable.ic_green_tick)
                    isEnableName = true
                    edtUserName.makeVisible()
                    edtUserName.setText(tvUserName.text)
                    tvUserName.makeGone()
                }
            }

            R.id.imgEditSOSMobile -> {
                if (isEnableMobile) {
                    imgEditSOSMobile.setImageResource(R.drawable.ic_edit)
                    isEnableMobile = false
                    tvUserMobile.makeVisible()
                    tvUserMobile.text = edtSosUserMobile.text
                    edtSosUserMobile.makeGone()
                } else {
                    imgEditSOSMobile.setImageResource(R.drawable.ic_green_tick)
                    isEnableMobile = true
                    edtSosUserMobile.makeVisible()
                    edtSosUserMobile.setText(tvUserMobile.text)
                    tvUserMobile.makeGone()
                }
            }


            R.id.imgRightIcon -> {
                val popupMenu = PopupMenu(baseActivity, imgRightIcon)
                popupMenu.menuInflater.inflate(R.menu.menu_more_sos, popupMenu.menu)
                /*var itemPrice = popupMenu.menu.getItem(0)
                itemPrice.setTitle("" + repo.labelPref.LBL_PRICE)

                popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                    when (item.itemId) {
                        /* R.id.action_price -> {
                             Collections.sort(
                                     payload
                                     , MotoTaxiBidderListResponse.Payload.filterPriceComperator
                             )
                             binding.vmMotoAvailableDrivers!!.adapter!!.insert(payload.toMutableList())
                         }
                        */
                    }
                    true
                })
                 */
                popupMenu.show()
            }

        }
    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

}