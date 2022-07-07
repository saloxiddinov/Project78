package com.example.project78;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);
        EditText re_password = findViewById(R.id.re_password);
        TextView alert = findViewById(R.id.alert);
        Button signup = findViewById(R.id.signup_button);

        signup.setOnClickListener(v -> {
            if (!(password.getText().toString().equals(re_password.getText().toString()))) {
                alert.setVisibility(View.VISIBLE);
            } else {
                String e = email.getText().toString();
                String p = password.getText().toString();
                Intent i = new Intent(this,LoginActivity.class);
                i.putExtra("email",e);
                i.putExtra("parol",p);
                startActivity(i);
                alert.setVisibility(View.GONE);
            }
        });
    }

}