package com.github.ik024.calendar_lib.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.github.ik024.calendar_lib.R;
import com.github.ik024.calendar_lib.custom.MonthView;
import com.github.ik024.calendar_lib.custom.YearItem;
import com.github.ik024.calendar_lib.listeners.MonthViewClickListeners;
import com.github.ik024.calendar_lib.listeners.MyOnItemClickListener;
import com.github.ik024.calendar_lib.listeners.YearViewClickListeners;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class YearItemAdapter extends RecyclerView.Adapter<YearItemAdapter.MyViewHolder> implements MonthViewClickListeners {

    private List<YearItem> list;
    private Context context;
    private YearViewClickListeners callBack;
    private RecyclerView recyclerView;

    @Override
    public void dateClicked(Date dateClicked) {
        if (callBack != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateClicked);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            callBack.dateClicked(year, month, day);
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        MonthView monthView;

        public MyViewHolder(View view) {
            super(view);
            monthView = (MonthView) view.findViewById(R.id.mv_year_view_jan);
        }
    }


    public YearItemAdapter(List<YearItem> list, Context context,
                           YearViewClickListeners callBack,
                           RecyclerView view) {
        this.list = list;
        this.context = context;
        this.callBack = callBack;
        this.recyclerView = view;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.year_view_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.monthView.updateCalendar(list.get(position).getYear(), list.get(position).getMonth());

        holder.monthView.setPreviousButtonVisibility(View.GONE);
        holder.monthView.setNextButtonVisibility(View.GONE);
        holder.monthView.setIsMonthView(false);
        holder.monthView.registerClickListener(this);
//        monthViewSetters(jan);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                callBack.onItemClicked(position, recyclerView, list.get(position).getYear(), list.get(position).getMonth());
//            }
//        });
    }

    private void monthViewSetters(MonthView monthView) {
//        if (monthView != null) {
//            monthView.setCurrentDayTextColor(currentDayTextColor);
//            monthView.setDaysOfMonthTextColor(daysOfMonthTextColor);
//            monthView.setDaysOfWeekTextColor(daysOfWeekTextColor);
//            monthView.setMonthNameTextColor(monthTextColor);
//
//        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}