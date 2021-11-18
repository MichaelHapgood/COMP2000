package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        String fName = intent.getStringExtra(SignUp.EXTRA_MESSAGE);
        TextView fnameView = findViewById(R.id.usernameTemp);
        fnameView.setText(fName);
    }
}