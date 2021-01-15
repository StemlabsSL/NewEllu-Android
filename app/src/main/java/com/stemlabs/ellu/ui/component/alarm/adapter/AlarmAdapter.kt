package com.stemlabs.ellu.ui.component.alarm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chauthai.swipereveallayout.ViewBinderHelper
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.AlarmModel
import kotlinx.android.synthetic.main.listrow_alarm.view.*
import java.util.*

class AlarmAdapter(var arrayList: MutableList<AlarmModel>) : RecyclerView.Adapter<AlarmAdapter.AlarmViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectAlarm
    private val viewBinderHelper = ViewBinderHelper()

    inner class AlarmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rvAlarmCalendar = itemView.rvAlarmCalendar!!
        var tvAlarmTime = itemView.tvAlarmTime!!
        var tvAlarmTitle = itemView.tvAlarmTitle!!
        var switchAlarmOnOff = itemView.switchAlarmOnOff!!
        var ll_delete = itemView.ll_delete!!
        var imgDelete = itemView.imgDelete!!
        var swipe_main = itemView.swipe_main!!
        var cardMain = itemView.cardMain!!

        init {
            var adapter = AlarmDayAdapter(mutableListOf())
            adapter.setDayListener(object : AlarmDayAdapter.AlarmDaySelect {
                override fun dayClickAt(position: Int) {
                    listener.onSelectDayAt(adapterPosition, position)
                }
            })
            rvAlarmCalendar.adapter = adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlarmViewHolder {
        context = parent.context
        return AlarmViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_alarm, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: AlarmViewHolder, position: Int) {
        viewBinderHelper.bind(holder.swipe_main, "" + position)
        viewBinderHelper.setOpenOnlyOne(true)
        holder.tvAlarmTitle.setText(arrayList.get(position).alarmTitle)
        holder.tvAlarmTime.setText(arrayList.get(position).alarmTime)
        holder.switchAlarmOnOff.isChecked = arrayList.get(position).isOnAlarm
        (holder.rvAlarmCalendar.adapter as AlarmDayAdapter).updateList(arrayList.get(position).dayList)
        holder.tvAlarmTitle.setOnClickListener(View.OnClickListener {
            listener.onSelectAlarmAt(position)
        })
        holder.tvAlarmTime.setOnClickListener(View.OnClickListener {
            holder.tvAlarmTitle.performClick()
        })
        holder.rvAlarmCalendar.setOnClickListener(View.OnClickListener {
            holder.tvAlarmTitle.performClick()
        })
        holder.itemView.setOnClickListener(View.OnClickListener {
            holder.tvAlarmTitle.performClick()
        })
        holder.cardMain.setOnClickListener(View.OnClickListener {
            holder.tvAlarmTitle.performClick()
        })
        holder.switchAlarmOnOff.setOnClickListener(View.OnClickListener {
            listener.onSelectSwitchAt(position)
        })
        holder.ll_delete.setOnClickListener(View.OnClickListener {
            listener.onDeleteAt(position)
        })
        holder.imgDelete.setOnClickListener(View.OnClickListener {
            listener.onDeleteAt(position)
        })
    }

    public fun setAlarmClickListener(listener: OnSelectAlarm) {
        this.listener = listener
    }

    fun updateList(alarmList: ArrayList<AlarmModel>) {
        arrayList.clear()
        arrayList.addAll(alarmList)
        notifyDataSetChanged()
    }

    fun removeAlarmAt(position: Int) {
        arrayList.removeAt(position)
        notifyItemRemoved(position)
        notifyDataSetChanged()
    }

    public interface OnSelectAlarm {
        public fun onSelectAlarmAt(position: Int)
        public fun onSelectSwitchAt(position: Int)
        public fun onSelectDayAt(outerPosition: Int, innerPosition: Int)
        public fun onDeleteAt(position: Int)
    }


}