package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button payButton = findViewById(R.id.paymentPay);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pay();
            }
        });

        Button payBackButton = findViewById(R.id.paymentBack);
        payBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    public void payFormEmpty(){
        EditText roomTypeEditText = findViewById(R.id.paymentRoomType);
        String payment = roomTypeEditText.getText().toString();

        EditText priceEditText = findViewById(R.id.paymentPrice);
        String price = priceEditText.getText().toString();

        EditText totalEditText = findViewById(R.id.paymentTotal);
        String total = totalEditText.getText().toString();

        EditText emailEditText = findViewById(R.id.paymentEmail);
        String email = emailEditText.getText().toString();

        EditText cardNoEditText = findViewById(R.id.paymentCardNo);
        String cardNo = cardNoEditText.getText().toString();

        if(TextUtils.isEmpty(payment)){
            roomTypeEditText.setError("Room Type Missing");
        }
        else if(TextUtils.isEmpty(price)){
            priceEditText.setError("Price per Night Missing");
        }
        else if(TextUtils.isEmpty(total)){
            totalEditText.setError("Price Total Missing");
        }
        else if(TextUtils.isEmpty(email)){
            emailEditText.setError("Email Missing");
        }
        else if(TextUtils.isEmpty(cardNo)){
            cardNoEditText.setError("Card Number Missing");
        }
        else{
            pay();
        }
    }

    public void goBack(){
        Intent intent = new Intent(this, Booking.class);
        startActivity(intent);
    }

    public void pay(){

        Intent intent = new Intent(this, PaymentComplete.class);
        startActivity(intent);
    }
}