package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btnSub = findViewById(R.id.ok);
        TextInputEditText email = findViewById(R.id.email_edit);
        TextInputEditText user = findViewById(R.id.username_edit);
        TextInputEditText pass1 = findViewById(R.id.password_edit);
        TextInputEditText pass2 = findViewById(R.id.repeat_edit);

        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                if (!email.getText().toString().matches("") & !user.getText().toString().matches("")
                        & !pass1.getText().toString().matches("") & !pass2.getText().toString().matches("")){

                    if (pass1.getText().toString().matches(pass2.getText().toString())){
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else Snackbar.make(v, "Passwords do not match!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else Snackbar.make(v, "Empty fields!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

    }
}