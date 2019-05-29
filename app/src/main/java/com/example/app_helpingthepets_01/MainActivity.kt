package com.example.app_helpingthepets_01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@MainActivity, IntroActivity::class.java))
                finish()

                Log.d("MainActivity: ", "En 5 segundos comenzará la aplicación")
            }
        }, 5000)


    }


}
