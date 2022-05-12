package com.example.dz16

fun envelope(strA:String,strB:String,strC:String,strD:String) :String{
    return if ((strA == "")||(strB == "")||(strC == "")||(strD == "")){
        "Данные введены неверно"
    }
    else {
        val a:Int = strA.toInt()
        val b:Int = strB.toInt()
        val c:Int = strC.toInt()
        val d:Int = strD.toInt()
        if (((a <= c) and(b <= d)) or ((a <= d) and(b <= c)) or ((a >= c)and(b >= d)) or ((a >= d) and(b >= c))){
            "Помещается"
        } else "Не помещается"
    }
}