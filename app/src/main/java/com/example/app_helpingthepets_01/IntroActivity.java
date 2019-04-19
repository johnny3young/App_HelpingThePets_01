package com.example.app_helpingthepets_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(IntroActivity.this,LoginActivity.class));
                finish();

                Log.d("IntroActivity: " ,"En 5 segundos comenzará la aplicación");
            }
        },5000 );
    }
}
