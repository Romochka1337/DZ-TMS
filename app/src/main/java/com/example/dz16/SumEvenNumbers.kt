package com.example.dz16

import android.content.ContentValues.TAG
import android.util.Log

fun sumEvenNums(){
    var countNums = 0
    var countSum:Int = 0
    for (n in 1..99){
        if(n%2 == 0){
            countNums++
            countSum += n
        }
    }
    Log.d(TAG,"Количество: $countNums Сумма: $countSum")
}