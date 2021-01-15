package com.stemlabs.ellu.ui.component.newgroup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import com.viethoa.RecyclerViewFastScroller
import kotlinx.android.synthetic.main.item_new_group.view.*


class NewGroupAdapter(
        var list: List<NewGroupModel>,
        val context: Context,
        var callBack: MyOnItemClickListener,
        var view: RecyclerView,
        var status: String
) :
        RecyclerView.Adapter<NewGroupAdapter.ViewHolder>(), RecyclerViewFastScroller.BubbleTextGetter {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): NewGroupAdapter.ViewHolder {
        val v =
                LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_new_group, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: NewGroupAdapter.ViewHolder, position: Int) {
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
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(s: NewGroupModel) {
            if (status.equals("call")) {
                itemView.imgCall.makeGone()
                itemView.imgVideo.makeGone()
            } else {
                itemView.imgCall.makeGone()
                itemView.imgVideo.makeGone()
            }
            itemView.tvName.setText(s.title)
            itemView.ivUserProfile.setImageResource(s.id)

        }
    }

    override fun getTextToShowInBubble(pos: Int): String? {
        if (pos < 0 || pos >= list.size)
            return null

        val name: String = list.get(pos).title
        return if (name == null || name.length < 1)
            null
        else list.get(pos).title.substring(0, 1)
    }
}