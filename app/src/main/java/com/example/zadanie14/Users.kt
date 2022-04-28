package com.example.zadanie14

import android.content.ContentValues.TAG
import android.util.Log

fun mainUser(){
    val usersList: MutableList<User> = mutableListOf()
    val luka:User = User("Сашка","Лукашенко", 100)
    val zelya:User = User("Володя","Зеленский",10)

    addUserToList(luka, usersList)
    addUserToList(zelya,usersList)
    showUsersList(usersList)
}
class User(var name:String, var secondName:String, var age:Int){
}
fun addUserToList(user: User,usersList: MutableList<User>){
    usersList.add(user)
}
fun showUsersList(usersList: MutableList<User>){
    for(i in 0 until usersList.size) {
        Log.d(TAG,"Имя: " + usersList[i].name + "; Фамилия: " + usersList[i].secondName + "; Возраст: " + usersList[i].age)
    }
}