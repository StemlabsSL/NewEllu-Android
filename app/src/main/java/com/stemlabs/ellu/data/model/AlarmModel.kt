package com.stemlabs.ellu.data.model

data class AlarmModel(var alarmTitle:String,var alarmTime:String,var dayList:MutableList<DayModel>,var isOnAlarm:Boolean = true)