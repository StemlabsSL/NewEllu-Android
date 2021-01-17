package com.stemlabs.ellu.ui.component.chat.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.*
import android.widget.ImageView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.ui.base.BaseFragment
import com.stemlabs.ellu.ui.component.aware.fragment.AwareFragment
import com.stemlabs.ellu.ui.component.chat.dialog.ShareLocationDialog
import com.stemlabs.ellu.ui.component.meet.fragment.MeetSenderFragment
import com.stemlabs.ellu.ui.component.newgroup.NewGroupFragment
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import jp.shts.android.storiesprogressview.StoriesProgressView
import jp.shts.android.storiesprogressview.StoriesProgressView.StoriesListener
import kotlinx.android.synthetic.main.fragment_story_board.*
import kotlinx.android.synthetic.main.fragment_story_board.llAction
import kotlinx.android.synthetic.main.layout_message_type.*


class StoryBoardFragment : BaseFragment(), View.OnClickListener, StoriesListener {

    private val PROGRESS_COUNT = 12
    lateinit var storiesProgressView: StoriesProgressView
    lateinit var image: ImageView
    private var counter = 0

    var shareLocationDialog: ShareLocationDialog? = null
    private val resources = intArrayOf(
            R.drawable.sample1,
            R.drawable.sample2,
            R.drawable.sample3,
            R.drawable.sample4,
            R.drawable.sample5,
            R.drawable.sample6,
            R.drawable.sample1,
            R.drawable.sample2,
            R.drawable.sample3,
            R.drawable.sample4,
            R.drawable.sample5,
            R.drawable.sample6)

    private val durations = longArrayOf(
            500L, 1000L, 1500L, 4000L, 5000L, 1000)
    var pressTime = 0L
    var limit = 500L

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_story_board, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //baseActivity!!.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        storiesProgressView = view.findViewById<View>(R.id.stories) as StoriesProgressView
        storiesProgressView.setStoriesCount(PROGRESS_COUNT)
        storiesProgressView.setStoryDuration(3000L)
        imgLeftIcon.setOnClickListener(this)
        llLocation.setOnClickListener(this)
        llContact.setOnClickListener(this)
        llLetMeet.setOnClickListener(this)
        llAware.setOnClickListener(this)
        imgPlusStatus.setOnClickListener(this)
        frameAddAction.setOnClickListener(this)
        shareLocationDialog = ShareLocationDialog()
        // storiesProgressView.setStoriesCountWithDurations(durations);
        // or
        // storiesProgressView.setStoriesCountWithDurations(durations);
        storiesProgressView.setStoriesListener(this)
//        storiesProgressView.startStories();
        //        storiesProgressView.startStories();
        counter = 2
        storiesProgressView.startStories(counter)

        image = view.findViewById<View>(R.id.image) as ImageView
        image.setImageResource(resources[counter])

        // bind reverse view

        // bind reverse view
        reverseView.setOnClickListener { storiesProgressView.reverse() }
        reverseView.setOnTouchListener(onTouchListener)
        // bind skip view
        // bind skip view
        skipView.setOnClickListener { storiesProgressView.skip() }
        skipView.setOnTouchListener(onTouchListener)

    }


    private val onTouchListener = View.OnTouchListener { v, event ->
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                pressTime = System.currentTimeMillis()
                stories.pause()
                return@OnTouchListener false
            }
            MotionEvent.ACTION_UP -> {
                val now = System.currentTimeMillis()
                stories.resume()
                return@OnTouchListener limit < now - pressTime
            }
        }
        false
    }


    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imgLeftIcon -> baseActivity!!.onBackPressed()
            R.id.imgPlusStatus -> {
                if (TextUtils.isEmpty(llAction.tag.toString())) {
                    llAction.tag = "visible"
                    imgPlusStatus.rotation = 45.0f
                    llAction.makeVisible()
                    llQuickReaction.makeGone()
                } else {
                    llAction.tag = ""
                    imgPlusStatus.rotation = 0.0f
                    llAction.makeGone()
                    llQuickReaction.makeVisible()
                }
            }

            R.id.frameAddAction -> {
                imgPlusStatus.performClick()
            }
            R.id.llLocation -> {
                llAction.tag = ""
                imgPlusStatus.rotation = 0.0f
                llAction.makeGone()
                addFragment(ShareLocationFragment(), true)

            }
            R.id.llContact -> {
                llAction.tag = ""
                imgPlusStatus.rotation = 0.0f
                llAction.makeGone()
                replaceFragment(NewGroupFragment("IndividualChat"), true)
            }

            R.id.llLetMeet -> {
                llAction.tag = ""
                imgPlusStatus.rotation = 0.0f
                llAction.makeGone()
                addFragment(MeetSenderFragment("Sender"), true)
            }
            R.id.llAware -> {
                llAction.tag = ""
                imgPlusStatus.rotation = 0.0f
                llAction.makeGone()
                addFragment(AwareFragment(), true)
            }

        }
    }

    private fun openShareLocation() {
        if (shareLocationDialog != null && shareLocationDialog!!.isAdded()) {
            return;
        }
        shareLocationDialog!!.show(baseActivity!!.supportFragmentManager, "Dialog Fragment")
        shareLocationDialog!!.setShareLocationListener(object : ShareLocationDialog.OnClickShareLocation {
            override fun setOKOnClickOnClickShareLocation() {
                TODO("Not yet implemented")
            }
        })
    }

    override fun initializeViewModel() {

    }

    override fun observeViewModel() {

    }

    override fun onComplete() {

    }

    override fun onPrev() {
        if (counter - 1 < 0) return
        image.setImageResource(resources[--counter])
    }

    override fun onNext() {
        if (counter > resources.size) {
            baseActivity!!.onBackPressed()
        } else {
            image.setImageResource(resources[++counter])
        }
    }

    override fun onDestroy() {
        //stories.destroy()
        super.onDestroy()
    }

}