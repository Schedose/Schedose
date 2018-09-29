package com.nerds.neds.schedose;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Button Homepage = findViewById(R.id.submit);
        Homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(StartIntent);
            }
        });
    }
}

