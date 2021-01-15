package com.stemlabs.ellu.ui.model

import com.stemlabs.ellu.R

data class CallLogModel(var profileImage: Int, var name: String, var type: String, var time: String) {
    companion object {
        public fun getCallLogList(): ArrayList<CallLogModel> {
            var arrayList = ArrayList<CallLogModel>()
            arrayList.add(CallLogModel(R.drawable.ic_women_sample_one, "Jane Doe", "green", "2 minutes ago"))
            arrayList.add(CallLogModel(R.drawable.ic_men_sample_one, "Jhon Smith", "red", "yesterday 5:53 PM"))
            arrayList.add(CallLogModel(R.drawable.ic_women_sample_two, "Angelina", "green", "9/11/20, 6.22 AM"))
            arrayList.add(CallLogModel(R.drawable.ic_men_sample_two, "Joe", "red", "(3) 09/11/20, 3:35 PM"))
            arrayList.add(CallLogModel(R.drawable.ic_men_sample_three, "Eric", "green", "08/11/20, 9:22 PM"))
            return arrayList
        }
    }
}