package com.nerds.neds.schedose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = (EditText) findViewById(R.id.TextBox);
        Button pressbutton = (Button) findViewById(R.id.pressthistodie);
        //Ned is a chumbis
    }


}
