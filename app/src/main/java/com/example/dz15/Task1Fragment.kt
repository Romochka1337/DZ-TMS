package com.example.dz15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.dz15.databinding.FragmentTask1Binding

class Task1Fragment : Fragment() {
    private lateinit var usersList:MutableList<User>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTask1Binding.inflate(inflater)
        initialization()
        binding.btnShowUsersList.setOnClickListener { showUsersList() }
        binding.btnSortByName.setOnClickListener { sortByName() }
        binding.btnRmByAge.setOnClickListener { rmByAge() }
        return binding.root
    }

    private fun initialization() {
        usersList = mainUsers()
    }
    private fun showUsersList() {
        showUsersList(usersList)
    }
    private fun sortByName(){
        sortByName(usersList)
    }
    private fun rmByAge() {
        removeByAge(usersList)
    }
    companion object {
        @JvmStatic
        fun newInstance() = Task1Fragment()
    }
}