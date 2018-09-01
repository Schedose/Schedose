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
                EditText name = (EditText) findViewById(R.id.TextBoxName);
                EditText adjective=(EditText) findViewById(R.id.TextBoxAdj);
                String Name=name.getText().toString();
                String adj=adjective.getText().toString();
                TextView result = (TextView) findViewById(R.id.textView2);

                result.setText(Name+" is "+adj);
            }
        });
    }


}
