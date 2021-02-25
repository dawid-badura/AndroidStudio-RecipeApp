package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import maes.tech.intentanim.CustomIntent;

public class SignIn extends AppCompatActivity {
    DatabaseHelper db;
    EditText email, password;
    Button signInButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        db = new DatabaseHelper(this);
        email = (EditText) findViewById(R.id.emailSignIn);
        password = (EditText) findViewById(R.id.passwordSignIn);
        signInButton = (Button) findViewById(R.id.signInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();
                Boolean signIn = db.signIn(email1,password1);
                if(signIn==true){
                    Toast.makeText(getApplicationContext(),"Zalogowano",Toast.LENGTH_LONG).show();
                    insideActivity();
                } else {
                    Toast.makeText(getApplicationContext(),"Niepoprawny email lub hasło",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void insideActivity() {
        Intent intent = new Intent(this, Navigation.class);
        startActivity(intent);
        CustomIntent.customType(this,"fadein-to-fadeout");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        CustomIntent.customType(this,"up-to-bottom");
    }
}
