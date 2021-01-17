package com.stemlabs.ellu.ui.component.calendar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.listrow_calendar_event_person.view.*

class CalendarEventPersonAdapter(var arrayList: MutableList<String>) : RecyclerView.Adapter<CalendarEventPersonAdapter.CalendarEventPersonViewHolder>() {
    lateinit var context: Context
    lateinit var select: PersonClickEvent

    class CalendarEventPersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvPersonName = itemView.tvPersonName!!
        var imgCancel = itemView.imgCancel!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarEventPersonViewHolder {
        context = parent.context!!
        return CalendarEventPersonViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_calendar_event_person, parent, false))
    }

    override fun onBindViewHolder(holder: CalendarEventPersonViewHolder, position: Int) {
        if (position == 0) {
            holder.tvPersonName.text = "Joe"
        } else {
            holder.tvPersonName.text = "Eric"

        }
        holder.itemView.setOnClickListener(View.OnClickListener {
            select.getClickAt(position)
        })
        holder.imgCancel.setOnClickListener(View.OnClickListener {
            select.getClickAt(position)
        })
    }

    public fun setClickPersonEvent(select: PersonClickEvent) {
        this.select = select
    }

    override fun getItemCount(): Int = 2

    public interface PersonClickEvent {
        public fun getClickAt(position: Int)
        public fun getDeleteAt(position: Int)
    }
}