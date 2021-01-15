package com.stemlabs.ellu.ui.component.calendar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedVibrationModel
import kotlinx.android.synthetic.main.listrow_notitification_manage.view.*
import java.util.ArrayList

class NotificationManagerAdapter (var arrayList:MutableList<CustomizedVibrationModel>):RecyclerView.Adapter<NotificationManagerAdapter.NotificationManagerViewHolder>() {
    lateinit var context: Context
    lateinit var listener: OnSelectNotification

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationManagerViewHolder {
        context = parent.context!!
        return NotificationManagerViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_notitification_manage,parent,false))
    }

    override fun onBindViewHolder(holder: NotificationManagerViewHolder, position: Int) {
        holder.tvNotificationManageTitle.text = arrayList.get(position).title
        holder.rbNotificationManage.isChecked = arrayList.get(position).isClicked
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.onSelectAt(position)
        })
    }

    override fun getItemCount(): Int = arrayList.size

    class NotificationManagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rbNotificationManage = itemView.rbNotificationManage!!
        var tvNotificationManageTitle = itemView.tvNotificationManageTitle!!

    }

    public fun setClickEvent(listener :OnSelectNotification){
        this.listener =listener
    }

    fun updateList(list: ArrayList<CustomizedVibrationModel>) {
        arrayList.clear()
        arrayList.addAll(list)
        notifyDataSetChanged()
    }

    public interface OnSelectNotification{
        public fun onSelectAt(position: Int)

    }
}