package org.pursuit.story_app_hw_chong_pilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class ThirdActivity extends AppCompatActivity {
    private static final String VERB1 = "verb_1";
    private EditText inputVerb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        inputVerb1 = (EditText) findViewById(R.id.editText_3);

        findViewById(R.id.button_next_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ThirdActivity.this, FourthActivity.class);
                String inputVerb1String = inputVerb1.getText().toString();
                FirstActivity.editor.putString(VERB1, inputVerb1String);
                FirstActivity.editor.apply();
                startActivity(intent3);
            }
        });
    }
}
