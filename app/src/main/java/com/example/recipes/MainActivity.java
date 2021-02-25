package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    Button btnSignUp, btnSignIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        btnSignIn = (Button) findViewById(R.id.signIn);
        btnSignUp = (Button) findViewById(R.id.signUp);


        //Przycisk logowania
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            signInActivity();
            }
        });

        //Przycisk rejestracji
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            signUpActivity();
            }
        });
    }

    public void signUpActivity() {
        Intent intent = new Intent(this, SingUp.class);
        startActivity(intent);
        CustomIntent.customType(this,"bottom-to-up");
    }

    public void signInActivity() {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
        CustomIntent.customType(this,"bottom-to-up");
    }



}
