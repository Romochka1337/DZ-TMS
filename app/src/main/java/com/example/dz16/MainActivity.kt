package com.example.dz16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etInpNumA: EditText
    private lateinit var etInpNumB: EditText
    private lateinit var tvOutEvenOrOdd: TextView
    private lateinit var etInpRating: EditText
    private lateinit var tvOutGrade: TextView
    private lateinit var etInpFact: EditText
    private lateinit var tvOutFact: TextView
    private lateinit var etInpDec: EditText
    private lateinit var tvOutBin: TextView
    private lateinit var etInpASide: EditText
    private lateinit var etInpBSide: EditText
    private lateinit var etInpCSide: EditText
    private lateinit var etInpDSide: EditText
    private lateinit var tvCheckSides: TextView
    private lateinit var tvOutFuncResult: TextView
    private lateinit var etInpFuncA: EditText
    private lateinit var etInpFuncB: EditText
    private lateinit var etInpFuncC: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialization()
        sumEvenNums()
    }
    private fun initialization(){
        etInpNumA = findViewById(R.id.etInpNumA)
        etInpNumB = findViewById(R.id.etInpNumB)
        tvOutEvenOrOdd = findViewById(R.id.tvOutEvenOrOdd)
        etInpRating = findViewById(R.id.etInpRating)
        tvOutGrade = findViewById(R.id.tvOutGrade)
        etInpFact = findViewById(R.id.etInpFacNum)
        tvOutFact = findViewById(R.id.tvOutFactorial)
        etInpDec = findViewById(R.id.etInpDec)
        tvOutBin = findViewById(R.id.tvOutBinary)
        etInpASide = findViewById(R.id.etInpASide)
        etInpBSide = findViewById(R.id.etInpBSide)
        etInpCSide = findViewById(R.id.etInpCSide)
        etInpDSide = findViewById(R.id.etInpDSide)
        tvCheckSides = findViewById(R.id.tvOutCheckSides)
        tvOutFuncResult = findViewById(R.id.tvOutFuncResult)
        etInpFuncA = findViewById(R.id.etInpFuncA)
        etInpFuncB = findViewById(R.id.etInpFuncB)
        etInpFuncC = findViewById(R.id.etInpFuncC)
    }
    fun evenOrOdd(view: View) {
        tvOutEvenOrOdd.text = evenOrOdd(etInpNumA.text.toString(), etInpNumB.text.toString())
    }
    fun countGrade(view: View) {
        tvOutGrade.text = rating(etInpRating.text.toString())
    }
    fun countFactorial(view: View) {
        tvOutFact.text = factorial(etInpFact.text.toString())
    }

    fun decToBin(view: View) {
        tvOutBin.text = decToBin(etInpDec.text.toString())
    }
    fun checkSides(view: View) {
        val sideA:String =  etInpASide.text.toString()
        val sideB:String = etInpBSide.text.toString()
        val sideC:String =  etInpCSide.text.toString()
        val sideD:String =  etInpDSide.text.toString()
        tvCheckSides.text = envelope(sideA,sideB,sideC,sideD)
    }
    fun functionVar(view: View) {
        val strA: String = etInpFuncA.text.toString()
        val strB: String = etInpFuncB.text.toString()
        val strC: String = etInpFuncC.text.toString()
        tvOutFuncResult.text = mainFuncVar(strA,strB,strC)
    }
}