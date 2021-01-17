package com.stemlabs.ellu.ui.component.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.ViewModelFactory
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.chat.fragment.ContactsAllSosPagerFragment
import com.stemlabs.ellu.ui.component.chat.fragment.IndividualChatFragment
import com.stemlabs.ellu.ui.component.chat.fragment.StoryBoardFragment
import com.stemlabs.ellu.ui.component.home.adapter.ChatPersonAdapter
import com.stemlabs.ellu.ui.component.home.adapter.MainChatAdapter
import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment
import com.stemlabs.ellu.ui.component.profile.dialog.ProfilePhotoSelectionDialog
import com.stemlabs.ellu.ui.model.MainChat
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_main_chat.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.profile_toolbar.*
import java.io.File
import javax.inject.Inject

class MainChatFragment : BaseFragment(), View.OnClickListener {

    lateinit var dialogChatAction: ProfilePhotoSelectionDialog

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

//    lateinit var aboutBandViewModel: AboutBandViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_chat, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        dialogChatAction = ProfilePhotoSelectionDialog("chat")

        imgChatToolbarUserProfile.setOnClickListener(this)
        imgProfile.setOnClickListener(this)
        imgSearch.setOnClickListener(this)
        imgClose.setOnClickListener(this)
        (baseActivity as HomeActivity).setBottomVisibility()
        val list = ArrayList<MainChat>()
        list.add(MainChat("Jane Doe", "Hey, what's up tonight? Can we meet..", "11:00 AM", R.drawable.ic_women_sample_one))
        list.add(MainChat("John Smith", "Ok, Great", "Yesterday", R.drawable.ic_men_sample_one))
        list.add(MainChat("Angelina", "Sure, I will be there!", "11/11/20", R.drawable.ic_women_sample_two))
        list.add(MainChat("Joe", "Bro What's up?", "09/11/20", R.drawable.ic_men_sample_two))
        list.add(MainChat("Eric", "Eric, I need to get a concert ticket!", "05/11/2020", R.drawable.ic_men_sample_three))
        list.add(MainChat("Friends", "Eric: 0:15", "03/11/2020", R.drawable.ic_group_default_chat))

        val statuslist = ArrayList<MainChat>()
        statuslist.add(MainChat("Jane Doe", "Hey, what's up tonight? Can we meet..", "11:00 AM", R.drawable.ic_men_sample_three))
        statuslist.add(MainChat("John Smith", "Ok, Great", "Yesterday", R.drawable.ic_women_sample_one))
        statuslist.add(MainChat("Angelina", "Sure, I will be there!", "11/11/20", R.drawable.ic_men_sample_two))
        statuslist.add(MainChat("Joe", "Bro What's up?", "09/11/20", R.drawable.ic_women_sample_two))
        statuslist.add(MainChat("Eric", "Eric, I need to get a concert ticket!", "05/11/2020", R.drawable.ic_men_sample_one))

        var adapter = MainChatAdapter(list)
        adapter.setClickListener(object : MainChatAdapter.OnSelect {
            override fun onSelectAt(position: Int) {
                if (position == (list.size - 1)) {
                    replaceFragment(IndividualChatFragment("Group"), true)
                } else {
                    replaceFragment(IndividualChatFragment("Individual"), true)
                }
            }

            override fun onLongPress(position: Int) {
                if (dialogChatAction != null && dialogChatAction!!.isAdded()) {
                    return;
                }
                dialogChatAction!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
                dialogChatAction!!.setPhotoSelectionListener(object : ProfilePhotoSelectionDialog.OnClickSetProfilePhoto {


                    override fun setRemovePhotoClick() {
                    }

                    override fun set(filepath: String?) {
                    }
                })
            }
        })
        rvMainChat.adapter = adapter

        var adapterStory = ChatPersonAdapter(statuslist)
        adapterStory.setClickListenerStory(object : ChatPersonAdapter.OnSelect {
            override fun getClickAt(position: Int) {
                replaceFragment(StoryBoardFragment(), true)
            }
        })
        rvChatPerson.adapter = adapterStory


        ivMainChat.setOnClickListener(View.OnClickListener {
            replaceFragment(NewGroupFragment("chat"), true)
        })
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        (baseActivity as HomeActivity).setBottomVisibility(false)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgChatToolbarUserProfile -> {
                (baseActivity as HomeActivity).drawerOpen()
            }
            R.id.imgProfile -> {
                replaceFragment(ContactsAllSosPagerFragment(), true)
            }
            R.id.imgSearch -> {
                llSearchToolbar.makeVisible()
                llProfileToolbar.makeGone()
                llStoryBoard.makeGone()
            }
            R.id.imgClose -> {
                llSearchToolbar.makeGone()
                llProfileToolbar.makeVisible()
                llStoryBoard.makeVisible()
            }
        }
    }
}