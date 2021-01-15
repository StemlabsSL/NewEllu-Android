package com.stemlabs.ellu.ui.component.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.model.MainChat
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import org.androidannotations.annotations.LongClick

class MainChatAdapter(var arrayList: List<MainChat>) :
        RecyclerView.Adapter<MainChatAdapter.WithdrawViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelect

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WithdrawViewHolder {
        context = parent.context

        return WithdrawViewHolder(
                LayoutInflater.from(parent.context).inflate(
                        R.layout.item_chat_main_list,
                        parent,
                        false
                )
        )
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: WithdrawViewHolder, position: Int) {
        val item = arrayList[position]
        holder.tvName.text = item.name
        holder.tvDate.text = item.date

        if (position == 0) {
            holder.tvUnreadCount.makeVisible()
        } else {
            holder.tvUnreadCount.makeGone()
        }
        if (position == 1) {
            holder.frameUserProfile.background = null
        } else {
            holder.frameUserProfile.background = ContextCompat.getDrawable(context!!, R.drawable.ring_shape_gradient)
        }
        if (position == 3) {
            holder.imgMute.makeVisible()
        } else {
            holder.imgMute.makeGone()
        }
        if (position == 2 || position == 3 || position == 4) {
            holder.imgMessageSeen.makeVisible()
            if (position == 2) {
                holder.imgMessageSeen.setImageResource(R.drawable.ic_gray_border_tick)
            } else {
                holder.imgMessageSeen.setImageResource(R.drawable.ic_tick)
            }
        } else {
            holder.imgMessageSeen.makeGone()
        }

        holder.ivUserProfile.setImageResource(arrayList.get(position).profileImage)
        if (position == 5) {
            holder.imgAudio.makeVisible()
            holder.tvAudioMessage.makeVisible()
            holder.tvMessage.text = "Eric :"
            holder.tvAudioMessage.text = "0:15"
        } else {
            holder.imgAudio.makeGone()
            holder.tvAudioMessage.makeGone()
            holder.tvMessage.text = item.message

            //Glide.with(context).load(item.profileImage).into(holder.ivUserProfile)
        }

        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.onSelectAt(position)
        })

        holder.itemView.setOnLongClickListener(View.OnLongClickListener {
            listener.onLongPress(position)
            true
        })

    }

    class WithdrawViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivUserProfile = itemView.findViewById(R.id.ivUserProfile) as ImageView
        var tvName = itemView.findViewById(R.id.tvName) as TextView
        var tvMessage = itemView.findViewById(R.id.tvMessage) as TextView
        var tvDate = itemView.findViewById(R.id.tvDate) as TextView
        var tvUnreadCount = itemView.findViewById(R.id.tvUnreadCount) as TextView
        var imgMute = itemView.findViewById(R.id.imgMute) as ImageView
        var frameUserProfile = itemView.findViewById(R.id.frameUserProfile) as FrameLayout
        var imgAudio = itemView.findViewById(R.id.imgAudio) as ImageView
        var tvAudioMessage = itemView.findViewById(R.id.tvAudioMessage) as TextView
        var imgMessageSeen = itemView.findViewById(R.id.imgMessageSeen) as ImageView
    }

    public fun setClickListener(listener: OnSelect) {
        this.listener = listener
    }

    public interface OnSelect {
        public fun onSelectAt(position: Int)
        public fun onLongPress(position: Int)
    }
}