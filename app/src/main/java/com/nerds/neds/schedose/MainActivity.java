package com.nerds.neds.schedose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<ClassClass> x=new ArrayList<ClassClass>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = getSharedPreferences("username", Context.MODE_PRIVATE).getString("name", "user");
        TextView greeting=(TextView) findViewById(R.id.GreetingText) ;
        greeting.setText("Hello "+name);
        Button nextpage = findViewById(R.id.nxtpage);
        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent=new Intent(getApplicationContext(), MainActivity2.class);
                //StartIntent.putExtra("com.nerds.neds.schedose.WelcomeStatement","Hi! Welcome to the second page!");
                startActivity(StartIntent);
            }
        });
    }


}
