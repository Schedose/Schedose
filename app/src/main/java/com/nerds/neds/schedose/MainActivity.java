package com.nerds.neds.schedose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressbutton = findViewById(R.id.pressthistodie);

        pressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.TextBoxName);
                EditText adjective = findViewById(R.id.TextBoxAdj);
                String Name = name.getText().toString();
                String adj = adjective.getText().toString();
                TextView result = findViewById(R.id.textView2);
                result.setText(Name + " is " + adj);
            }
        });
        Button nextpage = findViewById(R.id.nxtpage);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent=new Intent(getApplicationContext(), MainActivity2.class);
                StartIntent.putExtra("com.nerds.neds.schedose.WelcomeStatement","Hi! Welcome to the second page!");
                startActivity(StartIntent);
            }
        });
    }


}
