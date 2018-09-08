package com.nerds.neds.schedose;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstTimeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time_screen);


        final String PREFS_NAME = "MyPrefsFile";
        final String PREF_VERSION_CODE_KEY = "version_code";
        final int DOESNT_EXIST = -1;

        // Get current version code
        int currentVersionCode = BuildConfig.VERSION_CODE;

        // Get saved version code
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        int savedVersionCode = prefs.getInt(PREF_VERSION_CODE_KEY, DOESNT_EXIST);

        //Boolean isFirstRun = getSharedPreferences("PREFERENCE".MODE_PRIVATE).getBoolean("isFirstrun", true);

        //if (isFirstRun) {
        //getSharedPreferences("PREFERENCE".MODE_PRIVATE).edit().putBoolean("isfirstrun", false).commit();


        Button firstlaunchnext = (Button) findViewById(R.id.firstLaunchNext);
        firstlaunchnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstLaunchIntent = new Intent(getApplicationContext(), MainActivity.class);
                //StartIntent.putExtra("com.nerds.neds.schedose.WelcomeStatement","Hi! Welcome to the second page!");
                startActivity(firstLaunchIntent);
            }
        });
    }
}