package com.stemlabs.ellu.ui.component.chat.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.stemlabs.ellu.R
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.dialog_report.view.*


class ReportChatDialog(var fromWhere :String = "report") : DialogFragment() {

    lateinit var viewReportDialog: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MaterialDialogSheet)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        //  super.setupDialog(dialog, style)
        dialog.window!!.setBackgroundDrawableResource(R.color.transparent)
        dialog.window!!.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window!!.setGravity(Gravity.CENTER)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewReportDialog = inflater.inflate(R.layout.dialog_report, container, false)
        initView()
        return viewReportDialog
    }

    private fun initView() {

        if(fromWhere.equals("clear")){
            viewReportDialog.tvDeleteChatQuestion.makeVisible()
            viewReportDialog.tvReportContactLBL.makeGone()
            viewReportDialog.tvBlockContact.text ="Delete media in this chat"
            viewReportDialog.tvReportLBL.text ="CLEAR"
        }else if(fromWhere.equals("block")){
            viewReportDialog.tvDeleteChatQuestion.makeVisible()
            viewReportDialog.tvReportContactLBL.makeGone()
            viewReportDialog.llBlockContact.makeGone()
            viewReportDialog.tvDeleteChatQuestion.text ="Block Jane Doe? Blocked contacts will no longer be able to call you or send you messages."
            viewReportDialog.tvReportLBL.text ="BLOCK"
        }
        viewReportDialog.tvCancelLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        viewReportDialog.tvReportLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
            listener.setOKOnClickReport(viewReportDialog.checkBoxBlockContact.isChecked)
        })

    }


    lateinit var listener: OnClickReport
    public fun setReportChatPopUpListener(listener: OnClickReport) {
        this.listener = listener
    }


    public interface OnClickReport {
        public fun setOKOnClickReport(isBlockContact:Boolean)
    }
}