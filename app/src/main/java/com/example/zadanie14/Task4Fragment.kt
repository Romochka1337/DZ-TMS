package com.example.zadanie14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.zadanie14.databinding.FragmentTask3Binding
import com.example.zadanie14.databinding.FragmentTask4Binding


class Task4Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask4Binding.inflate(inflater)
        binding.buttonCountAlphabet.setOnClickListener { getString() }
        return binding.root
    }
    companion object {
        @JvmStatic
        fun newInstance() = Task4Fragment()
    }
    fun getString() {
        val editTextInputString: EditText = requireView().findViewById(R.id.editTextInputString)
        val inputString:String = editTextInputString.text.toString()
        val textViewOutSum: TextView = requireView().findViewById(R.id.textViewOutSum)
        textViewOutSum.setText(mainAlphabet(inputString))
    }
}