package com.stemlabs.ellu.ui.component.chat.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import kotlinx.android.synthetic.main.dialog_pager.view.*
import kotlinx.android.synthetic.main.noraml_toolbar.view.*


class PagerDialog : DialogFragment() {

    lateinit var viewPager: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        viewPager = inflater.inflate(R.layout.dialog_pager, container, false)
        initView()
        return viewPager
    }

    private fun initView() {
        viewPager.tvSendLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
            listener.setClickPopUp()
        })
        viewPager.imgLeftIcon.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()

        })
        viewPager.tvToolbarTitle.text = "Pager"


    }


    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }


    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }
}