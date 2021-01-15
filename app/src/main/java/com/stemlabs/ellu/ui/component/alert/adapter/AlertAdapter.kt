package com.stemlabs.ellu.ui.component.alert.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.AlertHeaderModel
import com.stemlabs.ellu.data.model.AlertModel
import kotlinx.android.synthetic.main.listrow_alert.view.*

class AlertAdapter(var arrayList: MutableList<AlertModel>) : RecyclerView.Adapter<AlertAdapter.AlertViewHolder>() {

    lateinit var context: Context
    var isAlpha = false

    class AlertViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var viewAlertStart= itemView.viewAlertStart!!
        var imgAlertProfile= itemView.imgAlertProfile!!
        var imgAlertType= itemView.imgAlertType!!
        var tvAlertUserName= itemView.tvAlertUserName!!
        var tvAlertDate= itemView.tvAlertDate!!
        var tvAlertType= itemView.tvAlertType!!
        var tvAlertMessage= itemView.tvAlertMessage!!
        var llMainAlert= itemView.llMainAlert!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertViewHolder {
        context = parent.context
        return AlertViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_alert,parent,false))
    }

    override fun  onBindViewHolder(holder: AlertViewHolder, position: Int) {
        holder.viewAlertStart.setBackgroundColor(arrayList.get(position).color)
        holder.imgAlertProfile.setImageResource(arrayList.get(position).image)
        holder.imgAlertType.setImageResource(arrayList.get(position).smallIcon)
        holder.tvAlertUserName.text = arrayList.get(position).name
        holder.tvAlertDate.text = arrayList.get(position).time
        holder.tvAlertType.text = arrayList.get(position).typeofAlert
        holder.tvAlertMessage.text = arrayList.get(position).message
        if(isAlpha){
            holder.llMainAlert.alpha = 0.6f
        }else{
            holder.llMainAlert.alpha = 1.0f
        }

    }



    override fun getItemCount(): Int = arrayList.size

    fun updateList(arraList: ArrayList<AlertModel>,isAlpha :Boolean) {
        this.isAlpha = isAlpha
        arrayList.clear()
        arrayList.addAll(arraList)
        notifyDataSetChanged()
    }
}