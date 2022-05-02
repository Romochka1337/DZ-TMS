package com.example.dz15

fun mainSumOfDs(str: String): String {
    return if (str == ""){
        "Вы ничего не ввели"
    }
    else{
        var x: Int = str.toInt()
        var y:Int
        var count:Int = 0

        while (x != 0){
            y = x%10
            count +=y
            x /= 10
        }
        count.toString()
    }
}