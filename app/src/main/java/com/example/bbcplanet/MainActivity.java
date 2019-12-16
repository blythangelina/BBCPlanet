package com.example.bbcplanet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity<imageView> extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    private ImageView imageView;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView greenPlanetLogo = (ImageView) findViewById(R.id.greenPlanet);
        greenPlanetLogo.setImageResource(R.drawable.bbc_planet);

        this.imageView = (ImageView)this.findViewById(R.id.greenPlanet);

        TextView textView = (TextView) findViewById(R.id.recyclableResult);
        textView.setVisibility(View.INVISIBLE);

        Button myRecButton = (Button) findViewById(R.id.recButton);
        myRecButton.setVisibility(View.INVISIBLE);

        ImageView myLogo = (ImageView) findViewById(R.id.bbcLogoResultPage);
        ImageView myUserPic = (ImageView) findViewById(R.id.userPictureResultpage);

        myLogo.setVisibility(View.INVISIBLE);
        myUserPic.setVisibility(View.INVISIBLE);


    }

    public void buttonOnClick(View v) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(imageBitmap);

            TextView textView = (TextView) findViewById(R.id.recyclableResult);
            textView.setVisibility(View.VISIBLE);
            textView.setText("RECYCYLE!"); //set text for text view

            Button myRecButton = (Button) findViewById(R.id.recButton);
            myRecButton.setVisibility(View.VISIBLE);

            Button pictureButton = (Button) findViewById(R.id.button);
            pictureButton.setVisibility(View.INVISIBLE);


            ImageView myLogo = (ImageView) findViewById(R.id.bbcLogoResultPage);
            ImageView myUserPic = (ImageView) findViewById(R.id.userPictureResultpage);

            myLogo.setVisibility(View.VISIBLE);
            myUserPic.setVisibility(View.VISIBLE);

            myLogo.setImageResource(R.drawable.bbc_logo);
            myUserPic.setImageResource(R.drawable.user_picture);

            myRecButton.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    startActivity(new Intent(MainActivity.this, RecommendationsActivity.class));
                }
            });

        }
    }

}
