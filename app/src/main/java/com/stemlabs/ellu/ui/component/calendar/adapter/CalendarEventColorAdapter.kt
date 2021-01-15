package com.stemlabs.ellu.ui.component.calendar.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import de.hdodenhof.circleimageview.CircleImageView

import java.util.*

class CalendarEventColorAdapter(private var arrayList: MutableList<String>) :
        RecyclerView.Adapter<CalendarEventColorAdapter.CalendarEventColorViewHolder>() {

    lateinit var context: Context
    lateinit var onSelectCalender: OnSelectCalenderEvent


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarEventColorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        val view = inflater.inflate(
                R.layout.listrow_calendar_event_color,
                parent,
                false
        )
        return CalendarEventColorViewHolder(view)
    }

    override fun getItemCount(): Int = 7

    override fun onBindViewHolder(holder: CalendarEventColorViewHolder, position: Int) {

        when(position){
            0->{holder.imgEventCalendarColor.setImageResource(R.color.colorFF5252)
                holder.imgEventCalendarColor.borderWidth = 2
                holder.imgEventCalendarColor.borderColor = context.resources.getColor(R.color.colorWhite)
            }
            1->{holder.imgEventCalendarColor.setImageResource(R.color.color00B806)}
            2->{holder.imgEventCalendarColor.setImageResource(R.color.color73C5F3)}
            3->{holder.imgEventCalendarColor.setImageResource(R.color.colorFFD600)}
            4->{holder.imgEventCalendarColor.setImageResource(R.color.colorFF8800)}
            5->{holder.imgEventCalendarColor.setImageResource(R.color.colorA6A6A6)}
            6->{holder.imgEventCalendarColor.setImageResource(R.color.color8700FF)}
            else->{holder.imgEventCalendarColor.setImageResource(R.color.colorFF5252)}

        }

        holder.imgEventCalendarColor.setOnClickListener {
            onSelectCalender.onClickCalenderEventView(position)
        }
    }

    fun updateList(calenderList: ArrayList<String>) {
        arrayList.clear()
        arrayList.addAll(calenderList)
        notifyDataSetChanged()
    }

    inner class CalendarEventColorViewHolder(private var binding: View) :
            RecyclerView.ViewHolder(binding) {
        var imgEventCalendarColor = binding.findViewById(R.id.imgEventCalendarColor) as CircleImageView

    }

    interface OnSelectCalenderEvent {
        fun onClickCalenderEventView(position: Int)
    }
}