package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeSignUpButton = findViewById(R.id.HomeSignUp);
        homeSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                signUp();
            }
        });
        Button homeAdminButton = findViewById(R.id.homeAdmin);
        homeAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                admin();
            }
        });

    }
    public void signUp (){
        Intent intents = new Intent(this, SignUp.class);
        startActivity(intents);
    }
    public void admin (){
        Intent intent = new Intent(this, AdminLogin.class);
        startActivity(intent);
    }


}