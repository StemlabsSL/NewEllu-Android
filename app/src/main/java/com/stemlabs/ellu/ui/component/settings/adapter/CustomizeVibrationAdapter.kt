package com.stemlabs.ellu.ui.component.settings.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CustomizedVibrationModel
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.listrow_vibration_pattern.view.*

class CustomizeVibrationAdapter(var arrayList: MutableList<CustomizedVibrationModel>) : RecyclerView.Adapter<CustomizeVibrationAdapter.CustomizeVibrationViewHolder>() {

    lateinit var listener: OnClickVibration
    lateinit var context: Context

    class CustomizeVibrationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rbVibrationPattern = itemView.rbVibrationPattern!!
        var viewDivider = itemView.viewDivider!!
        var tvVibrationPatternTitle = itemView.tvVibrationPatternTitle!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomizeVibrationViewHolder {
        context = parent.context!!
        return CustomizeVibrationViewHolder(LayoutInflater.from(context!!).inflate(R.layout.listrow_vibration_pattern, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: CustomizeVibrationViewHolder, position: Int) {
        holder.tvVibrationPatternTitle.text = arrayList.get(position).title
        holder.rbVibrationPattern.isChecked = arrayList.get(position).isClicked
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.setClickVibrationAt(position)
        })
        if(position== arrayList.size-1){
            holder.viewDivider.makeInvisible()
        }else{
            holder.viewDivider.makeVisible()
        }

        holder.rbVibrationPattern.setOnClickListener(View.OnClickListener {
            listener.setClickVibrationAt(position)
        })
    }

    public fun setVibrationListener(listener: OnClickVibration) {
        this.listener = listener
    }

    fun updateList(vibrationToneList: ArrayList<CustomizedVibrationModel>) {
        arrayList.clear()
        arrayList.addAll(vibrationToneList)
        notifyDataSetChanged()
    }

    public interface OnClickVibration {
        public fun setClickVibrationAt(position: Int)
    }
}