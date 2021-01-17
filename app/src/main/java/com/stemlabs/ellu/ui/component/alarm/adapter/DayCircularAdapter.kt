package com.stemlabs.ellu.ui.component.alarm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.DayModel
import kotlinx.android.synthetic.main.listrow_day_repeat_circular.view.*

class DayCircularAdapter(var arrayList: MutableList<DayModel>) : RecyclerView.Adapter<DayCircularAdapter.DayCircularViewHolder>() {
    lateinit var context: Context
    lateinit var listner: DayCircularSelect

    class DayCircularViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvDay = itemView.tvDay
        var llDayCircular = itemView.llDayCircular
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayCircularViewHolder {
        context = parent.context!!
        return DayCircularViewHolder(LayoutInflater.from(context!!).inflate(R.layout.listrow_day_repeat_circular, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: DayCircularViewHolder, position: Int) {
        holder.tvDay.text = arrayList.get(position).dayShortName
        if (arrayList.get(position).isClicked) {
            holder.tvDay.setTextColor(ContextCompat.getColor(context, R.color.color0073B5))
            holder.llDayCircular.background = ContextCompat.getDrawable(context, R.drawable.border_blue)
        } else {
            holder.tvDay.setTextColor(ContextCompat.getColor(context, R.color.color959593))
            holder.llDayCircular.background = ContextCompat.getDrawable(context, R.drawable.border_gray)

        }
        holder.itemView.setOnClickListener(View.OnClickListener {
            listner.dayClickAt(position)
        })

    }

    fun setDayListener(listner: DayCircularSelect) {
        this.listner = listner
    }

    fun updateList(dayList: MutableList<DayModel>) {
        arrayList.clear()
        arrayList.addAll(dayList)
        notifyDataSetChanged()
    }

    public interface DayCircularSelect {
        public fun dayClickAt(position: Int)
    }
}