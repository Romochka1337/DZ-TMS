package com.example.dz15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainSumRanNum()
        mainCat()
    }
    var usersList:MutableList<User> = mainUsers()
    fun onClickShowUsersList(view: View) {
        showUsersList(usersList)
    }
    fun onClickSortByName(view: View) {
        sortByName(usersList)
    }
    fun onClickRmByAge(view: View) {
        removeByAge(usersList)
    }
    fun onClickRandNum(view: View) {
        val twRandomNum: TextView = findViewById(R.id.twRandNum)
        twRandomNum.text = mainRandNum()
    }
    fun onClickSumOfDigits(view: View) {
        val etInpNum: EditText = findViewById(R.id.etInpNum)
        val strNum:String = etInpNum.text.toString()
        if (strNum == ""){
            val twSumOfDs:TextView= findViewById(R.id.twSumOfDigits)
            twSumOfDs.text = "вы ничего не ввели"
        }
        else{
            val twSumOfDs:TextView= findViewById(R.id.twSumOfDigits)
            twSumOfDs.text = mainSumOfDs(strNum)
        }
    }
}