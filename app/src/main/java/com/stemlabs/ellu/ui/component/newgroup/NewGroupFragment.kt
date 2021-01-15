package com.stemlabs.ellu.ui.component.newgroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment
import com.stemlabs.ellu.ui.component.newgroup.adapter.NewGroupAdapter
import com.stemlabs.ellu.ui.component.newgroup.adapter.NewGroupSelectionAdapter
import com.stemlabs.ellu.ui.component.newgroup.model.NewGroupModel
import com.stemlabs.ellu.utils.MyOnItemClickListener
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import com.viethoa.models.AlphabetItem
import kotlinx.android.synthetic.main.fragment_new_group.*
import kotlinx.android.synthetic.main.noraml_toolbar.*


class NewGroupFragment(var status: String) : BaseFragment(), MyOnItemClickListener {


    private lateinit var adapter: NewGroupAdapter
    private lateinit var adapter2: NewGroupSelectionAdapter
    var list = ArrayList<NewGroupModel>()
    var list2 = ArrayList<NewGroupModel>()
    private var mAlphabetItems: ArrayList<AlphabetItem>? = null
    var itemClickable = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_new_group, container, false)

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
        if (status.equals("IndividualChat")) {
            itemClickable = true
            llNewGroup.makeGone()
            tvToolbarTitle.text = "Contacts to Send"
        } else if (status.equals("chat")) {
            tvToolbarTitle.text = "Select Contact"
        } else if (status.equals("call")) {
            tvNewGroupLBL.text = "New Group Call"
            tvToolbarTitle.text = "Select Contact"
        } else {
            tvToolbarTitle.text = "Select Contact"

        }
        imgRightIcon.visibility = View.VISIBLE
        imgLeftIcon.setOnClickListener(View.OnClickListener {
            baseActivity!!.onBackPressed()
        })

        llNewGroup.setOnClickListener(View.OnClickListener {
            llNewGroup.visibility = View.GONE
            itemClickable = true
            if (status.equals("chat")) {
                tvToolbarTitle.text = "New Group"
            } else if (status.equals("call")) {
                tvToolbarTitle.text = "New Group Call"
            }
        })
        imgDone.setOnClickListener(View.OnClickListener {
            if (status.equals("chat")) {
                replaceFragment(IndividualChatFragment("Group"), true)
            } /*else if (status.equals("call")) {
                replaceFragment(IndividualChatFragment("Group"))
            }*/
        })

        ivGroupSelectionDone.setOnClickListener(View.OnClickListener {
            if (status.equals("IndividualChat")) {
                replaceFragment(ContactsToSendFragment(), false)
            } else {
                llGroupIcons.elevation = 0.0f
                llNewGroup.makeGone()
                flMain.visibility = View.GONE
                rlGroupDone.visibility = View.VISIBLE
            }

        })


    }

    private fun setAdapter() {
        rvNewGroup.layoutManager = LinearLayoutManager(context)

        list = ArrayList<NewGroupModel>()
        list.add(NewGroupModel("Angelina", R.drawable.ic_women_sample_two))
        list.add(NewGroupModel("Eric", R.drawable.ic_men_sample_three))
        list.add(NewGroupModel("Jane Doe", R.drawable.ic_women_sample_one))
        list.add(NewGroupModel("Joe", R.drawable.ic_men_sample_two))
        list.add(NewGroupModel("John Smith", R.drawable.ic_men_sample_one))


        adapter = NewGroupAdapter(list, requireContext(), this, rvNewGroup, status)
        rvNewGroup.adapter = adapter



        rvNewGroupSelection.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        list2 = ArrayList<NewGroupModel>()

        adapter2 = NewGroupSelectionAdapter(list2, requireContext(), this, rvNewGroupSelection)
        rvNewGroupSelection.adapter = adapter2

        initialiseData()
    }


    protected fun initialiseData() {


        //Alphabet fast scroller data
        mAlphabetItems = java.util.ArrayList<AlphabetItem>()

        mAlphabetItems!!.add(AlphabetItem(0, "A", true))
        mAlphabetItems!!.add(AlphabetItem(1, "B", false))
        mAlphabetItems!!.add(AlphabetItem(2, "C", false))
        mAlphabetItems!!.add(AlphabetItem(3, "D", false))
        mAlphabetItems!!.add(AlphabetItem(4, "E", false))
        mAlphabetItems!!.add(AlphabetItem(5, "F", false))
        mAlphabetItems!!.add(AlphabetItem(6, "J", false))
        mAlphabetItems!!.add(AlphabetItem(7, "H", false))
        mAlphabetItems!!.add(AlphabetItem(8, "I", false))
        mAlphabetItems!!.add(AlphabetItem(9, "J", false))
        mAlphabetItems!!.add(AlphabetItem(10, "K", false))
        mAlphabetItems!!.add(AlphabetItem(11, "L", false))
        mAlphabetItems!!.add(AlphabetItem(12, "M", false))
        mAlphabetItems!!.add(AlphabetItem(13, "N", false))
        mAlphabetItems!!.add(AlphabetItem(14, "O", false))
        mAlphabetItems!!.add(AlphabetItem(15, "P", false))
        mAlphabetItems!!.add(AlphabetItem(16, "Q", false))
        mAlphabetItems!!.add(AlphabetItem(17, "R", false))
        mAlphabetItems!!.add(AlphabetItem(18, "S", false))
        mAlphabetItems!!.add(AlphabetItem(19, "T", false))
        mAlphabetItems!!.add(AlphabetItem(20, "U", false))
        mAlphabetItems!!.add(AlphabetItem(21, "V", false))
        mAlphabetItems!!.add(AlphabetItem(22, "W", false))
        mAlphabetItems!!.add(AlphabetItem(23, "X", false))
        mAlphabetItems!!.add(AlphabetItem(24, "Y", false))
        mAlphabetItems!!.add(AlphabetItem(25, "Z", false))

        fast_scroller.setRecyclerView(rvNewGroup)
        fast_scroller.setUpAlphabet(mAlphabetItems)


    }

    lateinit var listener: OnClickChatPopUp
    public fun setChatPopUpListener(listener: OnClickChatPopUp) {
        this.listener = listener
    }

    public interface OnClickChatPopUp {
        public fun setClickPopUp()
    }

    override fun onItemClicked(position: Int, view: RecyclerView) {

        if (view == rvNewGroup) {
            if (itemClickable) {
                if (status.equals("call")) {
                    imgCall.makeVisible()
                    imgVideo.makeVisible()
                    ivGroupSelectionDone.makeGone()
                }
                list2.add(list.get(position))
                if (status.equals("IndividualChat")) {
                    itemClickable = false
                }
                adapter2.notifyDataSetChanged()
                checkListSize("new")
            } else {
                if (position == 2 && status.equals("chat"))
                    replaceFragment(IndividualChatFragment("IndividualChat"), true)
            }
        } else if (view == rvNewGroupSelection) {
            if (list2.size > 1) {
                list2.remove(list2.get(position))
                adapter2.notifyDataSetChanged()
                checkListSize("cancel")
            } else {
                baseActivity!!.onBackPressed()
            }
        }
    }

    private fun checkListSize(status: String) {
        if (list2.size == 0) {
            if (status.equals("new")) {
                llNewGroup.visibility = View.VISIBLE
                //tvToolbarTitle.text = "New Group"
            }
        } else {
            llNewGroup.visibility = View.GONE
            /*if(status.equals("IndividualChat")) {
                tvToolbarTitle.text = "Contact to Send"
            }else{
                tvToolbarTitle.text = "Select Contact"
            }*/
        }
    }
}