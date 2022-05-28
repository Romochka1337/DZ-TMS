package com.example.zadanie14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.zadanie14.databinding.FragmentTask2Binding
import com.example.zadanie14.databinding.FragmentTask3Binding


class Task3Fragment : Fragment() {

    var num:Int = mainZagadki()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask3Binding.inflate(inflater)
        binding.textViewZagadka.text = getZagadka(num, createZagadkiList())
        binding.buttonOtvet.setOnClickListener { getOtvet() }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = Task3Fragment()
    }
    var rightOtvet:String = getRightOtvet(num, createOtvetList())
    private fun getOtvet() {
        val editTextOtvet: EditText = requireView().findViewById(R.id.editTextOtvet)
        val otvet:String = editTextOtvet.text.toString()
        val textViewRightOtvet:TextView = requireView().findViewById(R.id.textViewRightOtvet)
        textViewRightOtvet.setText(checkOtvet(otvet,rightOtvet))
    }
}