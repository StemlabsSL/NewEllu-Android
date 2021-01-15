package com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.LinkModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.item_chat_main_list.view.*
import kotlinx.android.synthetic.main.item_doc.view.*
import kotlinx.android.synthetic.main.item_doc.view.tvDate
import kotlinx.android.synthetic.main.item_media.view.*
import kotlinx.android.synthetic.main.item_media.view.ivMedia


class LinkAdapter(
        var list: List<LinkModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
        RecyclerView.Adapter<LinkAdapter.ViewHolder>() {


    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): LinkAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_link, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: LinkAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])

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

        fun bindItems(s: LinkModel) {
            itemView.tvtitle.setText(s.titleMain)
            itemView.tvDescription.setText(s.detail)
        }
    }
}