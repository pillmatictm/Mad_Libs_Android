package org.pursuit.story_app_hw_chong_pilin;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);



        }
    }
