package com.nerds.neds.schedose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if(getIntent().hasExtra("com.nerds.neds.schedose.WelcomeStatement")){

            TextView welcometext= (TextView) findViewById(R.id.WelcomeText);
            String text=getIntent().getExtras().getString("com.nerds.neds.schedose.WelcomeStatement");
            welcometext.setText(text+"");
        }
    }
}
