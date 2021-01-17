package com.stemlabs.ellu.ui.component.sos.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSearchLocationAdapter
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSelectLocationAdapter
import com.stemlabs.ellu.ui.component.aware.model.SelectLocation
import com.stemlabs.ellu.ui.component.sos.adapter.SosEndAdapter
import com.stemlabs.ellu.ui.component.sos.model.SosEndModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.dialog_pager.view.*
import kotlinx.android.synthetic.main.dialog_sos_end_overlay.view.*
import kotlinx.android.synthetic.main.fragment_aware_select_a_place.*
import kotlinx.android.synthetic.main.noraml_toolbar.view.*


class SosEndOverlayDialog : DialogFragment(), MyOnItemClickListener {

    lateinit var viewPager: View
    private lateinit var adapter: SosEndAdapter
    var list = ArrayList<SosEndModel>()

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
        viewPager = inflater.inflate(R.layout.dialog_sos_end_overlay, container, false)

        viewPager.ivClose.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        viewPager.tvEndSosLBL.setOnClickListener(View.OnClickListener {
            dialog!!.dismiss()
        })
        setAdapter()

        return viewPager
    }

    private fun setAdapter() {
        viewPager.rvSos.layoutManager = LinearLayoutManager(context)

        list = ArrayList<SosEndModel>()
        list.add(SosEndModel("I am safe now.", true))
        list.add(SosEndModel("It was a mistake.", false))
        list.add(SosEndModel("I have got help now.", false))


        adapter = SosEndAdapter(list, requireContext(), this, viewPager.rvSos)
        viewPager.rvSos.adapter = adapter
    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }

    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

        for (i in 0 until list.size) {
            if (position == i) {
                list.get(position).isChecked = true
            } else {
                list.get(i).isChecked = false
            }
        }
        adapter.notifyDataSetChanged()

    }
}