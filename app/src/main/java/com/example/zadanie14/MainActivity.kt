package com.example.zadanie14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num:Int = mainZagadki()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainUser()

        var textViewZagadka:TextView = findViewById(R.id.textViewZagadka)
        textViewZagadka.setText(getZagadka(num, createZagadkiList()))
    }

    fun onClickGetQuestion(view: View) {
        var editTextInputQuest:EditText = findViewById(R.id.EditTextInputQuestion)
        var question:String = editTextInputQuest.text.toString()
        var textViewOutAnsw:TextView = findViewById(R.id.textViewOutAnswer)
        if (question == ""){
            textViewOutAnsw.setText("Вопрос не введён") }
        else{ textViewOutAnsw.setText(mainMagicBall())}
    }

    var rightOtvet:String = getRightOtvet(num, createOtvetList())
    fun onClickGetOtvet(view: View) {
        var editTextOtvet:EditText = findViewById(R.id.editTextOtvet)
        var otvet:String = editTextOtvet.text.toString()

        var textViewRightOtvet:TextView = findViewById(R.id.textViewRightOtvet)
        textViewRightOtvet.setText(checkOtvet(otvet,rightOtvet))
    }

    fun onClickGetString(view: View) {
        var editTextInputString: EditText = findViewById(R.id.editTextInputString)
        var inputString:String = editTextInputString.text.toString()
        var textViewOutSum: TextView = findViewById(R.id.textViewOutSum)
        textViewOutSum.setText(mainAlphabet(inputString))
    }
}