package com.example.zadanie14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.zadanie14.databinding.FragmentTask2Binding

class Task2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask2Binding.inflate(inflater)
        binding.buttonGetQuestion.setOnClickListener { getQuestion() }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = Task2Fragment()
    }

    private fun getQuestion() {
        val editTextInputQuest: EditText = requireView().findViewById(R.id.editTextInputQuestion)
        val question:String = editTextInputQuest.text.toString()
        val textViewOutAnsw: TextView = requireView().findViewById(R.id.textViewOutAnswer)
        if (question == ""){
            textViewOutAnsw.setText("Вопрос не введён") }
        else{ textViewOutAnsw.setText(mainMagicBall())}
    }
}