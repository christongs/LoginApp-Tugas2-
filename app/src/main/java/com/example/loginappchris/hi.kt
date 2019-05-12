package com.example.loginappchris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hi.*

class hi : AppCompatActivity() {

    var username: String? = null
    var password: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi
        )

        ambilData()
    }


    private fun ambilData(){
        val bundle : Bundle? = intent.extras

        username = bundle?.getString("Username")
        password = bundle?.getString("Password")

        txtHello.text= username


    }
}