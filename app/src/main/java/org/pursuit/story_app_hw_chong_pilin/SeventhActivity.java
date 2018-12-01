package org.pursuit.story_app_hw_chong_pilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class SeventhActivity extends AppCompatActivity {
    private static final String TREATS = "treats";
    private EditText inputTreats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        inputTreats = (EditText) findViewById(R.id.editText_7);

        findViewById(R.id.button_next_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(SeventhActivity.this, FinalActivity.class);
                String inputTreatsString = inputTreats.getText().toString();
                FirstActivity.editor.putString(TREATS, inputTreatsString);
                FirstActivity.editor.apply();
                startActivity(intent7);
            }
        });
    }
}