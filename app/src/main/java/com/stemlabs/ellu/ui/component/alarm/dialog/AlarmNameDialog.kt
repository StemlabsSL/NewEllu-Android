package com.stemlabs.ellu.ui.component.alarm.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.android.gms.maps.GoogleMap
import com.stemlabs.ellu.R
import com.stemlabs.ellu.utils.FrequentUtils
import com.stemlabs.ellu.utils.hideKeyboard
import kotlinx.android.synthetic.main.dialog_alarm_name.*
import kotlinx.android.synthetic.main.dialog_alarm_name.view.*

class AlarmNameDialog(var fromStatus: String,var value:String) : DialogFragment(), View.OnClickListener {

    lateinit var viewAlarmName: View

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
        viewAlarmName = inflater.inflate(R.layout.dialog_alarm_name, container, false)
        initView()
        return viewAlarmName
    }

    private fun initView() {
        if (fromStatus.equals("devicename")) {
            viewAlarmName.tvSetAlarmNameLBL.text = "Set Band Name"
            viewAlarmName.edtAlarmName.hint = "Enter band name"
            viewAlarmName.edtAlarmName.setText("Jhon's Band")
        }else if(fromStatus.equals("profilename")){
            viewAlarmName.tvSetAlarmNameLBL.text = "Edit Profile Name"
            viewAlarmName.edtAlarmName.hint = "Enter name"
            viewAlarmName.edtAlarmName.setText(value)
        }else if(fromStatus.equals("profilestatus")){
            viewAlarmName.tvSetAlarmNameLBL.text = "Edit Status Message"
            viewAlarmName.edtAlarmName.hint = "Enter status message"
            viewAlarmName.edtAlarmName.setText(value)
        }
        var tvSetLBL = viewAlarmName.tvSetLBL
        tvSetLBL.setOnClickListener(this)
        var tvCancelLBL = viewAlarmName.tvCancelLBL
        tvCancelLBL.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
      v!!.hideKeyboard()
        when (v!!.id) {
            R.id.tvSetLBL -> {
                dialog!!.dismiss()
                listener.setClickSet(edtAlarmName.text.toString())
            }
            R.id.tvCancelLBL -> dialog!!.dismiss()
        }
    }

    lateinit var listener: OnClickSet
    public fun setRedeemListener(listener: OnClickSet) {
        this.listener = listener
    }


    public interface OnClickSet {
        public fun setClickSet(name: String)
    }
}