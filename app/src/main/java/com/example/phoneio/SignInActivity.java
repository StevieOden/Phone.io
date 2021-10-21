package com.example.phoneio;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;

public class SignInActivity extends AppCompatActivity {

    private TextInputEditText txtemail, txtpassword;
    private Button btnlogin, forgot;
    private ImageView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        txtemail = findViewById(R.id.email);
        txtpassword = findViewById(R.id.password);
        btnlogin = findViewById(R.id.loginbutton);
        forgot = findViewById(R.id.forgot_pass);
        buttonback = findViewById(R.id.back_button);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtemail.getText().toString();
                String pass = txtpassword.getText().toString();
                if (email.equalsIgnoreCase("phone@gmail.com")
                        &&pass.equalsIgnoreCase("phone")){
                    Toast.makeText(SignInActivity.this, "Success", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(SignInActivity.this, HomePage.class);
                startActivity(move);
                }else {
                    Toast.makeText(SignInActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignInActivity.this, "Email = phone@gmail.com" +
                        " Password = phone", Toast.LENGTH_LONG).show();
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Opening.class);
                startActivity(intent);
            }
        });
    }
}