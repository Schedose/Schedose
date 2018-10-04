package com.nerds.neds.schedose;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        getSharedPreferences("username", Context.MODE_PRIVATE).getString("name", "user");
        Button Homepage = findViewById(R.id.submit);
        Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.Username);
                String username = name.getText().toString();
                getSharedPreferences("username", Context.MODE_PRIVATE).edit().putString("name", username).apply();
                Intent StartIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(StartIntent);
            }
        });
    }
}

