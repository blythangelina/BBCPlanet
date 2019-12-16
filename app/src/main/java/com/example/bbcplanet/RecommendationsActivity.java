package com.example.bbcplanet;

import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
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

        w2.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=bzTWI4pKNy4"));


//        w2.setVideoPath("https://www.youtube.com/watch?v=bzTWI4pKNy4");

        ImageView myLogo = (ImageView) findViewById(R.id.bbcLogo);
        myLogo.setImageResource(R.drawable.bbc_logo);

        ImageView myPicture = (ImageView) findViewById(R.id.userPicture);
        myPicture.setImageResource(R.drawable.user_picture);


    }

}