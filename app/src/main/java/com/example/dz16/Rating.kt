package com.example.dz16

fun rating(strRating:String):String{
    return if (strRating == ""){
        "Вы не ввели число"
    }else{
        when(strRating.toInt()){
            in 0..19 -> "F"
            in 20..39 -> "E"
            in 40..59 -> "D"
            in 60..74 -> "C"
            in 75..89 -> "B"
            in 90..100 -> "A"
            else -> "Число не входит в диапазон"
        }
    }
}