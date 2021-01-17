package com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSearchLocationAdapter
import com.stemlabs.ellu.ui.component.aware.adapter.AwareSelectLocationAdapter
import com.stemlabs.ellu.ui.component.aware.model.SelectLocation
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter.MediaMainAdapter
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.MediaMainModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_aware.*
import kotlinx.android.synthetic.main.fragment_aware_select_a_place.*
import kotlinx.android.synthetic.main.fragment_media.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class MediaFragment : BaseFragment(), MyOnItemClickListener {

    private lateinit var adapterMediaMain: MediaMainAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_media, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setAdapter()
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    private fun initView() {

    }

    private fun setAdapter() {

        rvMediaMain.layoutManager = LinearLayoutManager(context)
        var list = ArrayList<MediaMainModel>()
        var list2 = ArrayList<Int>()
        var list3 = ArrayList<Int>()

        list2.add(R.drawable.nature1)
        list2.add(R.drawable.nature2)
        list2.add(R.drawable.nature1)
        list2.add(R.drawable.nature2)

        list3.add(R.drawable.nature1)
        list3.add(R.drawable.nature2)

        list.add(MediaMainModel("Today",list2))
        list.add(MediaMainModel("Last Week",list3))

        adapterMediaMain = MediaMainAdapter(list, requireContext(), this, rvMediaMain)
        rvMediaMain.adapter = adapterMediaMain
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }


}