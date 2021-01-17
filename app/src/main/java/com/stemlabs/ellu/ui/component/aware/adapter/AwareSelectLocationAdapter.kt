package com.stemlabs.ellu.ui.component.aware.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.aware.model.SelectLocation
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.item_select_location.view.*


class AwareSelectLocationAdapter(
        var list: List<SelectLocation>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
    RecyclerView.Adapter<AwareSelectLocationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AwareSelectLocationAdapter.ViewHolder {
        val v =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_select_location, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: AwareSelectLocationAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])

       if(position%2==0){
           holder.itemView.llItemMain.setBackgroundColor(context.resources.getColor(R.color.colorWhite))
       }else{
           holder.itemView.llItemMain.setBackgroundColor(context.resources.getColor(R.color.color200000029))
       }

        holder.itemView.setOnClickListener(View.OnClickListener {
            callBack.onItemClicked(position,view)
        })
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(s: SelectLocation) {

            itemView.tvLocationTitle.setText(s.title)
            itemView.tvLocationDetial.setText(s.detail)
            itemView.tvLocationDistance.setText(s.distance)

        }
    }
}