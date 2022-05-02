package com.example.dz15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var usersList:MutableList<User>
    private lateinit var twRandomNum: TextView
    private lateinit var etInpNum: EditText
    private lateinit var twSumOfDs: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
        mainSumRanNum()
        mainCat()
    }
    private fun initialization() {
        usersList = mainUsers()
        twRandomNum = findViewById(R.id.twRandNum)
        twSumOfDs = findViewById(R.id.twSumOfDigits)
        etInpNum = findViewById(R.id.etInpNum)
    }
    fun showUsersList(view: View) {
        showUsersList(usersList)
    }
    fun sortByName(view: View) {
        sortByName(usersList)
    }
    fun rmByAge(view: View) {
        removeByAge(usersList)
    }
    fun randNum(view: View) {
        twRandomNum.text = mainRandNum()
    }
    fun sumOfDigits(view: View) {
        twSumOfDs.text = mainSumOfDs(etInpNum.text.toString())
    }
}