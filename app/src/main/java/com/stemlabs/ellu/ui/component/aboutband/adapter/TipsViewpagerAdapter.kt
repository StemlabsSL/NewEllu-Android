package com.stemlabs.ellu.ui.component.aboutband.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide


import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.TipsModel

class TipsViewpagerAdapter(
    private var context: Context,
    private var arrayList: MutableList<TipsModel>
) :
    PagerAdapter() {
   // lateinit var listener : OnSelectList


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`

    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        context = container.context
        var itemView =
            LayoutInflater.from(container.context).inflate(
                R.layout.listrow_tips_detail,
                null
            ) as View
        var tvTipTitle = itemView.findViewById(R.id.tvTipTitle) as TextView
        var imgTips = itemView.findViewById(R.id.imgTips) as ImageView
        var tvTipsDescription = itemView.findViewById(R.id.tvTipsDescription) as TextView
        tvTipTitle.setText(arrayList.get(position).title)
        tvTipsDescription.setText(arrayList.get(position).description)
        imgTips.setImageResource(arrayList.get(position).image)
        /*Glide.with(image.context).load(arrayList.get(position).image)
            .placeholder(R.drawable.ic_educator_app_short)
            .override(350, 300).fitCenter().into(image)*/


        //image.setImageResource(arrayList.get(position).icon)
        container.addView(itemView)
       /* image.setOnClickListener(View.OnClickListener {
            Log.e("redirect_advertisement","redirect_advertisement_category_id=="+arrayList.get(position).redirect_advertisement_category_id)
            listener.onSelect(arrayList.get(position))
        })*/
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    fun updateList(topBannerList: MutableList<TipsModel>) {
        arrayList.clear()
        arrayList.addAll(topBannerList)
        notifyDataSetChanged()

    }

  /*  fun setListenerBanner (listener :OnSelectList){
        this.listener = listener
    }*/

   /* interface OnSelectList{
        fun onSelect(payload:HomeBannerApiResponse.Payload.Top)
    }*/
}