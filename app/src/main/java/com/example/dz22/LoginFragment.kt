package com.example.dz22

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.dz22.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var btnToContinue : Button
    private lateinit var etLogin: EditText
    private lateinit var login:String
    private lateinit var etPassword: EditText
    private lateinit var password:String
    private lateinit var etConfPassword: EditText
    private lateinit var confPassword:String
    var errors: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater)
        etLogin = binding.etLogin
        etPassword = binding.etPassword
        etConfPassword = binding.etConfPassword
        btnToContinue = binding.btnContinue
        btnToContinue.setOnClickListener { startPlayerFragment() }
        return binding.root
    }
    private fun startPlayerFragment(){
        if (checkValid()){
        parentFragmentManager.beginTransaction().replace(R.id.container, PlayerFragment()).commit()} }
    private fun checkValid(): Boolean {
        checkLogin()
        checkPassword()
        checkConfPassword()
        passEquals()
       return (checkLogin())&&(checkPassword())&&(checkConfPassword())&&(passEquals()) }
    private fun checkLogin(): Boolean {
        login= etLogin.text.toString()
        return if (login != ""){
            true }
        else{
            etLogin.hint = getString(R.string.loginIsEmpty)
            etLogin.setHintTextColor(resources.getColor(R.color.red))

            false } }
    private fun checkPassword():Boolean{
        password= etPassword.text.toString()
        return if (password != ""){
            true }
        else{
            etPassword.hint = getString(R.string.passwordIsEmpty)
            etPassword.setHintTextColor(resources.getColor(R.color.red))
        false} }
    private fun checkConfPassword():Boolean{
        confPassword= etConfPassword.text.toString()
        return if (confPassword != ""){
            true }
        else{
            etConfPassword.hint = getString(R.string.confirmPasswordIsEmpty)
            etConfPassword.setHintTextColor(resources.getColor(R.color.red))
            false} }
    private fun passEquals(): Boolean {
        password= etPassword.text.toString()
        confPassword= etConfPassword.text.toString()
        return if (password == confPassword){
            true }
        else {
            etPassword.text.clear()
            etConfPassword.text.clear()
            etConfPassword.hint = getString(R.string.passwordsNotEqual)
            etConfPassword.setHintTextColor(resources.getColor(R.color.red))
            etPassword.hint = getString(R.string.passwordsNotEqual)
            etPassword.setHintTextColor(resources.getColor(R.color.red))
           false} }



}