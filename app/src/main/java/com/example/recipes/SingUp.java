package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import maes.tech.intentanim.CustomIntent;

public class SingUp extends AppCompatActivity {
    DatabaseHelper db;
    EditText email, password, password2;
    Button signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        db=new DatabaseHelper(this);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        password2 = (EditText) findViewById(R.id.password2);
        signUpButton = (Button) findViewById(R.id.signUpButton);

//klasa odpowiada za rejestracje uzytkownika czyli dodanie go do bazy
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString();
                String password1 = password.getText().toString();
                String password11 = password2.getText().toString();
                if(email1.equals("")||password1.equals("")||password11.equals("")){
                    Toast.makeText(getApplicationContext(),"Żadne pole nie może być puste",Toast.LENGTH_LONG).show();
                } else
                    if(password1.equals(password11)){
                        Boolean checkEmail = db.checkEmail(email1);
                        if(checkEmail==true){
                            Boolean insert = db.insert(email1,password1);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Zarejestrowano",Toast.LENGTH_LONG).show();
                                mainActivity();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(),"Podany email jest już zarejestrowany",Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(),"Podane hasła się nie zgadzają",Toast.LENGTH_LONG).show();
                    }
            }
        });

    }

    public void mainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"up-to-bottom");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        CustomIntent.customType(this,"up-to-bottom");
    }
}
