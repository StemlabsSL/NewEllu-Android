package com.github.ik024.calendar_lib.listeners;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by ismail.khan2 on 6/8/2016.
 */
public interface MyOnItemClickListener {

    void onItemClicked(int position , RecyclerView view,int year,int month);
}
