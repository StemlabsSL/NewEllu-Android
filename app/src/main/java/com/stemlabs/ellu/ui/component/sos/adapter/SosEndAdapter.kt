package com.stemlabs.ellu.ui.component.sos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.aware.model.SelectLocation
import com.stemlabs.ellu.ui.component.sos.model.SosEndModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.item_select_location.view.*
import kotlinx.android.synthetic.main.item_sos_end.view.*


class SosEndAdapter(
        var list: List<SosEndModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
        RecyclerView.Adapter<SosEndAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): SosEndAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_sos_end, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: SosEndAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])

        if (list.get(position).isChecked) {
            holder.itemView.rbSos.isChecked = true
        } else {
            holder.itemView.rbSos.isChecked = false
        }

        holder.itemView.rbSos.isEnabled=false
        holder.itemView.setOnClickListener(View.OnClickListener {
            callBack.onItemClicked(position, view)
        })
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(s: SosEndModel) {
            itemView.tvTitle.setText(s.title)
        }
    }
}