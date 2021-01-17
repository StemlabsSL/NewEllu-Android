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
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocMainModel
import com.stemlabs.ellu.ui.component.chat.medialinkdocs.model.DocModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import kotlinx.android.synthetic.main.fragment_doc.*


class DocFragment : BaseFragment(), MyOnItemClickListener {

    private lateinit var adapterDocMain: DocMainAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_doc, container, false)

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

        rvDocMain.layoutManager = LinearLayoutManager(context)
        var list = ArrayList<DocMainModel>()
        var list2 = ArrayList<DocModel>()


        list2.add(DocModel("ELLU_MANUAL.pdf","17 KB PDF","11/07/2020",R.drawable.img_pdf))
        list2.add(DocModel("ELLU_WIREFRAME.xd","17 KB XD","11/07/2020",R.drawable.img_xd))
        list2.add(DocModel("ELLU_MANUAL.docx","17 KB DOCX","11/07/2020",R.drawable.img_word))

        list.add(DocMainModel("Today",list2))

        adapterDocMain = DocMainAdapter(list, requireContext(), this, rvDocMain)
        rvDocMain.adapter = adapterDocMain
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

    }


}