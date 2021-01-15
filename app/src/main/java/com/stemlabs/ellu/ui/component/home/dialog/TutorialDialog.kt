package com.stemlabs.ellu.ui.component.home.dialog

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.dialog_turorial.*
import kotlinx.android.synthetic.main.dialog_turorial.view.*


class TutorialDialog : DialogFragment() {

    lateinit var viewTutorial: View
    var currentCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        currentCount = 1
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewTutorial = inflater.inflate(R.layout.dialog_turorial, container, false)
        initView()
        return viewTutorial
    }

    private fun initView() {
        viewTutorial.tvSkipLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
            listener.setClickOnSkip(currentCount)
        })


        viewTutorial.llNext.setOnClickListener(View.OnClickListener {
            currentCount++
            Log.e("currentCount","currentCount==>"+currentCount)
            if (currentCount == 18) {
                dialog!!.dismiss()
            } else if (currentCount == 17) {
                tvNextLBL.text = "END"
                setResourceImage(currentCount)
            } else {
                setResourceImage(currentCount)
            }
            listener.setClickOnNext(currentCount)
        })

    }

    private fun setResourceImage(currentCount: Int) {
        when (currentCount) {
            2 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_two)
            3 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_three)
            4 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_four)
            5 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_five)
            6 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_six)
            7 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_seven)
            8 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_eight)
            9 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_nine)
            10 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_ten)
            11 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_eleven)
            12 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_twelve)
            13 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_thirteen)
            14 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_fourteen)
            15 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_fifteen)
            16 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_sixteen)
            17 -> viewTutorial.imgTutorial.setImageResource(R.drawable.tutorial_seventeen)
        }
    }


    lateinit var listener: OnClickTutorial
    public fun setTutorialClickListener(listener: OnClickTutorial) {
        this.listener = listener
    }


    public interface OnClickTutorial {
        public fun setClickOnNext(currentCount: Int)
        public fun setClickOnSkip(currentCount: Int)
    }
}