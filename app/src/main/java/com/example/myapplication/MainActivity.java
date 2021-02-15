package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btnSgn = findViewById(R.id.sign_in);
        Button btnReg = findViewById(R.id.register);
        TextInputEditText inputUser = findViewById(R.id.username_edit);
        TextInputEditText inputPass= findViewById(R.id.password_edit);

//        String txtUser = Objects.requireNonNull(inputUser.getText()).toString();
//        String txtPass = Objects.requireNonNull(inputPass.getText()).toString();


        btnSgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputUser.getText().toString().matches("") | inputPass.getText().toString().matches("")) {
                    Snackbar.make(v, "The fields are empty, bitch!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, SuccessActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "You are registering...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}