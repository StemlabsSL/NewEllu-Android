package com.stemlabs.ellu.ui.component.meet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.MeetPersonModel
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.listrow_meet_contact.view.*

class MeetPersonAdapter(var arrayList: MutableList<MeetPersonModel>) : RecyclerView.Adapter<MeetPersonAdapter.MeetPersonViewHolder>() {

    lateinit var context: Context
    lateinit var listener: ClickMeetPerson


    class MeetPersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMeetProfile = itemView.imgMeetProfile!!
        var imgMeetStatus = itemView.imgMeetStatus!!
        var tvMeetPersonName = itemView.tvMeetPersonName!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeetPersonViewHolder {
        context = parent.context!!
        return MeetPersonViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_meet_contact, parent, false))
    }

    override fun onBindViewHolder(holder: MeetPersonViewHolder, position: Int) {
        holder.imgMeetStatus.setImageResource(arrayList.get(position).smallImage)
        if (arrayList.get(position).name.equals("ADD")) {
            holder.imgMeetStatus.makeGone()
        } else {
            holder.imgMeetStatus.makeVisible()
        }
        holder.imgMeetProfile.setImageResource(arrayList.get(position).userImage)
        holder.tvMeetPersonName.text = arrayList.get(position).name
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })
    }

    override fun getItemCount(): Int = arrayList.size

    public fun setMeetPersonListener(listener: ClickMeetPerson) {
        this.listener = listener
    }

    public fun updateList(meetPersonList: ArrayList<MeetPersonModel>) {
        arrayList.clear()
        arrayList.addAll(meetPersonList)
        notifyDataSetChanged()

    }

    public interface ClickMeetPerson {
        public fun getClickAt(position: Int)
    }
}