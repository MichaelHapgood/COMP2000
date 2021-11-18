package com.example.comp2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
    }

    public void signUp(){
        Intent intent = new Intent(this, Login.class);
        EditText fNameEditText = findViewById(R.id.signUpFname);
        String fName = fNameEditText.getText().toString();
        if(TextUtils.isEmpty(fName)){
            fNameEditText.setError("First Name Missing");
        }
        else{
            intent.putExtra(EXTRA_MESSAGE,fName);
            startActivity(intent);
        }



    }
}
// Add email password boxes android/figma