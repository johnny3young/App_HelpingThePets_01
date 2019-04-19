package com.example.app_helpingthepets_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnguest, btngmail, btnfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnguest = findViewById(R.id.btnguest);
        btngmail = findViewById(R.id.btngmail);
        btnfacebook = findViewById(R.id.btnfacebook);

        btnguest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this,LoginGuestActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
