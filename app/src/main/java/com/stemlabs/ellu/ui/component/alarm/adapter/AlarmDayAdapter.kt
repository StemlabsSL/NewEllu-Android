package com.stemlabs.ellu.ui.component.alarm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.DayModel
import kotlinx.android.synthetic.main.listrow_day_alarm.view.*

class AlarmDayAdapter(var arrayList: MutableList<DayModel>) : RecyclerView.Adapter<AlarmDayAdapter.AlarmDayViewHolder>() {
    lateinit var context: Context
    lateinit var listner: AlarmDaySelect

    class AlarmDayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvDay = itemView.tvDay
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmDayViewHolder {
        context = parent.context!!
        return AlarmDayViewHolder(LayoutInflater.from(context!!).inflate(R.layout.listrow_day_alarm, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: AlarmDayViewHolder, position: Int) {
        holder.tvDay.text = arrayList.get(position).dayShortName
        if (arrayList.get(position).isClicked) {
            holder.tvDay.setTextColor(ContextCompat.getColor(context,R.color.color0073B5))
            holder.tvDay.setTypeface(ResourcesCompat.getFont(context,R.font.raleway_bold))
        } else {
            holder.tvDay.setTextColor(ContextCompat.getColor(context,R.color.color959593))
            holder.tvDay.setTypeface(ResourcesCompat.getFont(context,R.font.raleway_regular))
        }
        holder.itemView.setOnClickListener(View.OnClickListener {
            listner.dayClickAt(position)
        })

    }

    fun setDayListener(listner: AlarmDaySelect) {
        this.listner = listner
    }

    fun updateList(dayList: MutableList<DayModel>) {
        arrayList.clear()
        arrayList.addAll(dayList)
        notifyDataSetChanged()
    }

    public interface AlarmDaySelect {
        public fun dayClickAt(position: Int)
    }
}