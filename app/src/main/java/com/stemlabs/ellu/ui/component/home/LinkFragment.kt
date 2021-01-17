package com.stemlabs.ellu.ui.component.home


import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.DayModel
import com.stemlabs.ellu.ui.ViewModelFactory
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aboutband.adapter.DottedPhoneAdapter
import com.stemlabs.ellu.ui.component.aboutband.fragment.UpdateBandFragment
import com.stemlabs.ellu.utils.findPerOf
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.fragment_link.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class LinkFragment : BaseFragment() {

    var isBand: Boolean = false
    lateinit var dottedPhoneAdapter: DottedPhoneAdapter
    var dottedList = ArrayList<DayModel>()
    var position: Int = 0

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_link, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        tvToolbarTitle.text = "Link"
        btnBand.setOnClickListener(View.OnClickListener {
            if (btnBand.text.toString().equals("CONTINUE")) {
                replaceFragment(UpdateBandFragment("Link"), true)
            } else if (btnBand.text.toString().equals("ADD BAND")) {
                setTimerView()
            } else if (btnBand.text.toString().equals("STOP SEARCHING")) {
                llNoBand.visibility = View.VISIBLE
                llContiune.visibility = View.GONE
                btnBand.text = "ADD BAND"
            } else {
                llNoBand.visibility = View.GONE
                llContiune.visibility = View.VISIBLE
                btnBand.text = "CONTINUE"
            }
        })
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
    }

    var timer: CountDownTimer? = null

    private fun setTimerView() {
        dottedList.clear()
        dottedList.add(DayModel("", false))
        dottedList.add(DayModel("", false))
        dottedList.add(DayModel("", false))
        dottedList.add(DayModel("", false))
        dottedList.add(DayModel("", false))
        llNoBand.visibility = View.GONE
        llContiune.visibility = View.VISIBLE
        dottedPhoneAdapter = DottedPhoneAdapter(mutableListOf())
        dottedPhoneAdapter.updateList(dottedList)
        rvDottedLinkView.adapter = dottedPhoneAdapter
        btnBand.text = "STOP SEARCHING"
        rvDottedLinkView.makeVisible()
        dottedList[0].isClicked = true
        dottedPhoneAdapter.notifyDataSetChanged()
        timer = object : CountDownTimer(TimeUnit.MILLISECONDS.toMillis(4000), TimeUnit.SECONDS.toMillis(1)) {
            override fun onTick(millisUntilFinished: Long) {
                try {
                    if (position < dottedList.size) {
                        dottedList[position].isClicked = true
                        dottedPhoneAdapter.notifyDataSetChanged()
                    }
                    position++

                } catch (e: Exception) {


                }

            }

            override fun onFinish() {
                imgSuccess.visibility = View.VISIBLE
                rvDottedLinkView.visibility = View.GONE
                tvDescription.text = "Successfully Linked!"
                btnBand.text = "CONTINUE"
                isBand = false
            }

        }
        timer!!.start()


    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (timer != null) {
            timer!!.cancel()
            timer = null
        }
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }
}