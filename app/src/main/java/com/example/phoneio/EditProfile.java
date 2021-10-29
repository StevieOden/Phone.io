package com.example.phoneio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class EditProfile extends AppCompatActivity {

    TextInputLayout fullName, email, password;
    TextView fullNameLabel, titleLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        fullName = findViewById(R.id.fullname_profile);
        email = findViewById(R.id.email_profile);
        password = findViewById(R.id.password_profile);
        fullNameLabel = findViewById(R.id.fullname_field);
        titleLabel = findViewById(R.id.title_field);

        showAllUserData();
    }

    private void showAllUserData(){
        Intent intent = getIntent();
    }
}