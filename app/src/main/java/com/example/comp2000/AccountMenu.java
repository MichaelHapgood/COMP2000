package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_menu);
        Intent intent = getIntent();

        Button accMenuEditButton = findViewById(R.id.accMenuEdit);
        accMenuEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editAccount();
            }
        });
        Button accMenuBookHistButton = findViewById(R.id.accMenuHist);
        accMenuBookHistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });

        Button accMenuMakeBookingButton = findViewById(R.id.accMenuMakeBooking);
        accMenuMakeBookingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeBook();
            }
        });

        Button accMenuBackButton = findViewById(R.id.accMenuBack);
        accMenuBackButton.setOnClickListener(new View.OnClickListener() {
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

    public void editAccount(){
        Intent intent = new Intent(this, EditAccount.class);
        startActivity(intent);
    }

    public void bookHistory(){
        Intent intent = new Intent(this, BookingHistory.class);
        startActivity(intent);
    }

    public void makeBook(){
        Intent intent = new Intent(this, Booking.class);
        startActivity(intent);
    }
}