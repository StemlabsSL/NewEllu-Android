package com.stemlabs.ellu.data.model

data class FaqCategoryModel(var title: String, var arrayList: MutableList<FaqModel>, var isClicked: Boolean = false)