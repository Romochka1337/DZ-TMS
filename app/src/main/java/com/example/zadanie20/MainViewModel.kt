package com.example.zadanie20

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val age = MutableLiveData<Int>()

    fun setup(){
        val apiFirstName = "Daniel"
        val apiLastName = "Malone"
        val apiAge = 28
        firstName.value = apiFirstName
        lastName.value = apiLastName
        age.value = apiAge
    }
}