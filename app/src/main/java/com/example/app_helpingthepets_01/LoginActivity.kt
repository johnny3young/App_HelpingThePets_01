package com.example.app_helpingthepets_01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    internal var btnguest: Button
    internal var btngmail: Button
    internal var btnfacebook: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnguest = findViewById(R.id.btnguest)
        btngmail = findViewById(R.id.btngmail)
        btnfacebook = findViewById(R.id.btnfacebook)

        btnguest.setOnClickListener {
            val myIntent = Intent(this@LoginActivity, LoginGuestActivity::class.java)
            startActivity(myIntent)
        }
    }
}
