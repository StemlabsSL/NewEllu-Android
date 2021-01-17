package com.stemlabs.ellu.ui.component.meet.fragment

import android.R.attr.*
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.MeetPersonModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareSelectAPlaceFragment
import com.stemlabs.ellu.ui.component.meet.adapter.MeetPersonAdapter
import com.stemlabs.ellu.utils.GlobalMethods
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import kotlinx.android.synthetic.main.fragment_meet_sender.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.*
import kotlin.collections.ArrayList


class MeetSenderFragment(var fromWhere: String) : BaseFragment(), View.OnClickListener,
        DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    lateinit var meetPersonAdapter: MeetPersonAdapter
    var meetPersonList = ArrayList<MeetPersonModel>()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meet_sender, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
        setHeader()
        initView()
    }

    private fun setData() {
        meetPersonList.clear()
        if (fromWhere.equals("Sender") || fromWhere.equals("Receiver"))
            meetPersonList.add(MeetPersonModel("You", R.drawable.img_add_new_contact, R.drawable.ic_question_greybg))
        meetPersonList.add(MeetPersonModel("David", R.drawable.ic_men_sample_two, R.drawable.ic_red_close))
        meetPersonList.add(MeetPersonModel("Jason", R.drawable.ic_women_sample_one, R.drawable.ic_question_greybg))
        meetPersonList.add(MeetPersonModel("Angelina", R.drawable.ic_women_sample_one, R.drawable.ic_green_tick))
        if (fromWhere.equals("Created"))
            meetPersonList.add(MeetPersonModel("ADD", R.drawable.ic_meet_add_blue, R.drawable.ic_green_tick))
        meetPersonAdapter = MeetPersonAdapter(mutableListOf())
        meetPersonAdapter.setMeetPersonListener(object : MeetPersonAdapter.ClickMeetPerson {
            override fun getClickAt(position: Int) {

            }
        })
        rvMeetPerson.adapter = meetPersonAdapter
        meetPersonAdapter.updateList(meetPersonList)
    }

    private fun setHeader() {

        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Lets Meet"
    }

    private fun initView() {
        if (fromWhere.equals("Sender")) {
            llSenderView.makeVisible()
            llReceiverView.makeGone()
            tvSendLBL.makeVisible()
        } else if (fromWhere.equals("Receiver")) {
            llSenderView.makeGone()
            llReceiverView.makeVisible()
            imgMap.makeVisible()
            tvWhoCommingLBL.makeVisible()
            rvMeetPerson.makeVisible()
            llResponse.makeVisible()
            tvSendLBL.makeGone()
        } else {
            llReceiverView.makeVisible()
            llSenderView.makeVisible()
            tvSendLBL.makeVisible()
            tvSendLBL.alpha = 1.0f
            tvSendLBL.text = "CANCEL MEETING"
            val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(baseActivity!!.resources.getDimension(R.dimen._16sdp).toInt(), baseActivity!!.resources.getDimension(R.dimen._minus15sdp).toInt(), baseActivity!!.resources.getDimension(R.dimen._16sdp).toInt(), baseActivity!!.resources.getDimension(R.dimen._25sdp).toInt())
            tvSendLBL.layoutParams = params
            tvSendLBL.background = ContextCompat.getDrawable(baseActivity!!, R.drawable.cancel_meeting_bg)
            edtLetMeetTitle.setText("Lunch")
            edtLetMeetLocation.setText("Meat The Cheese")
            tvLetMeetDate.setText("Nov 17, 2018")
            tvLetMeetTime.setText("12:30 PM")
            edtSomethingElse.makeGone()
            llReceiverTopView.makeGone()

        }
        tvSendLBL.setOnClickListener(this)
        rlWhereLetMeetLocation.setOnClickListener(this)
        tvYESLBL.setOnClickListener(this)
        tvNOLBL.setOnClickListener(this)
        llLetMeetDate.setOnClickListener(this)
        llLetMeetTime.setOnClickListener(this)
        edtLetMeetLocation.onFocusChangeListener = View.OnFocusChangeListener { view, b ->
            if (b) {
                rlWhereLetMeetLocation.performClick()
            } else {

            }
        }
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> {
                baseActivity!!.onBackPressed()
            }

            R.id.tvSendLBL -> {

                if (tvSendLBL.text.toString().equals("Send", true)) {
                    replaceFragment(MeetCardAnimationFragment("Sent"), true, true)
                } else {
                    baseActivity!!.onBackPressed()
                }
            }
            R.id.rlWhereLetMeetLocation -> {
                replaceFragment(AwareSelectAPlaceFragment("Meet"), true)
            }
            R.id.llLetMeetDate -> {
                openDatePicker()
            }
            R.id.llLetMeetTime -> {
                openTimePicker()
            }
            R.id.tvYESLBL -> {
                tvYESLBL.makeGone()
                tvNOLBL.makeGone()
                meetPersonList.get(0).smallImage = R.drawable.ic_green_tick
                meetPersonAdapter.notifyDataSetChanged()
            }
            R.id.tvNOLBL -> {
                tvYESLBL.makeGone()
                tvNOLBL.makeGone()
                meetPersonList.get(0).smallImage = R.drawable.ic_red_close
                meetPersonAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun openTimePicker() {
        val dpd = TimePickerDialog.newInstance(this@MeetSenderFragment as TimePickerDialog.OnTimeSetListener?, true)
        dpd.setOnCancelListener { Log.d("DatePicker", "Dialog was cancelled") }
        dpd.show(baseActivity!!.fragmentManager, "Datepickerdialog")
    }

    private fun openDatePicker() {
        val now = Calendar.getInstance()
        val dpd =
                DatePickerDialog.newInstance(
                        this@MeetSenderFragment as DatePickerDialog.OnDateSetListener?, now
                )

        dpd.minDate = now

        /* run {
             var loopdate: Calendar = startCalender
             while (startCalender.before(endCalender)) {
                 val dayOfWeek = loopdate[Calendar.DAY_OF_WEEK]
                 if (payload!!.time_slots.contains(getDay(dayOfWeek))) {
                     val disabledDays = arrayOfNulls<Calendar>(1)
                     disabledDays[0] = loopdate
                     dpd.setDisabledDays(disabledDays)
                 }
                 startCalender.add(Calendar.DATE, 1)
                 loopdate = startCalender
             }
         }*/
        dpd.setOnCancelListener { Log.d("DatePicker", "Dialog was cancelled") }
        dpd.show(baseActivity!!.fragmentManager, "Datepickerdialog")
    }

    override fun onDateSet(view: DatePickerDialog?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
        var date_selected: String
        date_selected = if (monthOfYear == 10 || monthOfYear == 11 || monthOfYear == 9) {
            if (dayOfMonth < 10) {
                year.toString() + "-" + (monthOfYear + 1) + "-0" + dayOfMonth
            } else {
                year.toString() + "-" + (monthOfYear + 1) + "-" + dayOfMonth
            }
        } else {
            if (dayOfMonth < 10) {
                year.toString() + "-" + "0" + (monthOfYear + 1) + "-" + "0" + dayOfMonth
            } else {
                year.toString() + "-" + "0" + (monthOfYear + 1) + "-" + dayOfMonth
            }
        }
        var apidate = date_selected
        date_selected = GlobalMethods.changeDateForDateFormat(date_selected)
        tvLetMeetDate.setText("" + date_selected)
        Log.e("date_selected ", "date_selected===$date_selected")
        checkValidation()

    }


    override fun onTimeSet(view: TimePickerDialog?, hourOfDay: Int, minute: Int, second: Int) {
        var endTime = "" + hourOfDay + ":" + minute + ":0" + second
        tvLetMeetTime.setText("" + GlobalMethods.getFormatedDateTime(endTime, "HH:mm:ss", "hh:mm a"))
        checkValidation()
    }

    private fun checkValidation(): Boolean {
        var isValid = true
        if (tvLetMeetDate.text.toString().equals("Date")) {
            isValid = false
            tvSendLBL.isEnabled = false
        }
        if (tvLetMeetTime.text.toString().equals("Time")) {
            isValid = false
            tvSendLBL.isEnabled = false
        }

        if (isValid) {
            tvSendLBL.alpha = 1.0f
            tvSendLBL.isEnabled = true
        }
        return isValid

    }
}