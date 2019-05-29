package com.example.app_helpingthepets_01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import java.util.Timer
import java.util.TimerTask

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@IntroActivity, LoginActivity::class.java))
                finish()

                Log.d("IntroActivity: ", "En 5 segundos comenzará la aplicación")
            }
        }, 5000)
    }
}
