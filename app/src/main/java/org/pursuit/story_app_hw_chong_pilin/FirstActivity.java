package org.pursuit.story_app_hw_chong_pilin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class FirstActivity extends AppCompatActivity {
    public static final String MY_PREFS = "myPrefsFile";
    public static SharedPreferences allTheInputs;
    public static SharedPreferences.Editor editor;

    private static final String NAME = "name";
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);


        inputName = (EditText) findViewById(R.id.editText_1);
        findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(FirstActivity.this, SecondActivity.class);
                String inputNameString = inputName.getText().toString();
                allTheInputs = getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
                editor = allTheInputs.edit();
                editor.putString(NAME, inputNameString);
                editor.apply();
                startActivity(intent1);
            }
        });
    }
}
