package com.stemlabs.ellu.ui.component.proximity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ChatActionModel
import com.stemlabs.ellu.ui.component.proximity.adapter.ProximityBottomAdapter

class ProximityBottomDialog : BottomSheetDialogFragment() {

    var listener: OnProximityListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.dialog_proximity, container, false)

        val rvProximity = view.findViewById<RecyclerView>(R.id.rvProximity)

        val chatActionList = ArrayList<ChatActionModel>()
        chatActionList.clear()
        chatActionList.add(ChatActionModel(R.drawable.ic_group1, "Pager"))
        chatActionList.add(ChatActionModel(R.drawable.ic_group2, "Let's Meet"))
        chatActionList.add(ChatActionModel(R.drawable.ic_group3, "Aware"))
        val adapter = ProximityBottomAdapter(mutableListOf())
        adapter.setChatItemPopupClickEventListener(object : ProximityBottomAdapter.OnSelectChatAction {
            override fun getClickAt(innerposition: Int) {
                dialog!!.dismiss()
            }
        })
        rvProximity.adapter = adapter
        adapter.updateList(chatActionList)

        return view
    }

    //
    interface OnProximityListener {
        fun onSelectItem(orderId: String)
    }
}