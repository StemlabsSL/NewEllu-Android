package com.stemlabs.ellu.ui.component.settings.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.model.FaqCategoryModel
import com.stemlabs.ellu.data.model.FaqModel
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.settings.adapter.FAQCategoryAdapter
import kotlinx.android.synthetic.main.fragment_faq.*
import kotlinx.android.synthetic.main.noraml_toolbar.*
import java.util.ArrayList


class FaqFragment : BaseFragment(), View.OnClickListener {

    var faqCategoryList = ArrayList<FaqCategoryModel>()
    lateinit var faqCategoryAdapter: FAQCategoryAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_faq, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHeader()
        initView()
    }

    private fun setHeader() {
        imgLeftIcon.setOnClickListener(this)
        tvToolbarTitle.text = "Frequently Asked Questions"
    }

    private fun initView() {
        setData()
        setRecyclearView()
    }

    private fun setRecyclearView() {
        faqCategoryAdapter = FAQCategoryAdapter(mutableListOf())
        faqCategoryAdapter.setFaqClickListener(object : FAQCategoryAdapter.OnSelectFAQ {
            override fun selectedCategoryAt(position: Int) {
                faqCategoryList.get(position).isClicked = !faqCategoryList.get(position).isClicked
                faqCategoryAdapter.notifyDataSetChanged()
            }

            override fun selectedFAQAt(outerPosition: Int, innerPosition: Int) {
                faqCategoryList.get(outerPosition).arrayList.get(innerPosition).isClicked = !faqCategoryList.get(outerPosition).arrayList.get(innerPosition).isClicked
                faqCategoryAdapter.notifyDataSetChanged()
            }
        })
        rvFaqCategory.adapter = faqCategoryAdapter
        faqCategoryAdapter.updateList(faqCategoryList)
    }

    private fun setData() {
        faqCategoryList.clear()
        var faqList = ArrayList<FaqModel>()
        faqList.add(FaqModel("What is Ellu?", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata."))
        faqList.add(FaqModel("How is TheGestor is different from traditional?", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata."))
        faqList.add(FaqModel("How is TheGestor is different from traditional?", "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata."))
        faqCategoryList.add(FaqCategoryModel("Invoice", faqList, true))
        faqCategoryList.add(FaqCategoryModel("Subscription", faqList))
        faqCategoryList.add(FaqCategoryModel("Pricing", faqList))
        faqCategoryList[0].arrayList[0].isClicked = true
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
        }
    }

}