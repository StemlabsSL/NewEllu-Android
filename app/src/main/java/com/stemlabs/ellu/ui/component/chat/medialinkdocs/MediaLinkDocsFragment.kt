package com.stemlabs.ellu.ui.component.chat.medialinkdocs

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager.widget.ViewPager
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.DocFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment.MediaLinkFragment
import kotlinx.android.synthetic.main.fragment_media_link_docs.*
import kotlinx.android.synthetic.main.noraml_toolbar.*

class MediaLinkDocsFragment : BaseFragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_media_link_docs, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        tvToolbarTitle.text = "Jane Doe"
        tvToolbarTitle.textAlignment = View.TEXT_ALIGNMENT_VIEW_START
        val typeface: Typeface = ResourcesCompat.getFont(baseActivity!!,R.font.raleway_bold)!!
        tvToolbarTitle.setTypeface(typeface)
        llMainToolbar.elevation =0.0f
        tvToolbarTitle.setTextColor(ContextCompat.getColor(baseActivity!!,R.color.colorPrimary))
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })
        setupViewPager(viewpager)
        tabs.setupWithViewPager(viewpager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.mFragmentList.clear()
        adapter.mFragmentTitleList.clear()
        adapter.addFragment(MediaFragment(), "MEDIA")
        adapter.addFragment(DocFragment(), "DOCS")
        adapter.addFragment(MediaLinkFragment(), "LINKS")
        viewPager.adapter = adapter

    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onDestroyView() {
        super.onDestroyView()


    }

    override fun onClick(v: View?) {
        when (v!!.id) {

        }
    }
}