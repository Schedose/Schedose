package com.nerds.neds.schedose;

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


        Button pressbutton = (Button) findViewById(R.id.pressthistodie);

        //Ned is a chumbis
        pressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText) findViewById(R.id.TextBox);
                TextView result=(TextView) findViewById(R.id.textView2);
                String number=text.getText().toString();
                result.setText(number+"");
            }
        });
    }


}
