package com.stemlabs.ellu.ui.component.alert.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.AlertHeaderModel
import kotlinx.android.synthetic.main.listrow_alert_header.view.*

class AlertHeaderAdapter(var arrayList: MutableList<AlertHeaderModel>) : RecyclerView.Adapter<AlertHeaderAdapter.AlertHeaderViewHolder>() {

    lateinit var context: Context


    inner class AlertHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAlertHeaderDate = itemView.tvAlertHeaderDate!!
        var rvAlert = itemView.rvAlert!!

        init {

            var adapter = AlertAdapter(mutableListOf())
            var simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {


                override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                    return false;
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                    listener.swipeEventAt(adapterPosition, viewHolder!!.adapterPosition)
                }
            }
            val itemTouchHelper = ItemTouchHelper(simpleItemTouchCallback)
            itemTouchHelper.attachToRecyclerView(rvAlert)
            rvAlert.adapter = adapter


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlertHeaderViewHolder {
        context = parent.context
        return AlertHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_alert_header, parent, false))
    }

    override fun onBindViewHolder(holder: AlertHeaderViewHolder, position: Int) {
        holder.tvAlertHeaderDate.text = arrayList.get(position).headerTitle
        if (position == 0) {
            (holder.rvAlert.adapter as AlertAdapter).updateList(arrayList.get(position).arrayList, false)
        } else {
            (holder.rvAlert.adapter as AlertAdapter).updateList(arrayList.get(position).arrayList, true)
        }
    }

    public fun updateList(alerHeadertList: ArrayList<AlertHeaderModel>) {
        arrayList.clear()
        arrayList.addAll(alerHeadertList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = arrayList.size


    lateinit var listener: OnSwipeEvent
    public fun getClickAt(listener: OnSwipeEvent) {
        this.listener = listener
    }

    public interface OnSwipeEvent {
        public fun swipeEventAt(outerPosition: Int, innerPosition: Int)
    }
}