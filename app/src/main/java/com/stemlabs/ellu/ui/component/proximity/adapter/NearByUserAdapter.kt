package com.stemlabs.ellu.ui.component.proximity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ChatActionModel
import kotlinx.android.synthetic.main.item_near_by_user.view.*
import java.util.ArrayList

class NearByUserAdapter(var arrayList: MutableList<ChatActionModel>) : RecyclerView.Adapter<NearByUserAdapter.ChatItemActionViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectChatAction

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatItemActionViewHolder {
        context = parent.context
        return ChatItemActionViewHolder(LayoutInflater.from(context).inflate(R.layout.item_near_by_user, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: ChatItemActionViewHolder, position: Int) {
        holder.tvTitle.text = arrayList.get(position).title
        holder.imageView.setImageResource(arrayList.get(position).image)

        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })
    }


    inner class ChatItemActionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView = itemView.ivUserProfile!!
        var tvTitle = itemView.tvTitle!!

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