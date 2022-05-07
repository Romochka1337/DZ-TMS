package com.example.dz16

fun evenOrOdd(strA:String, strB:String):String{
    return if ((strA == "")||(strB == "")){
        "Вам нужно ввести 2 числа"
    }else {
        val a:Int = strA.toInt()
        val b:Int = strB.toInt()
        when(a%2){
            1 -> (a + b).toString()
            else -> (a * b).toString()
        }
    }
}