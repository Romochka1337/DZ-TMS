package com.example.dz16

fun factorial(strN:String):String{
    return if (strN == ""){
        "Вы не ввели число"
    }
    else{
        val n:Int = strN.toInt()
        var factorial:Long = 1
        if ((n == 0)||(n == 1)){
            "1"
        }else{
            for (x in 1..n){
                factorial *= x
            }
            factorial.toString()
        }
    }
}