package com.example.dz16

import kotlin.math.max

fun mainFuncVar(strA:String,strB:String,strC:String): String {
    return if ((strA =="")||(strB == "")||(strC == "")){
        "Данные введены неверно"
    }
    else{
        val result = ::funcMaxValue
        return result(strA,strB,strC).toString()
    }
}

fun funcMaxValue(strA: String, strB: String, strC: String): Double {
    val a:Double = strA.toDouble()
    val b:Double = strB.toDouble()
    val c:Double = strC.toDouble()
    return max(a*b*c,a+b+c)
}

