package org.pursuit.story_app_hw_chong_pilin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private static final String ADJECTIVE1 = "adjective_1";
    private EditText inputAdjective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        inputAdjective = (EditText) findViewById(R.id.editText_2);
        findViewById(R.id.button_next_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this, ThirdActivity.class);
                String inputAdjectiveString = inputAdjective.getText().toString();
                FirstActivity.editor.putString(ADJECTIVE1, inputAdjectiveString);
                FirstActivity.editor.apply();
                startActivity(intent2);
            }
        });
    }
}