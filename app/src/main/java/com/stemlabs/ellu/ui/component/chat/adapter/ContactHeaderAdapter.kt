package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.ContactHeaderModel
import kotlinx.android.synthetic.main.listrow_contact_header.view.*

class ContactHeaderAdapter(var arrayList: MutableList<ContactHeaderModel>, var fromWhere:String) : RecyclerView.Adapter<ContactHeaderAdapter.ContactHeaderViewHolder>() {
    lateinit var context: Context
    lateinit var listener:OnSelectContact

    inner class ContactHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvHeaderContact = itemView.tvHeaderContact!!
        var rvContacts = itemView.rvContacts!!

        init {
            var adapter = ContactAdapter(mutableListOf(),fromWhere)
            adapter.setClickEventListener(object :ContactAdapter.OnSelectContact{
                override fun getProfileClickedAt(position: Int) {
                    listener.getProfileClickedAt(adapterPosition,position)
                }

                override fun getRowClickedAt(position: Int) {
                    listener.getRowClickedAt(adapterPosition,position)
                }

                override fun getNotificationClickedAt(position: Int) {
                    listener.getNotificationClickedAt(adapterPosition,position)
                }

                override fun getSOSClickedAt(position: Int) {
                    listener.getSOSClickedAt(adapterPosition,position)
                }
                override fun getRadioClickedAt(position: Int) {
                    listener.getRadioClickedAt(adapterPosition,position)
                }
            })
            rvContacts.adapter= adapter
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHeaderViewHolder {
        context = parent.context
        return ContactHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_contact_header,parent,false))
    }

    override fun onBindViewHolder(holder: ContactHeaderViewHolder, position: Int) {
        holder.tvHeaderContact.text = arrayList.get(position).alphabetCharacter
        (holder.rvContacts.adapter as ContactAdapter).updateList(arrayList.get(position).contactList)
    }

    override fun getItemCount(): Int = arrayList.size

    public fun setContactClickEventListener(listener:OnSelectContact){
        this.listener = listener
    }

    public fun updateList(contactList:ArrayList<ContactHeaderModel>){
        arrayList.clear()
        arrayList.addAll(contactList)
        notifyDataSetChanged()
    }

    public interface OnSelectContact {
        public fun getProfileClickedAt(outerPosition: Int ,innerPosition: Int)
        public fun getRowClickedAt(outerPosition: Int,innerPosition: Int)
        public fun getNotificationClickedAt(outerPosition: Int,innerPosition: Int)
        public fun getSOSClickedAt(outerPosition: Int,innerPosition: Int)
        public fun getRadioClickedAt(outerPosition: Int,innerPosition: Int)
    }
}