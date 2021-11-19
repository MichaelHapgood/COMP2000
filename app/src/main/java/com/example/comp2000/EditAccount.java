package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_account);

        Button accChangesButton = findViewById(R.id.editAccSubmit);
        accChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailsComplete();
            }
        });

        Button editBackButton = findViewById(R.id.editBack);
        editBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }

    public void detailsComplete(){

        EditText fNameEditText = findViewById(R.id.editAccFname);
        String fName = fNameEditText.getText().toString();

        EditText lNameEditText = findViewById(R.id.editAccLname);
        String lName = lNameEditText.getText().toString();

        EditText addressEditText = findViewById(R.id.editAccAddress);
        String address = addressEditText.getText().toString();

        EditText cityEditText = findViewById(R.id.editAccCity);
        String city = cityEditText.getText().toString();

        EditText postcodeEditText = findViewById(R.id.editAccPostcode);
        String postcode = postcodeEditText.getText().toString();

        EditText emailEditText = findViewById(R.id.editAccEmail);
        String email = emailEditText.getText().toString();

        EditText passwordEditText = findViewById(R.id.editAccPassword);
        String password = passwordEditText.getText().toString();

        if(TextUtils.isEmpty(fName)){
            fNameEditText.setError("Please Enter Your First Name");
        }
        else if(TextUtils.isEmpty(lName)){
            lNameEditText.setError("Please Enter Your Last Name");
        }
        else if(TextUtils.isEmpty(address)){
            addressEditText.setError("Please Enter Your Address ");
        }
        else if(TextUtils.isEmpty(city)){
            cityEditText.setError("Please Enter Your City");
        }
        else if(TextUtils.isEmpty(postcode)){
            postcodeEditText.setError("Please Enter Your Postcode");
        }
        else if(TextUtils.isEmpty(email)){
            emailEditText.setError("Please Enter Your Email Address");
        }
        else if (TextUtils.isEmpty(password)) {
            passwordEditText.setError("Please Enter Your Password");
        }
        else {
            submitChanges();
        }
    }

    public void goBack(){
        Intent intent = new Intent(this, AccountMenu.class);
        startActivity(intent);
    }

    public void submitChanges(){
        Intent intent = new Intent(this, AccountMenu.class);
        startActivity(intent);
    }
}