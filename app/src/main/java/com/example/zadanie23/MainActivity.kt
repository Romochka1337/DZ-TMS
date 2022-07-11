package com.example.zadanie23
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.lifecycle.viewModelScope
import com.example.zadanie23.adapter.PeopleAdapter
import com.example.zadanie23.databinding.ActivityMainBinding
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var btnAdd:Button
    private lateinit var btnUpdate:Button
    private lateinit var etInpName: EditText
    private lateinit var etInpSurname: EditText
    private lateinit var etInpAge: EditText

    private  val userViewModel: PeopleViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialization()
        updateList()
        btnAdd.setOnClickListener { createUser()}
        btnUpdate.setOnClickListener {updateList()}
    }
    private fun createUser(){
        if ((etInpName.text.toString() != "")&&(etInpSurname.text.toString() != "")&&(etInpAge.text.toString() != "")){
        userViewModel.usersList.add(User(etInpName.text.toString(), etInpSurname.text.toString(), etInpAge.text.toString().toInt(), "https://moe.shikimori.one/system/user_images/original/48969/1263267.jpg"))
        }
    }
    private fun updateList(){
        binding.rvList.adapter = PeopleAdapter(userViewModel.usersList)
    }
    private fun initialization() {
        btnAdd = binding.btnAdd
        btnUpdate = binding.btnUpdate
        etInpName = binding.etInpName
        etInpSurname = binding.etImpSurname
        etInpAge = binding.etInpAge
    }
}