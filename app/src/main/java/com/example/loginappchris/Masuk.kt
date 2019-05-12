package com.example.loginappchris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_masuk.*

class Masuk : AppCompatActivity() {
    var usernameInput : String = ""
    var passwordInput : String = ""
    var username: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        btnMasuk.setOnClickListener{
            validasi()
        }
    }

    private fun validasi(){
        usernameInput = edtLogUser.text.toString()
        passwordInput = edtLogPass.text.toString()
        ambilData()

        when{
            usernameInput.isEmpty() -> edtLogUser.error ="username harus diisi"
            passwordInput.isEmpty() -> edtLogPass.error ="password harus diisi"


            else -> {
                if (usernameInput.equals(username) && passwordInput.equals(password)) {
                    navigasiPage3()
                }
            }
        }
    }

    private fun ambilData(){
        val bundle : Bundle? = intent.extras

        username = bundle?.getString("Username")
        password = bundle?.getString("Password")


    }

    private fun navigasiPage3(){
        val intent = Intent(this,hi::class.java)

        val bundle = Bundle ()
        bundle.putString("Username", usernameInput)
        bundle.putString("Password", passwordInput)

        intent.putExtras(bundle)

        startActivity(intent)


    }
}