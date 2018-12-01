package org.pursuit.story_app_hw_chong_pilin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class FourthActivity extends AppCompatActivity {
    private static final String EXPENSIVE_ITEM = "overpriced_item";
    private EditText inputItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        int[] myColors = getResources().getIntArray(R.array.myRainbow);
        int randomColors = myColors[new Random().nextInt(myColors.length)];
        findViewById(android.R.id.content).setBackgroundColor(randomColors);

        inputItem = (EditText) findViewById(R.id.editText_4);

        findViewById(R.id.button_next_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(FourthActivity.this, FifthActivity.class);
                String inputItemString = inputItem.getText().toString();
                FirstActivity.editor.putString(EXPENSIVE_ITEM, inputItemString);
                FirstActivity.editor.apply();
                startActivity(intent4);
            }
        });
    }
}
