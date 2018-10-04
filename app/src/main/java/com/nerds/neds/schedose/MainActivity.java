package com.nerds.neds.schedose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ClassClass> classes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gson = new Gson();
        String json = getSharedPreferences("username", Context.MODE_PRIVATE).getString("class", "");
        Type type = new TypeToken<ArrayList<String>>() {}.getType();
        classes = gson.fromJson(json, type);
        String name = getSharedPreferences("username", Context.MODE_PRIVATE).getString("name", "user");
        TextView greeting = (TextView) findViewById(R.id.GreetingText) ;
        greeting.setText("Hello " + name);
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
