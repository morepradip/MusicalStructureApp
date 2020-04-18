package com.example.podcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class StartupSchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_school);

        // Create a list of talks
        ArrayList<Talks> talks = new ArrayList<Talks>();

        talks.add(new Talks("Intro to the course", "Sam Altman and Dustin Moskovitz"));
        talks.add(new Talks("Team and Execution", "Sam Altman"));
        talks.add(new Talks("Before the Startup", "Paul Graham"));
        talks.add(new Talks("Building Product, Talking to User", "Adora Cheung"));
        talks.add(new Talks("Competition is for loosers", "Peter Thiel"));
        talks.add(new Talks("Growth", "Alex Schultz"));
        talks.add(new Talks("How to build products", "Kevin Hale"));
        talks.add(new Talks("How to get started", "Press"));
        talks.add(new Talks("How to raise money", "Marc Andreessen"));
        talks.add(new Talks("Culture", "Brian Cheskey"));
        talks.add(new Talks("Intro to the course", "Sam Altman and Dustin Moskovitz"));
        talks.add(new Talks("Team and Execution", "Sam Altman"));
        talks.add(new Talks("Before the Startup", "Paul Grahm"));
        talks.add(new Talks("Building Product, Talking to User", "Adora Cheung"));
        talks.add(new Talks("Competition is for loosers", "Peter Thiel"));
        talks.add(new Talks("Growth", "Alex Schultz"));
        talks.add(new Talks("How to build products", "Kevin Hale"));
        talks.add(new Talks("How to get started", "Press"));
        talks.add(new Talks("How to raise money", "Marc Andreessen"));
        talks.add(new Talks("Culture", "Brian Cheskey"));

        // create talks adapter whose data source is list of talks
        TalksAdapter adapter = new TalksAdapter(this, talks);
        //find the startup school talks list
        ListView listView = (ListView) findViewById(R.id.startup_school_list);
        // set adapter on a list
        listView.setAdapter(adapter);

        // find button which takes startup school to main activity
        Button startupToMain = (Button) findViewById(R.id.button_startup_school_activity_to_main_Activity);

        // set onClickListener on button
        startupToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(StartupSchoolActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        //find button which takes from startup activity to google talks activity
        Button startupToGoogle = (Button) findViewById(R.id.button_startup_school_activity_to_google_talk_activity);

        // set onClickListener on button
        startupToGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(StartupSchoolActivity.this, GoogleTalkActivity.class);
                startActivity(mainActivity);
            }
        });

    }
}
