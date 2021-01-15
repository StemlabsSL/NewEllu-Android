package com.stemlabs.ellu.data.model

import com.stemlabs.ellu.R

data class CustomizedBandModel(var imgCustomizedBand: Int, var customizedBandTitle: String, var isClicked: Boolean = true) {
    companion object {
        public fun getCustomizedBandList(): ArrayList<CustomizedBandModel> {
            var arraayList = ArrayList<CustomizedBandModel>()
            arraayList.add(CustomizedBandModel(R.drawable.ic_customized_alarm, "Alarm"))
            arraayList.add(CustomizedBandModel(R.drawable.ic_customized_timer, "Timer"))
            arraayList.add(CustomizedBandModel(R.drawable.ic_customized_calendar, "Calendar"))
            arraayList.add(CustomizedBandModel(R.drawable.ic_customized_alert, "Alert"))
            arraayList.add(CustomizedBandModel(R.drawable.ic_customized_chat, "Messages"))
            return arraayList
        }
    }
}