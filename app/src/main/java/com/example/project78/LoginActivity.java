package com.example.project78;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.project78.model.User;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String e = i.getStringExtra("email");
        String p = i.getStringExtra("parol");
        ArrayList<User> users = new ArrayList<User>();
        if (!(e==null && p==null)) {
            users.add(new User(e, p));
        }

        Button login = findViewById(R.id.login_button);
        EditText email = findViewById(R.id.l_email);
        EditText parol = findViewById(R.id.l_parol);
        TextView error = findViewById(R.id.alert1);


        login.setOnClickListener(v -> {
            for (User user : users) {
                if (user.getEmail().equals(email.getText()) && user.getPassword().equals(parol.getText())){
                    Intent intent = new Intent(this,MainActivity.class);
                    startActivity(intent);
                    return;
                }
            }
            error.setVisibility(View.VISIBLE);
        });
    }
}