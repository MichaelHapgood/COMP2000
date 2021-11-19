package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookingHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_history);

        //Barn button on booking history page
        Button barnHistButton = findViewById(R.id.bookHistBarn);
        barnHistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });

        //Bedroom 1 button on booking history page
        Button bed1HistButton = findViewById(R.id.bookHistBed1);
        bed1HistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });

        //Bedroom 2 button on booking history page
        Button bed2HistButton = findViewById(R.id.bookHistBed2);
        bed2HistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });

        //Bedroom 3 button on booking history page
        Button bed3HistButton = findViewById(R.id.bookHistBed3);
        bed3HistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });

        //Shepard's Hut button on booking history page
        Button hutHistButton = findViewById(R.id.bookHistHut);
        hutHistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookHistory();
            }
        });
    }

    public void bookHistory() {

        Intent intents = new Intent(this, Booking.class);
        startActivity(intents);
    }
}