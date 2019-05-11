package com.example.loginappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var usernameInput : String = ""
    var passwordInput : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDaftar.setOnClickListener {
            CekData()
        }
    }

    private fun CekData(){
        usernameInput = edtUsername.text.toString()
        passwordInput = edtPassword.text.toString()

        when{
            usernameInput.isEmpty() -> edtUsername.error = "username harus diisi"
            passwordInput.isEmpty() -> edtPassword.error = "password harus diisi"

            else -> {
                Toast("Ok")
                NavigasiPage2()
            }
        }
    }

    private fun NavigasiPage2(){

    }
}
