package com.stemlabs.ellu.ui.component.calendar.fragment

import android.graphics.PorterDuff
import android.icu.text.Transliterator
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.CalenderModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.alarm.dialog.AlarmNameDialog
import com.stemlabs.ellu.ui.component.calendar.adapter.CalendarEventColorAdapter
import com.stemlabs.ellu.ui.component.calendar.adapter.CalendarEventPersonAdapter
import com.stemlabs.ellu.ui.component.calendar.adapter.CalenderAdapter
import com.stemlabs.ellu.ui.component.calendar.dialog.NotificationManageDialog
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_add_alarm.*
import kotlinx.android.synthetic.main.fragment_add_new_event.*
import kotlinx.android.synthetic.main.fragment_add_new_event.rvCalender
import kotlinx.android.synthetic.main.fragment_calendar.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class AddNewEventFragment : BaseFragment(), View.OnClickListener {

    var calenderAdapter = CalenderAdapter(mutableListOf())
    var strShortsOfWeek: String = ""
    var year: Int = 0
    var month: Int = 0
    var c = Calendar.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_new_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        imgRightIcon.setOnClickListener(this)
        tvCreateEventLBL.setOnClickListener(this)
        imgRightIcon.makeVisible()
        imgRightIcon.setImageResource(R.drawable.ic_close_white)
        imgRightIcon.setColorFilter(ContextCompat.getColor(baseActivity!!, R.color.colorBlack), PorterDuff.Mode.SRC_IN)
        llNotification.setOnClickListener(this)
        tvToolbarTitle.text = "Add New Event"
    }

    private fun initView() {
        setCurrentDate(c)
        var adapter = CalendarEventColorAdapter(mutableListOf())
        adapter.onSelectCalender = object : CalendarEventColorAdapter.OnSelectCalenderEvent {
            override fun onClickCalenderEventView(position: Int) {
            }
        }
        rvEventColor.adapter= adapter
        var adapterPerson = CalendarEventPersonAdapter(mutableListOf())
        adapterPerson.setClickPersonEvent(object : CalendarEventPersonAdapter.PersonClickEvent {
            override fun getClickAt(position: Int) {

            }

            override fun getDeleteAt(position: Int) {

            }

        })
        rvEventPerson.adapter = adapterPerson
        rvCalender.adapter = calenderAdapter
        calenderAdapter.onSelectCalender = object : CalenderAdapter.OnSelectCalender {
            override fun onClickCalenderView(calenderModel: CalenderModel, position: Int) {
                Log.e("TAG", "calenderModelClick-> ${calenderModel.date}-$month-$year")
                Log.e("TAG", "calenderModelClick-> $position")
                rvCalender.scrollToPosition(position)
                calenderAdapter.notifyDataSetChanged()
                c.set(Calendar.DAY_OF_MONTH, calenderModel.date.toInt())
                setCurrentDate(c)
            }
        }
    }


    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun setCurrentDate(cal: Calendar) {
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH) + 1
        val day = cal.get(Calendar.DAY_OF_MONTH)
        this.month = month
        this.year = year

        setCalenderData(day.toString(), month.toString(), year.toString())
        val fmt = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val date = cal.time
        Log.e("Date", "Current=> $date")
    }

    private fun setCalenderData(date: String, month: String, year: String) {
        val calenderList = ArrayList<CalenderModel>()
        val fmt = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        val cal = Calendar.getInstance()
        cal.clear()
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, 1)
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

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.llNotification -> {
                var notificationDialog = NotificationManageDialog()
                if (notificationDialog != null && notificationDialog!!.isAdded()) {
                    return;
                }
                notificationDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                notificationDialog!!.setNotificationDialogListener(object : NotificationManageDialog.OnClickSet {
                    override fun setClickSet(position: Int) {
                    }
                })

            }
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }
            R.id.tvCreateEventLBL -> {
                baseActivity!!.onBackPressed()
            }
            R.id.imgRightIcon -> {
                baseActivity!!.onBackPressed()
            }
        }
    }
}