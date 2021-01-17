package com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.MediaMainModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_media.*
import kotlinx.android.synthetic.main.item_media_main.view.*


class MediaMainAdapter(
        var list: List<MediaMainModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView
) :
        RecyclerView.Adapter<MediaMainAdapter.ViewHolder>(), MyOnItemClickListener {

    private lateinit var adapterMedia: MediaAdapter

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): MediaMainAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_media_main, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: MediaMainAdapter.ViewHolder, position: Int) {
        holder.bindItems(list[position])


        holder.itemView.rvMedia.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        adapterMedia = MediaAdapter(list.get(position).list, context, this, holder.itemView.rvMedia)
        holder.itemView.rvMedia.adapter = adapterMedia

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

        fun bindItems(s: MediaMainModel) {

            itemView.tvIndexTitle.setText(s.title)


        }
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }
}