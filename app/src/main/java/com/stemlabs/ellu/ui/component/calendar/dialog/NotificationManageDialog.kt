package com.stemlabs.ellu.ui.component.calendar.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.android.gms.maps.GoogleMap
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedVibrationModel
import com.stemlabs.ellu.ui.component.calendar.adapter.NotificationManagerAdapter
import kotlinx.android.synthetic.main.dialog_notification_manage.*
import kotlinx.android.synthetic.main.dialog_notification_manage.view.*
import java.nio.file.attribute.PosixFileAttributeView
import java.text.FieldPosition

class NotificationManageDialog : DialogFragment(), View.OnClickListener {

    lateinit var viewNotificationManage: View
    var position =0

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
        viewNotificationManage = inflater.inflate(R.layout.dialog_notification_manage, container, false)
        initView()
        return viewNotificationManage
    }

    private fun initView() {
        var list = CustomizedVibrationModel.getList()
        var notificationManagerAdapter = NotificationManagerAdapter(mutableListOf())
        notificationManagerAdapter.updateList(list)
        notificationManagerAdapter.setClickEvent(object :NotificationManagerAdapter.OnSelectNotification{
            override fun onSelectAt(positionone: Int) {
                position = positionone
                if (list.size > 0) {
                    for (i in list.indices) {
                        if (position == i) {

                            if (!list.get(position).isClicked) {
                                list.get(position).isClicked = true
                            } else {
                                list.get(position).isClicked = false
                            }
                        } else {
                            list.get(i).isClicked = false
                        }
                        notificationManagerAdapter.notifyDataSetChanged()

                    }
                }
            }
        })
        viewNotificationManage.rvNotificationManage.adapter = notificationManagerAdapter
        viewNotificationManage.tvOkLBL.setOnClickListener(this)
        viewNotificationManage.tvCancelLBL.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.tvOkLBL -> {
                dialog!!.dismiss()
                listener.setClickSet(position)
            }
            R.id.tvCancelLBL -> dialog!!.dismiss()
        }
    }

    lateinit var listener: OnClickSet
    public fun setNotificationDialogListener(listener: OnClickSet) {
        this.listener = listener
    }


    public interface OnClickSet {
        public fun setClickSet( position: Int
        )
    }
}