package com.stemlabs.ellu.ui.component.settings.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.FaqCategoryModel
import kotlinx.android.synthetic.main.listrow_faq_category.view.*
import java.util.ArrayList

class FAQCategoryAdapter(var arrayList: MutableList<FaqCategoryModel>) : RecyclerView.Adapter<FAQCategoryAdapter.FAQCategoryViewHolder>() {

    lateinit var listener: OnSelectFAQ
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FAQCategoryViewHolder {
        context = parent.context!!
        return FAQCategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.listrow_faq_category, parent, false))
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: FAQCategoryViewHolder, position: Int) {
        holder.tvFaqCategoryTitle.text = arrayList.get(position).title
        (holder.rvFaq.adapter as FAQAdapter).updateList(arrayList[position].arrayList)
        if(arrayList.get(position).isClicked){
            holder.imgArrowFaqCategory.rotation =180.0f
            holder.rvFaq.visibility =View.VISIBLE
        }else{
            holder.imgArrowFaqCategory.rotation =270.0f
            holder.rvFaq.visibility =View.GONE
        }
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.selectedCategoryAt(position)
        })
    }


    inner class FAQCategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvFaqCategoryTitle = itemView.tvFaqCategoryTitle!!
        var imgArrowFaqCategory = itemView.imgArrowFaqCategory!!
        var rvFaq = itemView.rvFaq!!

        init {
            var faqAdapter =FAQAdapter(mutableListOf())
            faqAdapter.setFaqClickListener(object : FAQAdapter.OnClickFAQ{
                override fun clickFAQAt(position: Int) {
                    listener.selectedFAQAt(adapterPosition,position)
                }
            })
            rvFaq.adapter = faqAdapter
        }
    }


    public fun setFaqClickListener(listener: OnSelectFAQ) {
        this.listener = listener
    }

    fun updateList(faqCategoryList: ArrayList<FaqCategoryModel>) {
        arrayList.clear()
        arrayList.addAll(faqCategoryList)
        notifyDataSetChanged()
    }

    public interface OnSelectFAQ {
        public fun selectedCategoryAt(position: Int)
        public fun selectedFAQAt(outerPosition: Int, innerPosition: Int)
    }
}