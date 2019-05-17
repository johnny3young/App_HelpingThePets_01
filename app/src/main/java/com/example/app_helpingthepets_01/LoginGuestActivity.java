package com.example.app_helpingthepets_01;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


public class LoginGuestActivity extends AppCompatActivity{

    Button btnregistrar, btnregresar;
    EditText edtguestemail, edtguestpass;
    ProgressBar progressBar;

    //private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_guest);

        // firebaseAuth = FirebaseAuth.getInstance();

        edtguestemail = findViewById(R.id.edtguestemail);
        edtguestpass = findViewById(R.id.edtguestpass);
        btnregistrar = findViewById(R.id.btnregristrar);
        btnregresar = findViewById(R.id.btnregresar);

        //progressBar = new ProgressBar(this);

       btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent myIntent = new Intent(LoginGuestActivity.this, LoginActivity.class);
               startActivity(myIntent);
               finish();
            }
        });
    }

    // btnregistrar.setOnClickListener((View.OnClickListener) this);

//    private void registrarUsuario(){
//        String email = edtguestemail.getText().toString().trim();
//        String password = edtguestpass.getText().toString().trim();
//
//        //Verificamos que las cajas de texto no estén vacías
//        if (TextUtils.isEmpty(email)){ // (precio.equals(""))
//            Toast.makeText(this,"Se debe ingresar un email ", Toast.LENGTH_LONG).show();
//            return;
//        }
//        if (TextUtils.isEmpty(password)) {
//            Toast.makeText(this, "Se debe ingresar una contraseña ", Toast.LENGTH_LONG).show();
//            return;
//        }
//
//        progressBar.setProgress(Integer.parseInt("Realizando el registro......."));
//        progressBar.isShown();
//
//
//        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                //Cheking if success
//                if (task.isSuccessful()){
//                    Toast.makeText(LoginGuestActivity.this, "Se ha registrado el email: ", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(LoginGuestActivity.this, "Nose pudo registrar el usuario", Toast.LENGTH_SHORT).show();
//                }
//                progressBar.isShown();
//            }
//
//
//        });
//
//    }
//
//    @Override
//    public void onClick (View v2) {
//        //Invocamos al método
//        registrarUsuario();
//    }

}
