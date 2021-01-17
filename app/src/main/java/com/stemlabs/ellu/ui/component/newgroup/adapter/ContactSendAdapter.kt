package com.stemlabs.ellu.ui.component.newgroup.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R

class ContactSendAdapter : RecyclerView.Adapter<ContactSendAdapter.ContactSendViewHolder>() {
    class ContactSendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactSendViewHolder {
        return ContactSendViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.listrow_contact_send, parent, false))
    }

    override fun onBindViewHolder(holder: ContactSendViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = 1
}