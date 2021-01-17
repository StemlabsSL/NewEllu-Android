package com.stemlabs.ellu.ui.component.calendar.fragment

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.github.ik024.calendar_lib.listeners.YearViewClickListeners
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.home.HomeActivity
import kotlinx.android.synthetic.main.fragment_main_fragment.*
import kotlinx.android.synthetic.main.profile_toolbar.*
import kotlinx.android.synthetic.main.profile_toolbar.imgProfile


class CalenderMainFragment : BaseFragment() , View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun initView() {
        (baseActivity as HomeActivity).setBottomVisibility(true)
        imgProfile.setImageResource(R.drawable.ic_close_white)
        imgProfile.setColorFilter(ContextCompat.getColor(requireContext()!!, R.color.colorBlack), PorterDuff.Mode.SRC_IN)
        imgProfile.rotation = 45.0f
        setOnClickLes()

    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }

    public interface OnClickChatPopUp {
        public fun setClickPopUp()
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
        }
    }

    private fun setOnClickLes() {
        //ivMenu.setOnClickListener(this)
        imgChatToolbarUserProfile.setOnClickListener(this)
        imgProfile.setOnClickListener(this)
    }


}