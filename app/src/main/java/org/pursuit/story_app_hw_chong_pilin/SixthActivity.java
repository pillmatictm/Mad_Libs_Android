package org.pursuit.story_app_hw_chong_pilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class SixthActivity extends AppCompatActivity {
    private static final String VERB2 = "verb_2";
    private EditText inputVerb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        inputVerb2 = (EditText) findViewById(R.id.editText_6);

     findViewById(R.id.button_next_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(SixthActivity.this, SeventhActivity.class);
                String inputVerb2String = inputVerb2.getText().toString();
                FirstActivity.editor.putString(VERB2, inputVerb2String);
                FirstActivity.editor.apply();
                startActivity(intent6);
            }
        });
    }
}