package com.stemlabs.ellu.ui.component.chat.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.dialog_mute_notification.view.*


class MuteNotificationDialog : DialogFragment() {

    lateinit var viewMuteNotification: View
    var currentselected :String ="8 hours"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewMuteNotification = inflater.inflate(R.layout.dialog_mute_notification, container, false)
        initView()
        return viewMuteNotification
    }

    private fun initView() {
        viewMuteNotification.tvCancelLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        viewMuteNotification.tvOKLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
            listener.setOKOnClickMuteNotification(currentselected,viewMuteNotification.checkBoxShowNotification.isChecked)
        })
        viewMuteNotification.rb8Hours.setOnClickListener(View.OnClickListener {
            currentselected = "8 hours"
            viewMuteNotification.rb8Hours.isChecked =true
            viewMuteNotification.rb1Week.isChecked =false
            viewMuteNotification.rbAlways.isChecked =false

        })
        viewMuteNotification.rb1Week.setOnClickListener(View.OnClickListener {
            currentselected = "1 week"
            viewMuteNotification.rb8Hours.isChecked =false
            viewMuteNotification.rb1Week.isChecked =true
            viewMuteNotification.rbAlways.isChecked =false

        })
        viewMuteNotification.rbAlways.setOnClickListener(View.OnClickListener {
            currentselected = "always"
            viewMuteNotification.rb8Hours.isChecked =false
            viewMuteNotification.rb1Week.isChecked =false
            viewMuteNotification.rbAlways.isChecked =true


        })

        viewMuteNotification.ll8Hours.setOnClickListener(View.OnClickListener {
            viewMuteNotification.rb8Hours.performClick()

        })
        viewMuteNotification.ll1Week.setOnClickListener(View.OnClickListener {
            viewMuteNotification.rb1Week.performClick()

        })
        viewMuteNotification.llAlways.setOnClickListener(View.OnClickListener {
            viewMuteNotification.rbAlways.performClick()


        })


    }


    lateinit var listener: OnClickMuteNotification
    public fun setChatPopUpListener(listener: OnClickMuteNotification) {
        this.listener = listener
    }


    public interface OnClickMuteNotification {
        public fun setOKOnClickMuteNotification(muteFor: String,isShowNotification:Boolean)
    }
}