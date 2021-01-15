package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ChatActionModel
import kotlinx.android.synthetic.main.listrow_chat_action.view.*
import java.util.ArrayList

class ChatItemActionAdapter(var arrayList: MutableList<ChatActionModel>) : RecyclerView.Adapter<ChatItemActionAdapter.ChatItemActionViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectChatAction

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatItemActionViewHolder {
        context = parent!!.context
        return ChatItemActionViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_chat_action, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: ChatItemActionViewHolder, position: Int) {
        holder.tvChatActionTitle.text = arrayList.get(position).title
        holder.imgChatAction.setImageResource(arrayList.get(position).image)

        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })
    }


    inner class ChatItemActionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgChatAction = itemView.imgChatAction!!
        var tvChatActionTitle = itemView.tvChatActionTitle!!

    }

    public fun setChatItemPopupClickEventListener(listener: OnSelectChatAction) {
        this.listener = listener
    }

    fun updateList(chatList: ArrayList<ChatActionModel>) {
        arrayList.clear()
        arrayList.addAll(chatList)
        notifyDataSetChanged()
    }

    public interface OnSelectChatAction {
        public fun getClickAt(innerposition: Int)
    }
}