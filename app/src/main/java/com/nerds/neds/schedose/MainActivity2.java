package com.nerds.neds.schedose;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText ClassName = findViewById(R.id.ClassName);
        String classname=ClassName.getText().toString();
        EditText ClassLength = findViewById(R.id.ClassLength);
        Double Classlength=Double.parseDouble(ClassLength.getText().toString());
        Button Done = findViewById(R.id.Done);
        Done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent StartIntent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(StartIntent);
            }
        });

    }
}
