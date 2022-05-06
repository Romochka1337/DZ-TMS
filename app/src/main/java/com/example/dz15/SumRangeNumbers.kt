package com.example.dz15
import android.content.ContentValues.TAG
import android.util.Log

fun mainSumRanNum(){

    var count:Int = 0
    for (i in 1..100){
        count += i
    }
    Log.d(TAG,count.toString())
}