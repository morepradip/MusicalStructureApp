package com.example.podcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class GoogleTalkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_talk);

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
        //find the google talk list
        ListView listView = (ListView) findViewById(R.id.google_talk_list);
        //set adapter on a google talk list
        listView.setAdapter(adapter);

        // find button view which take user from google activity to main activity
        Button googleTalkToMain = (Button) findViewById(R.id.button_google_talk_activity_to_main_activity);

        // set onClickListener on button
        googleTalkToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(GoogleTalkActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        // find button view which take user from google activity to startup school activity
        Button googleTalkToStartup = (Button) findViewById(R.id.button_goole_talk_to_startup_school);

        // set onClickListener on button
        googleTalkToStartup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(GoogleTalkActivity.this, StartupSchoolActivity.class);
                startActivity(mainActivity);
            }
        });


    }
}
