package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btn_sgn = findViewById(R.id.sign_in);
        btn_sgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "You are signing in...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btn_reg = findViewById(R.id.register);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "You are registering...", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}