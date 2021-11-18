package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        Button adminLogInButton = findViewById(R.id.adminLogIn);
        adminLogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminLogin();
            }
        });
    }
    public void adminLogin(){

        Intent intent = new Intent(this, BookingAdmin.class);

        EditText adminEmailEditText = findViewById(R.id.adminEmail);
        String adminEmail = adminEmailEditText.getText().toString();
        EditText adminPasswordEditText = findViewById(R.id.adminPassword);
        String adminPass = adminPasswordEditText.getText().toString();

        if(TextUtils.isEmpty(adminEmail)){
            adminEmailEditText.setError("Please Enter Admin an Email Address");
        }
        else if(TextUtils.isEmpty(adminPass)){
            adminPasswordEditText.setError("Please Enter an Admin Password");
        }
        else{
            startActivity(intent);
        }
    }
}