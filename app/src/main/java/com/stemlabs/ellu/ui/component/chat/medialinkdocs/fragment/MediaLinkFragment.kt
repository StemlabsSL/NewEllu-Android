package com.stemlabs.ellu.ui.component.chat.medialinkdocs.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter.DocMainAdapter
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.adapter.LinkMainAdapter
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.LinkMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.LinkModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_media_link.*


class MediaLinkFragment : BaseFragment(), MyOnItemClickListener {

    private lateinit var adapterLinkMain: LinkMainAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_media_link, container, false)

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

        rvLinkMain.layoutManager = LinearLayoutManager(context)
        var list = ArrayList<LinkMainModel>()
        var list2 = ArrayList<LinkModel>()


        list2.add(LinkModel("https://meet.google.com/bmh-qnuo-rch","meet.google.com"))
        list2.add(LinkModel("https://www.youtube.com/watch?v=m..","youtube.com"))
        list2.add(LinkModel("https://www.defensenews.com/breaki..","defensenews.com"))

        list.add(LinkMainModel("Today",list2))

        adapterLinkMain = LinkMainAdapter(list, requireContext(), this, rvLinkMain)
        rvLinkMain.adapter = adapterLinkMain
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }


}