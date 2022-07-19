package com.example.drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public ImageView batteryImage;
    public static String TAG = MainActivity.class.getSimpleName();
    public int counter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batteryImage = findViewById(R.id.imageView2);
        batteryImage.setBackgroundResource(R.drawable.levellist);
    }

    public void decreaseBattery(View view) {
        if(counter < 0){
            counter = 5;
        }
        counter--;

        batteryImage.setImageLevel(counter);

        Log.i(TAG,"Counter is " + counter);

    }

    public void increaseBattery(View view) {
        if(counter > 5){
            counter = 0;
        }
        counter++;

        batteryImage.setImageLevel(counter);
        Log.i(TAG,"Counter is " + counter);


    }
}