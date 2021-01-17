package com.stemlabs.ellu.ui.component.customize.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedBandModel
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.listrow_customized_band.view.*
import java.util.ArrayList

class CustomizedBandAdapter(var arrayList :MutableList<CustomizedBandModel>) :RecyclerView.Adapter<CustomizedBandAdapter.CustomizedBandViewHolder>() {

    lateinit var context:Context
    lateinit var listener:OnSelect

    class CustomizedBandViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgCustomizedBand = itemView.imgCustomizedBand!!
        var tvCustomizedBandTitle = itemView.tvCustomizedBandTitle!!
        var switchCustomizedBand = itemView.switchCustomizedBand!!
        var viewDivider = itemView.viewDivider!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomizedBandViewHolder {
        context = parent.context
        return CustomizedBandViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.listrow_customized_band,parent,false))
    }

    override fun onBindViewHolder(holder: CustomizedBandViewHolder, position: Int) {
        holder.imgCustomizedBand.setImageResource(arrayList.get(position).imgCustomizedBand)
        holder.tvCustomizedBandTitle.text = arrayList.get(position).customizedBandTitle
        holder.switchCustomizedBand.isChecked = arrayList.get(position).isClicked
        holder.switchCustomizedBand.setOnClickListener(View.OnClickListener {
            listener.getSwitchClickedAt(position)
        })
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })

        if(position== (arrayList.size-1)){
            holder.viewDivider.makeInvisible()
        }else {
            holder.viewDivider.makeVisible()
        }
    }
    public  fun setClickListener(listener:OnSelect){
        this.listener = listener
    }

    override fun getItemCount(): Int = arrayList.size


    fun updateList(customizedBandList: ArrayList<CustomizedBandModel>) {
        arrayList.clear()
        arrayList.addAll(customizedBandList)
        notifyDataSetChanged()
    }

    public interface OnSelect{
        public fun getClickAt(position: Int)
        public fun getSwitchClickedAt(position: Int)
    }
}