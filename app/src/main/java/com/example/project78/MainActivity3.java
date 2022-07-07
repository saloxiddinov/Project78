package com.example.project78;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        EditText password = findViewById(R.id.password);
        EditText re_password = findViewById(R.id.re_password);
        TextView alert = findViewById(R.id.alert);
        Button signup = findViewById(R.id.signup_button);

        signup.setOnClickListener(v -> {
            if (!(password.getText().toString().equals(re_password.getText().toString()))) {
                alert.setVisibility(View.VISIBLE);
            } else {
                alert.setVisibility(View.GONE);
            }
        });
    }

}