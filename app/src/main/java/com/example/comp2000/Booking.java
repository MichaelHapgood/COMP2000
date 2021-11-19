package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Button bookBarnButton = findViewById(R.id.bookingBarn);
        bookBarnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
        Button bookBed1Button = findViewById(R.id.bookingBed1);
        bookBed1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
        Button bookBed2Button = findViewById(R.id.bookingBed2);
        bookBed2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
        Button bookBed3Button = findViewById(R.id.bookingBed3);
        bookBed3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });
        Button bookHutButton = findViewById(R.id.bookingHut);
        bookHutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                book();
            }
        });

        Button bookBack = findViewById(R.id.bookBack);
        bookBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    public void goBack(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void book(){

        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }
}