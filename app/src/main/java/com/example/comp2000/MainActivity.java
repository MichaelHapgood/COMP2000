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
        Button homeLoginButton = findViewById(R.id.homeLogIn);
        homeLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();
            }
        });
        Button homeMakeBookingButton = findViewById(R.id.homeMakeBooking);
        homeMakeBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
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
    public void login(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void book(){
        Intent intent = new Intent(this, Booking.class);
        startActivity(intent);
    }
}