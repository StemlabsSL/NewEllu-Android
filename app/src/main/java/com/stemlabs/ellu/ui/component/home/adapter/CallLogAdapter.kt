package com.stemlabs.ellu.ui.component.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.model.CallLogModel
import kotlinx.android.synthetic.main.listrow_call_log.view.*
import java.util.ArrayList

class CallLogAdapter(var arrayList: MutableList<CallLogModel>) :
        RecyclerView.Adapter<CallLogAdapter.CallLogViewHolder>() {
    lateinit var listener: CallLogClick
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallLogViewHolder {
        context = parent.context
        return CallLogViewHolder(
                LayoutInflater.from(context).inflate(R.layout.listrow_call_log, parent, false)
        )
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: CallLogViewHolder, position: Int) {
        holder.imgUserProfile.setImageResource(arrayList.get(position).profileImage)
        if (arrayList.get(position).type.equals("red")) {
            holder.imgType.setImageResource(R.drawable.ic_red_outgoing)
        } else {
            holder.imgType.setImageResource(R.drawable.ic_green_outgoing)
        }
        holder.tvUserName.text = arrayList.get(position).name
        holder.tvTimeAt.text = arrayList.get(position).time
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.itemClickAt(position)
        })
        holder.imgCall.setOnClickListener(View.OnClickListener {
            listener.phoneClickAt(position)
        })
        holder.imgVideo.setOnClickListener(View.OnClickListener {
            listener.videoClickAt(position)
        })
    }

    public fun setCallLogClickListener(listener: CallLogClick) {
        this.listener = listener
    }

    fun updateList(courseList: ArrayList<CallLogModel>) {
        arrayList.clear()
        arrayList.addAll(courseList)
        notifyDataSetChanged()
    }

    class CallLogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUserProfile = itemView.imgUserProfile!!
        var tvUserName = itemView.tvUserName!!
        var imgType = itemView.imgType!!
        var tvTimeAt = itemView.tvTimeAt!!
        var imgCall = itemView.imgCall!!
        var imgVideo = itemView.imgVideo!!
    }

    public interface CallLogClick {
        public fun itemClickAt(position: Int);
        public fun phoneClickAt(position: Int);
        public fun videoClickAt(position: Int);
    }
}