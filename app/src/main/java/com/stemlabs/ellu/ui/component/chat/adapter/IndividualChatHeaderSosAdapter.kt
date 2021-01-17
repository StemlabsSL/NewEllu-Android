package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.IndividualChatHeaderModel
import kotlinx.android.synthetic.main.listrow_invidividual_chat_header.view.*
import java.util.ArrayList

class IndividualChatHeaderSosAdapter(var arrayList: MutableList<IndividualChatHeaderModel>) : RecyclerView.Adapter<IndividualChatHeaderSosAdapter.IndividualChatHeaderViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectChatHeader

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndividualChatHeaderViewHolder {
        context = parent!!.context
        return IndividualChatHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_invidividual_chat_header_sos, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: IndividualChatHeaderViewHolder, position: Int) {
        holder.tvChatDateHeader.text = arrayList.get(position).date
        (holder.rvChat.adapter as IndividualChatSosAdapter).updateList(arrayList.get(position).arrayList)
        holder.tvChatDateHeader.setOnClickListener(View.OnClickListener {
            listener.getClickAtHeader(position)
        })
    }


    inner class IndividualChatHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvChatDateHeader = itemView.tvChatDateHeader!!
        var rvChat = itemView.rvChat!!

        init {
            var adapter = IndividualChatSosAdapter(mutableListOf())
            adapter.setChatListener(object : IndividualChatSosAdapter.OnChatSelect {
                override fun getChatAt(position: Int) {
                    listener.getClickAt(adapterPosition, position)
                }
            })
            rvChat.adapter = adapter
        }
    }

    public fun setChatClickEventListener(listener: OnSelectChatHeader) {
        this.listener = listener
    }

    fun updateList(chatList: ArrayList<IndividualChatHeaderModel>) {
        arrayList.clear()
        arrayList.addAll(chatList)
        notifyDataSetChanged()
    }

    public interface OnSelectChatHeader {
        public fun getClickAt(outerposition: Int, innerposition: Int)
        public fun getClickAtHeader(position: Int)
    }
}