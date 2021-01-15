package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.IndividualChatHeaderModel
import com.stemlabs.ellu.utils.MessageSwipeController
import com.stemlabs.ellu.utils.SwipeControllerActions
import kotlinx.android.synthetic.main.listrow_invidividual_chat_header.view.*
import java.util.ArrayList

class IndividualChatHeaderAdapter(var arrayList: MutableList<IndividualChatHeaderModel>) : RecyclerView.Adapter<IndividualChatHeaderAdapter.IndividualChatHeaderViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnSelectChatHeader

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndividualChatHeaderViewHolder {
        context = parent!!.context
        return IndividualChatHeaderViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_invidividual_chat_header, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: IndividualChatHeaderViewHolder, position: Int) {
        holder.tvChatDateHeader.text = arrayList.get(position).date
        (holder.rvChat.adapter as IndividualChatAdapter).updateList(arrayList.get(position).arrayList)
    }


    inner class IndividualChatHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvChatDateHeader = itemView.tvChatDateHeader!!
        var rvChat = itemView.rvChat!!

        init {
            var adapter = IndividualChatAdapter(mutableListOf())


           /* var simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {


                override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
                    return false;
                }

                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, RIGHT)
                }
            }*/

            val messageSwipeController = MessageSwipeController(context, object : SwipeControllerActions {
                override fun showReplyUI(position: Int) {
                    listener.getSwipeEvent(adapterPosition, position)

                }
            })
            val itemTouchHelper = ItemTouchHelper(messageSwipeController)
            itemTouchHelper.attachToRecyclerView(rvChat)
            adapter.setChatListener(object : IndividualChatAdapter.OnChatSelect {
                override fun getChatAt(position: Int) {
                    listener.getClickAt(adapterPosition, position)
                }
            })
            rvChat.adapter = adapter
        }
    }

    public fun setChatClickEventListener(listener: OnSelectChatHeader) {
        this.listener = listener
    }

    fun updateList(chatList: ArrayList<IndividualChatHeaderModel>) {
        arrayList.clear()
        arrayList.addAll(chatList)
        notifyDataSetChanged()
    }

    public interface OnSelectChatHeader {
        public fun getClickAt(outerposition: Int, innerposition: Int)
        public fun getSwipeEvent(outerposition: Int, innerposition: Int)
    }


}