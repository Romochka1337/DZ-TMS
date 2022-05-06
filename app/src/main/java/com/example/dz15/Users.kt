package com.example.dz15

import android.content.ContentValues.TAG
import android.util.Log

fun mainUsers(): MutableList<User> {
    val usersList:MutableList<User> = mutableListOf()
    val luka:User = User("Сашка","Лукашенко", 100)
    val zelya:User = User("Володя","Зеленский",10)
    val putlet:User = User("Володя","Путин",200)
    val bidon:User = User("Джо","Байден", 300)
    
    addUserToList(bidon,usersList)
    addUserToList(luka, usersList)
    addUserToList(zelya, usersList)
    addUserToList(putlet, usersList)
    return usersList
}

class User(var name:String, var secondName:String, var age:Int){
}

fun addUserToList(user: User,usersList: MutableList<User>){
    usersList.add(user)
}
fun showUsersList(usersList: MutableList<User>){
    usersList.forEach{
        Log.d(TAG, "Имя: ${it.name}; Фамилия: ${it.secondName}; Возраст: ${it.age}")
    }
}
fun sortByName(usersList: MutableList<User>){
    usersList.sortBy { it.name }
    showUsersList(usersList)
}
fun removeByAge(usersList: MutableList<User>){
    usersList.removeAll {user: User -> user.age <= 18 }
}