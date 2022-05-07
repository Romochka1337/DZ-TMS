package com.example.dz16

fun decToBin(strDec:String):String{
    return if (strDec == ""){
        "Вы не ввели десятичное число!"
    }else{
        val bin:Int = strDec.toInt()
        Integer.toBinaryString(bin).toString()
    }
}