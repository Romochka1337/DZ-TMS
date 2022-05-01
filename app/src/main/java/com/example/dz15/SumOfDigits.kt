package com.example.dz15

fun mainSumOfDs(s: String): String {
    var x: Int = s.toInt()
    var y:Int
    var count:Int = 0

    while (x != 0){
        y = x%10
        count +=y
        x /= 10
    }
    return count.toString()
}