package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ContactModel
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeInvisible
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.listrow_contacts.view.*
import java.util.ArrayList

class ContactAdapter(var arrayList: MutableList<ContactModel>, var fromWhere: String) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectContact

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgContactPersonProfile = itemView.imgContactPersonProfile!!
        var tvContactPersonName = itemView.tvContactPersonName!!
        var imgNotification = itemView.imgNotification!!
        var imgRadioButton = itemView.imgRadioButton!!
        var tvSOSLBL = itemView.tvSOSLBL!!
        var viewDivider = itemView.viewDivider!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        context = parent.context!!
        return ContactViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_contacts, parent, false))
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        if (arrayList.get(position).isSOS) holder.tvSOSLBL.makeVisible() else holder.tvSOSLBL.makeGone()
        if (arrayList.get(position).isNotification) holder.imgNotification.makeVisible() else holder.imgNotification.makeGone()
        holder.tvContactPersonName.text = arrayList.get(position).contactName
        holder.imgContactPersonProfile.setImageResource(arrayList.get(position).imgProfile)
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.getRowClickedAt(position)
        })
        if (fromWhere.equals("ContactsAllSoSPager")) {
            holder.imgRadioButton.makeGone()
        } else {
            holder.imgRadioButton.makeVisible()
            if (arrayList.get(position).isChecked) {
                holder.imgRadioButton.setImageResource(R.drawable.ic_contact_check)
            } else {
                holder.imgRadioButton.setImageResource(R.drawable.ic_contact_uncheck)
            }
        }

        if (position == arrayList.size - 1) {
            holder.viewDivider.makeInvisible()
        } else {
            holder.viewDivider.makeVisible()
        }
        holder.imgContactPersonProfile.setOnClickListener(View.OnClickListener {
            listener.getProfileClickedAt(position)
        })
        holder.tvSOSLBL.setOnClickListener(View.OnClickListener {
            listener.getSOSClickedAt(position)
        })
        holder.imgNotification.setOnClickListener(View.OnClickListener {
            listener.getNotificationClickedAt(position)
        })
        holder.imgRadioButton.setOnClickListener(View.OnClickListener {
            listener.getRadioClickedAt(position)
        })
    }

    override fun getItemCount(): Int = arrayList.size
    public fun setClickEventListener(listener: OnSelectContact) {
        this.listener = listener
    }

    fun updateList(contactList: ArrayList<ContactModel>) {
        arrayList.clear()
        arrayList.addAll(contactList)
        notifyDataSetChanged()
    }

    public interface OnSelectContact {
        public fun getProfileClickedAt(position: Int)
        public fun getRowClickedAt(position: Int)
        public fun getNotificationClickedAt(position: Int)
        public fun getSOSClickedAt(position: Int)
        public fun getRadioClickedAt(position: Int)
    }

}