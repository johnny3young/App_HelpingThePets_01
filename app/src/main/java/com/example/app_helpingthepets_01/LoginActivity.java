package com.example.app_helpingthepets_01;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText editTextCorreo,editTextPass;
    Button btnguest, btngmail, btnfacebook, btnlogin;

    //Declare an instance of FirebaseAuth
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        btnguest = findViewById(R.id.btnguest);
        btngmail = findViewById(R.id.btngmail);
        btnfacebook = findViewById(R.id.btnfacebook);
        btnlogin = findViewById(R.id.btnlogin);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextPass = findViewById(R.id.editTextPass);

        //Entrar con el correo registrado
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailUser = editTextCorreo.getText().toString();
                String passwordUser = editTextPass.getText().toString();

                if (TextUtils.isEmpty(emailUser)) {
                    Toast.makeText(LoginActivity.this, "Digita un correo", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(passwordUser)) {
                    Toast.makeText(LoginActivity.this, "Coloca una contraseña", Toast.LENGTH_SHORT).show();
                }

                mAuth.signInWithEmailAndPassword(emailUser, passwordUser).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Ingresando....", Toast.LENGTH_SHORT).show();
                            Intent myIntent = new Intent(LoginActivity.this,Plataforma.class);
                            startActivity(myIntent);
                            finish();

                        }else {
                            Toast.makeText(LoginActivity.this, "Correo o Password incorrectos", Toast.LENGTH_SHORT).show();
                        }


                    }
                });
            }
        });

        btnguest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this,LoginGuestActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
