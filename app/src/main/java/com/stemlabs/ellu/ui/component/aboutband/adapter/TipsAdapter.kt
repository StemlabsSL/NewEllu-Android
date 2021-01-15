package com.stemlabs.ellu.ui.component.aboutband.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.listrow_tips_detail.view.*
import java.util.ArrayList

class TipsAdapter(var arrayList: MutableList<Int>) : RecyclerView.Adapter<TipsAdapter.TipsViewHolder>() {

    lateinit var context: Context

    class TipsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // var img = itemView.img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipsViewHolder {
        context = parent.context!!
        return TipsViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_tips_detail,parent,false))
    }

    override fun onBindViewHolder(holder: TipsViewHolder, position: Int) {
        //holder.img.setImageResource(arrayList.get(position))

    }

    override fun getItemCount(): Int = arrayList.size
    fun updateList(tipsListOne: ArrayList<Int>) {
        arrayList.clear()
        arrayList.addAll(tipsListOne)
        notifyDataSetChanged()
    }
}