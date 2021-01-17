package com.stemlabs.ellu.ui.component.calendar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CalenderModel
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible

import java.util.*

class CalenderAdapter(private var arrayList: MutableList<CalenderModel>) :
        RecyclerView.Adapter<CalenderAdapter.CalenderViewHolder>() {

    lateinit var context: Context
    lateinit var onSelectCalender: OnSelectCalender

    var iRow = -1
    var isHorizontal = true

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        val view = inflater.inflate(
                R.layout.itemview_listrow_calender,
                parent,
                false
        )
        return CalenderViewHolder(view)
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: CalenderViewHolder, position: Int) {
        val item = arrayList[position]

        holder.tvDay.text = getProperDate(item.day)
        holder.tvDate.text = item.date

        if (iRow == position) {
            holder.tvDate.setTextColor(ContextCompat.getColor(context, R.color.colorWhite))
            holder.frameCalendarMain.setBackgroundResource(R.drawable.bg_circle_blue)
            holder.imgCalendarDots.makeVisible()
        } else {
            holder.tvDate.setTextColor(ContextCompat.getColor(context, R.color.colorBlack))
            holder.frameCalendarMain.setBackgroundResource(R.color.transparent)
            holder.imgCalendarDots.makeGone()
        }

        if (isHorizontal) {
            holder.tvDay.makeVisible()
        } else {
            if (position < 7) {
                holder.tvDay.makeVisible()
            } else {
                holder.tvDay.makeGone()
            }
        }

        holder.llMainCalnder.setOnClickListener {
            onSelectCalender.onClickCalenderView(item, position)
        }
    }

    private fun getProperDate(day: String): String {
        /*when(day){

        }*/
        return day
    }

    fun updateList(calenderList: ArrayList<CalenderModel>) {
        arrayList.clear()
        arrayList.addAll(calenderList)
        notifyDataSetChanged()
    }

    fun setDateVisible(isHorizontal: Boolean) {
        this.isHorizontal = isHorizontal
        notifyDataSetChanged()
    }

    inner class CalenderViewHolder(private var binding: View) :
            RecyclerView.ViewHolder(binding) {
        var llMainCalnder = binding.findViewById(R.id.llMainCalender) as LinearLayout
        var tvDay = binding.findViewById(R.id.tvDay) as TextView
        var tvDate = binding.findViewById(R.id.tvDate) as TextView
        var imgCalendarDots = binding.findViewById(R.id.imgCalendarDots) as ImageView
        var frameCalendarMain = binding.findViewById(R.id.frameCalendarMain) as FrameLayout
    }

    interface OnSelectCalender {
        fun onClickCalenderView(calenderModel: CalenderModel, position: Int)
    }
}