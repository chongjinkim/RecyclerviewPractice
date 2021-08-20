package com.nepplus.recyclerviewpractice.model

import android.util.Log

class MyModel(
    var name : String? = null,
    var profileimg : String? = null) {

    val tag : String = "로그"

    init {
        Log.d(tag, "MyModel - init() called")
    }
}