package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SignUp extends AppCompatActivity {

    public static final String EXTRA_MESSAGE="com.example.comp2000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button submitSignUpButton = findViewById(R.id.submitSignUp);
        submitSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();

            }
        });
        Button logInHereButton = findViewById(R.id.signUpLogIn);
        logInHereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AccountExists();
            }
        });

        Button signBackButton = findViewById(R.id.signUpBack);
        signBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

    }

    public void signUp(){

        /*
        Check to ensure fields aren't empty
         And to prompt the user of the issue if they are empty
        */
        Intent intent = new Intent(this, Login.class);

        EditText fNameEditText = findViewById(R.id.signUpFname);
        String fName = fNameEditText.getText().toString();

        EditText lNameEditText = findViewById(R.id.signUpLname);
        String lName = lNameEditText.getText().toString();

        EditText addressEditText = findViewById(R.id.signUpAddress);
        String address = addressEditText.getText().toString();

        EditText cityEditText = findViewById(R.id.signUpCity);
        String city = cityEditText.getText().toString();

        EditText postcodeEditText = findViewById(R.id.signUpPostcode);
        String postcode = postcodeEditText.getText().toString();

        EditText emailEditText = findViewById(R.id.signUpEmail);
        String email = emailEditText.getText().toString();

        EditText passwordEditText = findViewById(R.id.signUpPassword);
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
            intent.putExtra(EXTRA_MESSAGE, fName);
            AccountExists();
        }

    }

    public void goBack(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void AccountExists(){

        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}