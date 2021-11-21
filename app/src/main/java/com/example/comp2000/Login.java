package com.example.comp2000;

import static com.example.comp2000.SignUp.emails;
import static com.example.comp2000.SignUp.passwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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
                newSignUp();
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
            for(int i = 0; i < emails.size(); i++){
                if(emails.get(i).contains(email)){
                    if(passwords.get(i).contains(password)){
                        Context context = getApplicationContext();
                        CharSequence text = "Logged In";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                        loggedIn();
                    }
                    else{
                        Context context = getApplicationContext();
                        CharSequence text = "Email or Password are incorrect!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }
                else{
                    Context context = getApplicationContext();
                    CharSequence text = "Email or Password are incorrect!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
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

    public void newSignUp(){
        Intent intent = new Intent(this, SignUp.class );
        startActivity(intent);
    }
}