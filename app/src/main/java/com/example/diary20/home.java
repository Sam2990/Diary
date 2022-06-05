package com.example.diary20;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        MaterialButton mbt1 = findViewById(R.id.mbt1);

        mbt1.setOnClickListener(view -> {
            Intent change = new Intent(home.this,add.class);
            startActivity(change);
        });

    }
}