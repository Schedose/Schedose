package com.nerds.neds.schedose;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstTimeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time_screen);
        int launchCounter = getSharedPreferences("launchTimes", Context.MODE_PRIVATE).getInt("launchCount",0);
        if (launchCounter == 0) {
            Toast.makeText(FirstTimeScreen.this, "First Run"+launchCounter, Toast.LENGTH_LONG).show();
            Intent firstLaunchIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(firstLaunchIntent);
            getSharedPreferences("launchTimes", Context.MODE_PRIVATE).edit().putInt("launchCount", 1).apply();
        }
        else {
            getSharedPreferences("launchTimes", Context.MODE_PRIVATE).edit().putInt("launchCount", launchCounter+1).apply();
            Toast.makeText(FirstTimeScreen.this, ""+launchCounter, Toast.LENGTH_LONG).show();
        }
        Button firstlaunchnext = findViewById(R.id.firstLaunchNext);
        firstlaunchnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstLaunchIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(firstLaunchIntent);
                finish();
            }
        });
    }


    //public void firstLaunch(View view)
    //{
    //   SharedPreferences launchCounter = getSharedPreferences("launchTimes", Context.MODE_PRIVATE);
    //
    //    SharedPreferences.Editor editor = launchCounter.edit();
    //    editor.putInt("launchCount", )
    //}


}