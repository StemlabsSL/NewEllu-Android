package com.stemlabs.ellu.utils

import android.view.View
import androidx.recyclerview.widget.RecyclerView

interface MyCommonOnViewClick {
    fun onViewClick(view: View)
}

interface MyOnItemClickListener {

    fun onItemClicked(position: Int,view:RecyclerView)
}

interface MyOnItemClickListenerTwo {

    fun onItemClicked(position: Int,secondposition: Int)
}