package org.pursuit.story_app_hw_chong_pilin;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button startButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        startButton = (Button) findViewById(R.id.main_button);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent1);
            }
        });
    }
}
