package com.example.diary20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        EditText date1 = findViewById(R.id.ed1);
        EditText mem = findViewById(R.id.ed2);



        MaterialButton save = findViewById(R.id.savebt);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String title = date1.getText().toString();
              String discription = mem.getText().toString();
              long createdTime = System.currentTimeMillis();

                Toast.makeText(getApplicationContext(),"I Saved it :)",Toast.LENGTH_SHORT).show();
                finish();

            }
        });



    }
}