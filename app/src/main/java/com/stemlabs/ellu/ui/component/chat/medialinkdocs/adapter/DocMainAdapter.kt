package com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.MediaMainModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_media.*
import kotlinx.android.synthetic.main.item_media_main.view.*


class DocMainAdapter(
        var list: List<DocMainModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
        RecyclerView.Adapter<DocMainAdapter.ViewHolder>(), MyOnItemClickListener {

    private lateinit var adapterDoc: DocAdapter

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): DocMainAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_doc_main, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: DocMainAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])


        holder.itemView.rvMedia.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        adapterDoc = DocAdapter(list.get(position).list, context, this, holder.itemView.rvMedia)
        holder.itemView.rvMedia.adapter = adapterDoc

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

        fun bindItems(s: DocMainModel) {

            itemView.tvIndexTitle.setText(s.title)

        }
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }
}