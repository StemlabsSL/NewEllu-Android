package com.stemlabs.ellu.ui.component.chat.adapter

import android.content.Context
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.stemlabs.ellu.R
import com.stemlabs.ellu.data.RepoModel
import com.stemlabs.ellu.data.model.IndividualChatModel
import com.stemlabs.ellu.utils.makeGone
import com.stemlabs.ellu.utils.makeVisible
import kotlinx.android.synthetic.main.listrow_invidividual_chat.view.*

class IndividualChatAdapter(var arrayList: MutableList<IndividualChatModel>) :
        RecyclerView.Adapter<IndividualChatAdapter.IndividualChatViewHolder>() {

    lateinit var context: Context
    lateinit var listener: OnChatSelect
    lateinit var repoModel: RepoModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndividualChatViewHolder {
        context = parent.context
        repoModel = RepoModel(context)
        return IndividualChatViewHolder(
                LayoutInflater.from(context).inflate(R.layout.listrow_invidividual_chat, parent, false)
        )
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: IndividualChatViewHolder, position: Int) {

        if (arrayList.get(position).messageType.equals("proximity")) {
            holder.rlSend.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.VISIBLE
            holder.llAwareMeetView.visibility = View.GONE
            holder.imgMap.visibility = View.GONE

            val styledString = SpannableString(arrayList.get(position).message)
            var username ="Aneglina"
            styledString.setSpan(StyleSpan(Typeface.BOLD), 0,username.length , 0)
            styledString.setSpan(StyleSpan(Typeface.NORMAL), username.length+1, arrayList.get(position).message.length, 0)
            holder.tvProximityMessage.text = styledString;

            holder.tvAcceptProximity.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })

        }else if (arrayList.get(position).messageType.equals("sos")) {
            holder.rlSend.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.VISIBLE
            holder.llProximityView.background = ContextCompat.getDrawable(context!!, R.drawable.curve_sos_gradient)
            holder.llAwareMeetView.visibility = View.GONE
            holder.imgMap.visibility = View.GONE
            val styledString = SpannableString(arrayList.get(position).message)
            var username ="Adam Smith"
            styledString.setSpan(StyleSpan(Typeface.BOLD), 0,username.length , 0)
            styledString.setSpan(StyleSpan(Typeface.NORMAL), username.length+1, arrayList.get(position).message.length, 0)
            holder.tvProximityMessage.text = styledString;

            holder.tvAcceptProximity.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })

        }else if (arrayList.get(position).messageType.equals("contact")) {
            holder.llContact.visibility = View.VISIBLE
            holder.rlSend.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.GONE
            holder.imgMap.visibility = View.GONE
            holder.tvAddContact.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })

        } else if (arrayList.get(position).messageType.equals("aware")) {
            holder.llContact.visibility = View.GONE
            holder.rlSend.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.GONE
            holder.imgMap.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.VISIBLE
            holder.llAwareMeetView.background = ContextCompat.getDrawable(context!!, R.drawable.aware_chat_bg)
            holder.tvAwareMeetTitle.setText(arrayList.get(position).message)
            holder.imgAwareMeetIcon.setImageResource(R.drawable.ic_cup_white)
            holder.imgAwareMeetIcon.setColorFilter(ContextCompat.getColor(context, R.color.colorWhite), PorterDuff.Mode.SRC_IN)
            holder.llAwareMeetView.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })
        } else if (arrayList.get(position).messageType.equals("pager")) {
            holder.rlSend.visibility = View.GONE
            holder.llContact.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.VISIBLE
            holder.imgMap.visibility = View.GONE
            holder.llAwareMeetView.background = ContextCompat.getDrawable(context!!, R.drawable.pager_chat_bg)
            holder.tvAwareMeetTitle.setText(arrayList.get(position).message)
            holder.imgAwareMeetIcon.setImageResource(R.drawable.ic_notification_blue_contact)
            holder.imgAwareMeetIcon.setColorFilter(ContextCompat.getColor(context, R.color.colorWhite), PorterDuff.Mode.SRC_IN)
            holder.llAwareMeetView.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })
        } else if (arrayList.get(position).messageType.equals("ProximityHeader")) {
            holder.rlSend.visibility = View.GONE
            holder.llContact.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llProximityView.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.VISIBLE
            holder.imgMap.visibility = View.GONE
            holder.llAwareMeetView.background = ContextCompat.getDrawable(context!!, R.drawable.curve_proximity_header_chat_gradient)
            holder.tvAwareMeetTitle.setText(arrayList.get(position).message)
            holder.imgAwareMeetIcon.setImageResource(R.drawable.ic_proximity_white)
            holder.llAwareMeetView.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)
            })
        } else if (arrayList.get(position).messageType.equals("location")) {
            holder.rlSend.visibility = View.GONE
            holder.llContact.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.imgMap.visibility = View.VISIBLE
            holder.llAwareMeetView.visibility = View.VISIBLE
            holder.llAwareMeetView.background = ContextCompat.getDrawable(context!!, R.drawable.location_chat_bg)
            holder.tvAwareMeetTitle.setText(arrayList.get(position).message)
            holder.imgAwareMeetIcon.setImageResource(R.drawable.ic_location)
            holder.imgAwareMeetIcon.setColorFilter(ContextCompat.getColor(context, R.color.colorWhite), PorterDuff.Mode.SRC_IN)
            holder.llAwareMeetView.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)

            })
        } else if (arrayList.get(position).messageType.equals("meet")) {
            holder.rlSend.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.llContact.visibility = View.GONE
            holder.rlReceiver.visibility = View.GONE
            holder.imgMap.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.VISIBLE
            holder.llAwareMeetView.background = ContextCompat.getDrawable(context!!, R.drawable.meet_chat_bg)
            holder.tvAwareMeetTitle.setText(arrayList.get(position).message)
            holder.imgAwareMeetIcon.setImageResource(R.drawable.ic_cup_white)
            holder.imgAwareMeetIcon.setColorFilter(ContextCompat.getColor(context, R.color.colorWhite), PorterDuff.Mode.SRC_IN)
            holder.llAwareMeetView.setOnClickListener(View.OnClickListener {
                listener.getChatAt(position)

            })
        } else {
            holder.llProximityView.visibility = View.GONE
            holder.llAwareMeetView.visibility = View.GONE
            holder.llContact.visibility = View.GONE
            holder.imgMap.visibility = View.GONE

            if (arrayList.get(position).userType.equals("customer")) {
                holder.rlReceiver.visibility = View.VISIBLE
                holder.rlSend.visibility = View.GONE
                /*holder.tvUserNameReceive.text =
                    repoModel.appPreference.first_name + " " + repoModel.appPreference.last_name*/
                //holder.tvTimeReceive.text = GlobalMethods.getDateAgo(arrayList.get(position).createdAt)
                holder.tvTimeReceive.text = arrayList.get(position).createdTime
                /*Glide.with(context).load(repoModel.appPreference.profile_photo)
                    .placeholder(R.drawable.placeholder).into(holder.imgProfileReceive)*/
                //holder.imgProfileReceive.setImageResource(R.drawable.ic_user)

                if (arrayList.get(position).messageType.equals("audio")) {
                    holder.imgChatReceive.makeGone()
                    holder.tvMessageReceive.makeGone()
                    holder.tvTimeReceive.makeGone()
                    holder.llAudioReceive.makeVisible()

                } else if (arrayList.get(position).messageType.equals("imagetext")) {
                    holder.imgChatReceive.makeVisible()
                    holder.llAudioReceive.makeGone()
                    holder.imgChatReceive.setImageResource(R.drawable.jazz)
                } else {
                    holder.tvMessageReceive.makeVisible()
                    holder.tvMessageReceive.text = arrayList.get(position).message
                    holder.imgChatReceive.makeGone()
                    holder.llAudioReceive.makeGone()

                }
            } else {
                holder.rlReceiver.visibility = View.GONE
                holder.rlSend.visibility = View.VISIBLE
                //holder.tvUserNameSend.text = "Educator"
                //holder.tvTimeSend.text = GlobalMethods.getDateAgo(arrayList.get(position).createdAt)
                holder.tvTimeSend.text = arrayList.get(position).createdTime
                // holder.imgProfileSend.setImageResource(R.drawable.placeholder)
                if (arrayList.get(position).messageType.equals("audio")) {
                    holder.tvMessageSend.makeGone()
                    holder.llAudioSend.makeVisible()
                    holder.imgChatSend.makeGone()
                } else if (arrayList.get(position).messageType.equals("imagetext")) {
                    holder.imgChatSend.makeVisible()
                    holder.llAudioSend.makeGone()
                    holder.imgChatSend.setImageResource(R.drawable.jazz)
                } else {
                    holder.tvMessageSend.makeVisible()
                    holder.tvMessageSend.text = arrayList.get(position).message
                    holder.imgChatSend.makeGone()
                    holder.llAudioSend.makeGone()
                }
            }
            holder.itemView.setOnLongClickListener(View.OnLongClickListener {
                listener.getChatAt(position)
                true
            })
        }


    }

    fun setChatListener(listener: OnChatSelect) {
        this.listener = listener
    }

    fun updateList(chatList: MutableList<IndividualChatModel>) {
        arrayList.clear()
        arrayList.addAll(chatList)
        notifyDataSetChanged()
    }

    class IndividualChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rlReceiver = itemView.rlReceiver!!
        var tvMessageReceive = itemView.tvMessageReceive!!
        var imgProfileReceive = itemView.imgProfileReceive!!
        var tvUserNameReceive = itemView.tvUserNameReceive!!
        var tvTimeReceive = itemView.tvTimeReceive!!
        var tvTimeReceiveAudio = itemView.tvTimeReceiveAudio!!
        var rlSend = itemView.rlSend!!
        var tvMessageSend = itemView.tvMessageSend!!
        var tvUserNameSend = itemView.tvUserNameSend!!
        var tvTimeSend = itemView.tvTimeSend!!
        var imgChatReceive = itemView.imgChatReceive!!
        var imgChatSend = itemView.imgChatSend!!
        var llAudioSend = itemView.llAudioSend!!
        var llAudioReceive = itemView.llAudioReceive!!
        var imgPlaySend = itemView.imgPlaySend!!
        var imgPlayReceive = itemView.imgPlayReceive!!
        var llProximityView = itemView.llProximityView!!
        var llAwareMeetView = itemView.llAwareMeetView!!
        var tvAddContact = itemView.tvAddContact!!
        var imgAwareMeetIcon = itemView.imgAwareMeetIcon!!
        var tvAwareMeetTitle = itemView.tvAwareMeetTitle!!
        var tvAcceptProximity = itemView.tvAcceptProximity!!
        var tvProximityMessage = itemView.tvProximityMessage!!
        var imgMap = itemView.imgMap!!
        var llContact = itemView.llContact!!
    }

    public interface OnChatSelect {
        public fun getChatAt(position: Int)
    }
}