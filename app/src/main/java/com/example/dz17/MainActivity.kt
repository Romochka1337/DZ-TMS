package com.example.dz17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.example.dz17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timeLeft:Long = 0

    lateinit var timer:CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply { btnStart.setOnClickListener { startTimer(timeLeft) } }
        binding.apply { btnStop.setOnClickListener { stopTimer(timer) } }
    }
    private fun startTimer(timeLeft:Long){
        binding.btnStart.visibility = View.INVISIBLE
        binding.btnStart.text = "старт"
        var seconds:Long = 0
        var minutes:Long = 0
        val strSeconds:String =  binding.etInpSeconds.text.toString()
        val strMinutes:String =  binding.etInpMinutes.text.toString()
        if (strSeconds != ""){
            seconds += strSeconds.toLong()
        }
        if (strMinutes != ""){
            minutes += strMinutes.toLong()
        }
        val timeMills:Long = (seconds * 1000) + (minutes * 60000) + timeLeft
        timer = object: CountDownTimer(timeMills,1) {
        override fun onTick(p0: Long) {
            outTimeLeft(p0)
            getTimeLeft(p0)
        }
        override fun onFinish() {
            binding.tvOutTime.text = "Finish"
            }
        }.start()
        binding.btnStop.visibility = View.VISIBLE
        binding.etInpSeconds.text.clear()
        binding.etInpMinutes.text.clear()
    }
    fun getTimeLeft(p0: Long){
        timeLeft = p0
    }
    fun outTimeLeft(p0:Long){
        val minutes:Long = (p0 / 1000) / 60
        val seconds:Long = (p0 / 1000) % 60
        binding.tvOutTime.text = "$minutes : $seconds"
    }
    private fun stopTimer(timer: CountDownTimer){
        binding.btnStart.visibility = View.VISIBLE
        binding.btnStart.text = "продолжить"
        binding.btnStop.visibility = View.INVISIBLE
        timer.cancel()
    }
}