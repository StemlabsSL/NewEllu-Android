package com.stemlabs.ellu.ui.component.chat.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ChatActionModel
import com.stemlabs.ellu.ui.component.chat.adapter.ChatItemActionAdapter
import kotlinx.android.synthetic.main.dialog_alarm_name.*
import kotlinx.android.synthetic.main.dialog_alarm_name.view.*
import kotlinx.android.synthetic.main.dialog_chat_item_click.view.*

class PopUpChatItemDialog : DialogFragment() {

    lateinit var viewPopUpChatItem: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewPopUpChatItem = inflater.inflate(R.layout.dialog_chat_item_click, container, false)
        initView()
        return viewPopUpChatItem
    }

    private fun initView() {
        var chatActionList = ArrayList<ChatActionModel>()
        chatActionList.clear()
        chatActionList.add(ChatActionModel(R.drawable.ic_reply_blue, "Reply"))
        chatActionList.add(ChatActionModel(R.drawable.ic_forward_blue, "Forward"))
        chatActionList.add(ChatActionModel(R.drawable.ic_copy_blue, "Copy Message"))
        chatActionList.add(ChatActionModel(R.drawable.ic_notification_blue, "Send As Pager"))
        chatActionList.add(ChatActionModel(R.drawable.ic_delete_blue, "Delete"))
        var adapter = ChatItemActionAdapter(mutableListOf())
        adapter.setChatItemPopupClickEventListener(object : ChatItemActionAdapter.OnSelectChatAction {
            override fun getClickAt(position: Int) {
                dialog!!.dismiss()
                listener.setClickPopUp(position)
            }

        })
        viewPopUpChatItem.rvChatItemAction.adapter = adapter
        adapter.updateList(chatActionList)

    }


    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }


    public interface OnClickChatPopUp {
        public fun setClickPopUp(position: Int)
    }
}