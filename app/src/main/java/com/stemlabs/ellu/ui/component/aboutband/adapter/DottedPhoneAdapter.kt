package com.stemlabs.ellu.ui.component.aboutband.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.DayModel
import kotlinx.android.synthetic.main.listrow_progressing_dot.view.*

class DottedPhoneAdapter(var arrayList: MutableList<DayModel>) : RecyclerView.Adapter<DottedPhoneAdapter.DottedPhoneViewHolder>() {

    lateinit var context: Context

    class DottedPhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgDotProgressing = itemView.imgDotProgressing!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DottedPhoneViewHolder {
        context = parent.context!!
        return DottedPhoneViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_progressing_dot, parent, false))
    }

    override fun onBindViewHolder(holder: DottedPhoneViewHolder, position: Int) {
        if (arrayList.get(position).isClicked) {
            holder.imgDotProgressing.setImageResource(R.color.colorPrimary)
        } else {
            holder.imgDotProgressing.setImageResource(R.color.colorC1C1C1)
        }
    }

    fun updateList(updatedList: ArrayList<DayModel>) {
        arrayList.clear()
        arrayList.addAll(updatedList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = arrayList.size
}