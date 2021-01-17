package com.stemlabs.ellu.data.model

data class CustomizedVibrationModel(var title:String,var isClicked:Boolean=false){
    companion object {
        public fun getVibrationList():ArrayList<CustomizedVibrationModel>{
            var arrayList = ArrayList<CustomizedVibrationModel>()
            arrayList.add(CustomizedVibrationModel("Basic Call",true))
            arrayList.add(CustomizedVibrationModel("Heartbeat"))
            arrayList.add(CustomizedVibrationModel("Siren"))
            arrayList.add(CustomizedVibrationModel("Tick Tock"))
            arrayList.add(CustomizedVibrationModel("Ripple"))
            return arrayList
        }

        public fun getList():ArrayList<CustomizedVibrationModel>{
            var arrayList = ArrayList<CustomizedVibrationModel>()
            arrayList.add(CustomizedVibrationModel("None",true))
            arrayList.add(CustomizedVibrationModel("At time of event"))
            arrayList.add(CustomizedVibrationModel("5 mins before"))
            arrayList.add(CustomizedVibrationModel("10 mins before"))
            arrayList.add(CustomizedVibrationModel("30 mins before"))
            arrayList.add(CustomizedVibrationModel("1 hour before"))
            arrayList.add(CustomizedVibrationModel("1 day before"))
            return arrayList
        }
    }
}