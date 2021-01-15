package com.stemlabs.ellu.ui.component.newgroup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import com.viethoa.RecyclerViewFastScroller
import kotlinx.android.synthetic.main.item_new_group_selection.view.*


class NewGroupSelectionAdapter(
        var list: List<NewGroupModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) : RecyclerView.Adapter<NewGroupSelectionAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): NewGroupSelectionAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_new_group_selection, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: NewGroupSelectionAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])



        holder.itemView.ivClose.setOnClickListener(View.OnClickListener {
            callBack.onItemClicked(position, view)
        })
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return list.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(s: NewGroupModel) {

            itemView.tvName.setText(s.title)
            itemView.ivUserProfile.setImageResource(s.id)
        }
    }


}