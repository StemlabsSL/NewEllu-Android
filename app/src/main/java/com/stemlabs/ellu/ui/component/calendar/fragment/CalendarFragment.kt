package com.stemlabs.ellu.ui.component.calendar.fragment

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.ik024.calendar_lib.listeners.YearViewClickListeners
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CalenderModel
import com.stemlabs.ellu.data.model.EventModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter
import com.stemlabs.ellu.ui.component.calendar.adapter.EventAdapter
import com.stemlabs.ellu.ui.component.home.HomeActivity
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_calendar.*
import kotlinx.android.synthetic.main.profile_toolbar.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CalendarFragment : BaseFragment(), YearViewClickListeners, View.OnClickListener {

    var calenderAdapter = CalenderAdapter(mutableListOf())
    var strShortsOfWeek: String = ""
    var year: Int = 0
    var month: Int = 0
    var isHorizontal: Boolean = true
    var c = Calendar.getInstance()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (baseActivity as HomeActivity).setBottomVisibility()
        imgProfile.setImageResource(R.drawable.ic_close_white)
        imgProfile.setColorFilter(ContextCompat.getColor(requireContext()!!, R.color.colorBlack), PorterDuff.Mode.SRC_IN)
        imgProfile.rotation = 45.0f
//        imgProfile.maxWidth = 16
//        imgProfile.maxHeight = 16
//        imgProfile.minimumHeight = 16
//        imgProfile.minimumWidth = 16
        setOnClickLes()
        //setMonthView()
        setCurrentDate(c)
        calendar_year_view.registerYearViewClickListener(this)
        rvCalender.adapter = calenderAdapter
        calenderAdapter.onSelectCalender = object : CalenderAdapter.OnSelectCalender {
            override fun onClickCalenderView(calenderModel: CalenderModel, position: Int) {
                Log.e("TAG", "calenderModelClick-> ${calenderModel.date}-$month-$year")
                Log.e("TAG", "calenderModelClick-> $position")
                rvCalender.scrollToPosition(position)
                calenderAdapter.notifyDataSetChanged()
                c.set(Calendar.DAY_OF_MONTH, calenderModel.date.toInt())
                setCurrentDate(c)
                if (isHorizontal) {
                    tvMonthName.makeVisible()
                    imgCalendar.makeVisible()
                    isHorizontal = false
                    calenderAdapter.setDateVisible(isHorizontal)
                    rvCalender.layoutManager = GridLayoutManager(baseActivity!!, 7)
                    rvCalender.scrollToPosition(position)

                } else {
                    tvMonthName.makeGone()
                    imgCalendar.makeGone()
                    isHorizontal = true
                    calenderAdapter.setDateVisible(isHorizontal)
                    rvCalender.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    rvCalender.scrollToPosition(position)

                }
                //setMonthView()
            }
        }

        val list = ArrayList<EventModel>()
        list.add(EventModel(R.drawable.curve_medium_primary_red, R.color.colorE8AAAA, R.color.colorA23131))
        list.add(EventModel(R.drawable.curve_medium_primary_green, R.color.color9FDE9F, R.color.color31A239))
        list.add(EventModel(R.drawable.curve_medium_primary_orange, R.color.colorFEBE75, R.color.colorFF8800))
        rvEvent.adapter = EventAdapter(list)


    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    @SuppressLint("WrongConstant")
    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.imgChatToolbarUserProfile -> {
                (baseActivity as HomeActivity).drawerOpen()
            }
            R.id.imgProfile -> {
                replaceFragment(AddNewEventFragment(), true)
            }
            R.id.imgCalendar -> {
                llMainCalendarView.makeGone()
                calendar_year_view.makeVisible()
            }
        }
    }

    private fun setMonthView() {
        imgCalendar.makeVisible()
        calendar_year_view.makeGone()
        rvCalender.makeGone()
        calendarViewMonth.makeVisible()
        val febFirst = Calendar.getInstance()
        febFirst.set(2017, 1, 1, 0, 0)
        //  calendarViewMonth.minDate = febFirst.timeInMillis
        val febLast = Calendar.getInstance()
        febLast.set(2017, 2, 0, 0, 0)
        //calendarViewMonth.maxDate = febLast.timeInMillis
        //calendarViewMonth.date = febFirst.timeInMillis

        calendarViewMonth.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(view: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
                imgCalendar.makeGone()
                calendar_year_view.makeVisible()
                rvCalender.makeVisible()
                calendarViewMonth.makeGone()
            }
        })
    }

    private fun setOnClickLes() {
        //ivMenu.setOnClickListener(this)
        imgChatToolbarUserProfile.setOnClickListener(this)
        imgProfile.setOnClickListener(this)
        imgCalendar.setOnClickListener(this)
    }

    private fun setCurrentDate(cal: Calendar) {
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH) + 1
        val day = cal.get(Calendar.DAY_OF_MONTH)
        this.month = month
        this.year = year

        setCalenderData(day.toString(), month.toString(), year.toString())
        val fmt = SimpleDateFormat("MMMM", Locale.US)
        val date = cal.time

        Log.e("Date", "Current=> $date")
    }

    private fun setCalenderData(date: String, month: String, year: String) {
        val calenderList = ArrayList<CalenderModel>()
        val fmt = SimpleDateFormat("MMMM", Locale.US)
        val cal = Calendar.getInstance()
        cal.clear()
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, 1)
        var monthname = fmt.format(cal.getTime())
        tvMonthName.text = monthname
        val daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH)
        for (i in 0 until daysInMonth) {
            val date1 = cal.time
            //Log.e("Dates==>", "custom=>" + fmt.format(date1))
            cal.add(Calendar.DAY_OF_MONTH, 1)
            val day_format = SimpleDateFormat("EEEE", Locale.ENGLISH)
            val date_format = SimpleDateFormat("dd", Locale.ENGLISH)
            val str_day = day_format.format(date1)
            val str_date = date_format.format(date1)
            for (id in str_day.indices) {
                strShortsOfWeek = str_day.substring(0, 3)
            }
            val model = CalenderModel(strShortsOfWeek, str_date)
            calenderList.add(model)

        }
        calenderAdapter.iRow = Integer.parseInt(date) - 1
        calenderAdapter.updateList(calenderList)
        rvCalender.scrollToPosition((Integer.parseInt(date) - 1))

    }


    override fun onDestroyView() {
        super.onDestroyView()

        (baseActivity as HomeActivity).setBottomVisibility(false)
    }

    override fun dateClicked(year: Int, month: Int, day: Int) {
        llMainCalendarView.makeVisible()
        calendar_year_view.makeGone()
        rvCalender.makeVisible()
    }

}




