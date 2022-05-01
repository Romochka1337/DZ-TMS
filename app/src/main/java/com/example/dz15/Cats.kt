package com.example.dz15

import android.content.ContentValues.TAG
import android.util.Log

fun mainCat() {
    val cat1: Cat = Cat("Котяра", 3.0, "черный" , 25,40)
    val table1: Table = Table(90, "белый", "дерево", 150, 4)

    canJumpOnFurniture(table1, cat1)
}

class Cat(internal var name: String, private var weight: Double, private var color: String, private var height: Int, private var length:Int){
    var power: Double = weight * height * length

    fun getJumpHeight(): Double {
        return weight * height * 1.5
    }
}
open class Furniture(internal var height: Int, private var color: String, private var material:String, private var length: Int){
}
class Table(height: Int, color: String, material: String, length: Int,private var tableLegs:Int) : Furniture(height, color, material, length){
}
fun canJumpOnFurniture(table:Table, cat: Cat){
    if (cat.getJumpHeight() >= table.height){
        Log.d(TAG, "У ${cat.name} получилось запрыгнуть на стол")
    }
    else
        Log.d(TAG, "у ${cat.name} не получилось запрыгнуть на стол")
}