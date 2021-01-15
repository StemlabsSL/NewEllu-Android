package com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.LinkMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.MediaMainModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.item_link_main.view.*


class LinkMainAdapter(
        var list: List<LinkMainModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
        RecyclerView.Adapter<LinkMainAdapter.ViewHolder>(), MyOnItemClickListener {

    private lateinit var adapterLink: LinkAdapter

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): LinkMainAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_link_main, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: LinkMainAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])


        holder.itemView.rvLink.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        adapterLink = LinkAdapter(list.get(position).list, context, this, holder.itemView.rvLink)
        holder.itemView.rvLink.adapter = adapterLink

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

        fun bindItems(s: LinkMainModel) {

            itemView.tvIndexTitle.setText(s.title)

        }
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }
}