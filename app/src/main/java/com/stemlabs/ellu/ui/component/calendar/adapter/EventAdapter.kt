package com.stemlabs.ellu.ui.component.calendar.adapter

import android.content.Context
import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.EventModel
import kotlinx.android.synthetic.main.profile_toolbar.*

class EventAdapter(private var arrayList: MutableList<EventModel>) :
        RecyclerView.Adapter<EventAdapter.CalenderViewHolder>() {

    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalenderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        val view = inflater.inflate(
                R.layout.itemview_listrow_events,
                parent,
                false
        )
        return CalenderViewHolder(view)
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: CalenderViewHolder, position: Int) {
        val item = arrayList[position]

        holder.itemLayout.background = ContextCompat.getDrawable(context, item.bgColor)

        holder.tvTitle.setTextColor(ContextCompat.getColor(context, item.textColor))
        holder.tvDate.setTextColor(ContextCompat.getColor(context, item.textColor))
        holder.tvAddress.setTextColor(ContextCompat.getColor(context, item.textColor))
        holder.tvUserName.setTextColor(ContextCompat.getColor(context, item.textColor))

        holder.ivDate.setColorFilter(ContextCompat.getColor(context, item.iconColor), PorterDuff.Mode.SRC_IN)

        holder.ivAddress.setColorFilter(ContextCompat.getColor(context, item.iconColor), PorterDuff.Mode.SRC_IN)
        holder.ivPerson.setColorFilter(ContextCompat.getColor(context, item.iconColor), PorterDuff.Mode.SRC_IN)

    }

    inner class CalenderViewHolder(private var binding: View) :
            RecyclerView.ViewHolder(binding) {
        var itemLayout = binding.findViewById(R.id.itemLayout) as LinearLayout
        var tvTitle = binding.findViewById(R.id.tvTitle) as TextView
        var tvDate = binding.findViewById(R.id.tvDate) as TextView
        var tvAddress = binding.findViewById(R.id.tvAddress) as TextView
        var tvUserName = binding.findViewById(R.id.tvUserName) as TextView
        var ivDate = binding.findViewById(R.id.ivDate) as ImageView
        var ivAddress = binding.findViewById(R.id.ivAddress) as ImageView
        var ivPerson = binding.findViewById(R.id.ivPerson) as ImageView
    }

}