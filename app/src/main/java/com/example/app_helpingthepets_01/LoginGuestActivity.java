package com.example.app_helpingthepets_01;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginGuestActivity extends AppCompatActivity{

    Button btnregistrar, btnregresar;
    EditText edtguestemail, edtguestpass;
    ProgressBar progressBar;

    //Declare an instance of FirebaseAuth
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_guest);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        edtguestemail = findViewById(R.id.edtguestemail);
        edtguestpass = findViewById(R.id.edtguestpass);
        btnregistrar = findViewById(R.id.btnregristrar);
        btnregresar = findViewById(R.id.btnregresar);

        //progressBar = new ProgressBar(this);

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailUser = edtguestemail.getText().toString();
                String passwordUser = edtguestpass.getText().toString();

                //Usamos un IF para revisar que los campos no estén vacíos
                if (TextUtils.isEmpty(emailUser)) {
                    Toast.makeText(LoginGuestActivity.this, "Digita un correo", Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(passwordUser)) {
                    Toast.makeText(LoginGuestActivity.this, "Digita una contraseña", Toast.LENGTH_SHORT).show();
                }

                //SignUp new Users
                mAuth.createUserWithEmailAndPassword(emailUser, passwordUser)
                        .addOnCompleteListener(LoginGuestActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (task.isSuccessful()){
                                    Toast.makeText(LoginGuestActivity.this, "Se ha creado el usuario", Toast.LENGTH_SHORT).show();
                                    Intent myIntent = new Intent(LoginGuestActivity.this,Plataforma.class);
                                    startActivity(myIntent);
                                    finish();

                                }else {
                                    Toast.makeText(LoginGuestActivity.this, "No se pudo crear el usuario", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });

            }
        });


        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent myIntent = new Intent(LoginGuestActivity.this, LoginActivity.class);
               startActivity(myIntent);
               finish();
            }
        });
    }
}