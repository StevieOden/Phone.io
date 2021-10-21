package com.example.phoneio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {
    private ImageView back;
    private Button signup;
    private TextInputEditText emailsignup, passwordsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        back = findViewById(R.id.back_button_up);
        signup = findViewById(R.id.signupbutton);
        emailsignup = findViewById(R.id.emailup);
        passwordsignup = findViewById(R.id.passwordup);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Opening.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emailsignup.getText().toString().length()==0){
                    Toast.makeText(SignUpActivity.this, "Email required!", Toast.LENGTH_SHORT).show();
                }else if(passwordsignup.getText().toString().length()==0){
                    Toast.makeText(SignUpActivity.this, "Password required!", Toast.LENGTH_SHORT).show();
                }else { Toast.makeText(getApplicationContext(), "Registration successful!",
                            Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), HomePage.class);
                startActivity(intent);
                }
            }
        });
    }
}