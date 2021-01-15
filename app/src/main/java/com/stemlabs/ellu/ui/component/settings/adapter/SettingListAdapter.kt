package com.stemlabs.ellu.ui.component.settings.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.SettingsModel
import com.stemlabs.ellu.utils.Constants
import com.stemlabs.ellu.utils.SharedPref
import kotlinx.android.synthetic.main.listrow_settings.view.*
import java.util.ArrayList

class SettingListAdapter(var arrayList: MutableList<SettingsModel>) : RecyclerView.Adapter<SettingListAdapter.SettingListViewHolder>() {

    lateinit var listener: OnSelectSetting
    lateinit var switchClicks: switchClick

    lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SettingListViewHolder {
        context = parent.context!!

        return SettingListViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_settings, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: SettingListViewHolder, position: Int) {

        if (SharedPref.getInstance(context).getString(Constants.FINGER_KEY).equals("1")) {
            holder.switchAlarmOnOff.isChecked = true
        } else {
            holder.switchAlarmOnOff.isChecked = false
        }
        holder.tvSettingsTitle.text = arrayList.get(position).title
        holder.imgSettingsImage.setImageResource(arrayList.get(position).image)
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.selectedServiceAt(position)
        })

        if (holder.tvSettingsTitle.text.equals("Finger Print")) {
            holder.imgArrow.visibility = View.GONE
            holder.switchAlarmOnOff.visibility = View.VISIBLE

        } else {
            holder.imgArrow.visibility = View.VISIBLE
            holder.switchAlarmOnOff.visibility = View.GONE
        }

        if (position == (arrayList.size - 1)) {
            holder.viewDivider.visibility = View.INVISIBLE
        } else {
            holder.viewDivider.visibility = View.VISIBLE

        }

        holder.switchAlarmOnOff.setOnClickListener(View.OnClickListener {


            switchClicks.oncick(holder.switchAlarmOnOff.isChecked)


        })

    }


    class SettingListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgSettingsImage = itemView.imgSettingsImage!!
        var tvSettingsTitle = itemView.tvSettingsTitle!!
        var viewDivider = itemView.viewDivider!!
        var imgArrow = itemView.imgArrow
        var switchAlarmOnOff = itemView.switchAlarmOnOff


    }


    public fun setSettingsClickListener(listener: OnSelectSetting) {
        this.listener = listener
    }


    public fun onClickSwitch(listener: switchClick) {
        this.switchClicks = listener
    }

    fun updateList(settingList: ArrayList<SettingsModel>) {
        arrayList.clear()
        arrayList.addAll(settingList)
        notifyDataSetChanged()
    }

    public interface OnSelectSetting {
        public fun selectedServiceAt(position: Int)
    }

    public interface switchClick {
        public fun oncick(value: Boolean)
    }
}