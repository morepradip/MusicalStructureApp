package com.example.podcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find google talk text view
        TextView googleTalkTextView = (TextView) findViewById(R.id.google_talks);

        // set onClickListener on google talk
        googleTalkTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent googleTalkIntent = new Intent(MainActivity.this, GoogleTalkActivity.class);
                // start google talk activity
                startActivity(googleTalkIntent);
            }
        });

        //find startup school text view
        TextView startupSchoolTextView = (TextView) findViewById(R.id.startup_school);

        // set onClickListener on startup school
        startupSchoolTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startupSchoolIntent = new Intent(MainActivity.this, StartupSchoolActivity.class);
                startActivity(startupSchoolIntent);
            }
        });
    }
}
