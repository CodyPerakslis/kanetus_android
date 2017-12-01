package com.kanetus.kanetusapp;

/**
 * Created by codyperakslis on 11/30/17.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView myText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout lView = findViewById(R.id.empty);
        myText = new TextView(this);
        myText.setText("Testing");

        final Button button = findViewById(R.id.playbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lView.addView(myText);
            }
        });


    }



}