package com.example.bbcplanet;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class RecommendationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        TextView t2 = (TextView) findViewById(R.id.link1);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        VideoView w2 = (VideoView) findViewById(R.id.videoView2);
//        w2.setVideoURI(Uri("https://www.bbc.co.uk/iplayer/episode/p04thmv7/blue-planet-ii-series-1-1-one-ocean"));

        w2.setVideoPath("https://www.youtube.com/watch?v=bzTWI4pKNy4");

//        // Get the Intent that started this activity and extract the string
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);
    }

}