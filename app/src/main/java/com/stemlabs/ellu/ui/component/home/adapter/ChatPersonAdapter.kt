package com.stemlabs.ellu.ui.component.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.model.MainChat
import kotlinx.android.synthetic.main.item_chat_person.view.*
import kotlinx.android.synthetic.main.listrow_call_log.view.*

class ChatPersonAdapter(var arrayList: List<MainChat>) :
        RecyclerView.Adapter<ChatPersonAdapter.WithdrawViewHolder>() {

    lateinit var context: Context
    lateinit var listener :OnSelect

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WithdrawViewHolder {
        context = parent.context

        return WithdrawViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_chat_person,
                        parent,
                        false
                )
        )
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: WithdrawViewHolder, position: Int) {
        val item = arrayList[position]

        Glide.with(context).load(item.profileImage).into(holder.imgUserProfile)

        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })
    }

    class WithdrawViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserProfile = itemView.ivUserProfile!!
    }

    public fun setClickListenerStory(listener :OnSelect){
        this.listener =listener
    }
    public interface  OnSelect{
        public fun getClickAt(position: Int)
    }

}