package com.nerds.neds.schedose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<ClassClass> classes = new ArrayList<ClassClass>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button Done = findViewById(R.id.Done);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ClassName = findViewById(R.id.ClassName);
                String classname=ClassName.getText().toString();
                EditText ClassLength = findViewById(R.id.ClassLength);
                Double Classlength = Double.parseDouble(ClassLength.getText().toString());
                classes.add(new ClassClass(classname, Classlength, 0, 0));
                Gson gson = new Gson();
                String json = gson.toJson(classes);
                getSharedPreferences("username", Context.MODE_PRIVATE).edit().putString("class", json).apply();
                Intent StartIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(StartIntent);
            }
        });

    }
}
