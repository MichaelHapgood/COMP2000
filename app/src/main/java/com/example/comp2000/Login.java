package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        String fName = intent.getStringExtra(SignUp.EXTRA_MESSAGE);
        TextView fnameView = findViewById(R.id.usernameTemp);
        if(TextUtils.isEmpty(fName)){
            fnameView.setText("Welcome ");
        }
        else{
            fnameView.setText("Welcome " + fName);
        }
        Button logInButton = findViewById(R.id.submitLogIn);
        logInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logIn();

            }
        });
        Button signUpHere = findViewById(R.id.logInSignUp);
        signUpHere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                loggedIn();
            }
        });

        Button logInBackButton = findViewById(R.id.loginBack);
        logInBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

    }
    public void logIn(){

        Intent intent = new Intent(this, AccountMenu.class );

        EditText emailEditText = findViewById(R.id.logInEmail);
        String email = emailEditText.getText().toString();

        EditText passwordEditText = findViewById(R.id.logInPassword);
        String password = passwordEditText.getText().toString();

        if(TextUtils.isEmpty(email)){
            emailEditText.setError("Please Enter Your Email Address");
        }
        else if(TextUtils.isEmpty(password)){
            passwordEditText.setError("Please Enter Your Password");
        }
        else{

            loggedIn();
        }
    }

    public void goBack(){
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }

    public void loggedIn(){
        Intent intent = new Intent(this, AccountMenu.class );
        startActivity(intent);
    }
}