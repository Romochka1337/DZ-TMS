package com.example.dz15


fun mainRandNum():String{

    var x:Int = (5 until 155).random()
    if (x in 25..100)
        return "Число $x входит в интервал"
    else
        return "Число $x не входит в интервал"
}