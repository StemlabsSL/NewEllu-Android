package com.stemlabs.ellu.ui.component.settings.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.FaqModel
import kotlinx.android.synthetic.main.listrow_faq.view.*

class FAQAdapter(var arrayList: MutableList<FaqModel>) : RecyclerView.Adapter<FAQAdapter.FAQViewHolder>() {

    lateinit var listener: OnClickFAQ
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQViewHolder {
        context = parent.context!!
        return FAQViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_faq, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: FAQViewHolder, position: Int) {
        holder.tvFaqQuestion.text = arrayList.get(position).question
        holder.tvFaqAnswer.text = arrayList.get(position).answer

        if(arrayList.get(position).isClicked){
            holder.imgArrowFaq.rotation =180.0f
            holder.tvFaqAnswer.visibility =View.VISIBLE
        }else{
            holder.imgArrowFaq.rotation =270.0f
            holder.tvFaqAnswer.visibility =View.GONE
        }
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.clickFAQAt(position)
        })

    }


    class FAQViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvFaqQuestion = itemView.tvFaqQuestion!!
        var tvFaqAnswer = itemView.tvFaqAnswer!!
        var imgArrowFaq = itemView.imgArrowFaq!!
    }


    public fun setFaqClickListener(listener: OnClickFAQ) {
        this.listener = listener
    }

    fun updateList(faqList: MutableList<FaqModel>) {
        arrayList.clear()
        arrayList.addAll(faqList)
        notifyDataSetChanged()
    }

    public interface OnClickFAQ {
        public fun clickFAQAt(position: Int)
    }
}