package com.stemlabs.ellu.ui.component.proximity.adapter

import android.content.Context
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ProximityUserModel
import kotlinx.android.synthetic.main.listrow_proximity_user.view.*
import java.util.ArrayList

class ProximityUserAdapter(var arrayList: MutableList<ProximityUserModel>, var isRoundBorder: Boolean = false) : RecyclerView.Adapter<ProximityUserAdapter.ProximityUserViewHolder>() {

    lateinit var listener: OnClickEvent
    lateinit var context: Context


    class ProximityUserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgProximityUser = itemView.imgProximityUser
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProximityUserViewHolder {
        context = parent.context!!
        return ProximityUserViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_proximity_user, parent, false))

    }

    override fun onBindViewHolder(holder: ProximityUserViewHolder, position: Int) {
        holder.imgProximityUser.setImageResource(arrayList.get(position).userIcon)
        if (isRoundBorder) {
            if (arrayList.get(position).isClicked) {
                holder.imgProximityUser.borderColor = ContextCompat.getColor(context!!, R.color.colorWhite)
                holder.imgProximityUser.borderWidth = context!!.resources.getDimension(R.dimen._5sdp).toInt()
                holder.imgProximityUser.colorFilter = null

            } else {
                holder.imgProximityUser.borderColor = ContextCompat.getColor(context!!, R.color.transparent)
                holder.imgProximityUser.borderWidth = 0
                holder.imgProximityUser.colorFilter = ColorMatrixColorFilter(ColorMatrix().apply { setSaturation(0f)})

            }
        } else {
            holder.imgProximityUser.borderColor = ContextCompat.getColor(context!!, R.color.transparent)
            holder.imgProximityUser.borderWidth = 0
        }

        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getClickAt(position)
        })
    }

    override fun getItemCount(): Int = arrayList.size

    public fun setClickEventListener(listener: OnClickEvent) {
        this.listener = listener
    }

    fun updateList(proximityUserList: ArrayList<ProximityUserModel>) {
        arrayList.clear()
        arrayList.addAll(proximityUserList)
        notifyDataSetChanged()
    }

    public interface OnClickEvent {
        public fun getClickAt(position: Int)
    }
}