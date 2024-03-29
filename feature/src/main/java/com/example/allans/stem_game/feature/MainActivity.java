package com.example.allans.stem_game.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button play, settings, highScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button settings = (Button) findViewById(R.id.settings); // opens settings button
        final Button play = (Button) findViewById(R.id.play);
        final Button highScore = (Button) findViewById(R.id.highScore);
        // TextView editPref = (TextView) findViewById(R.id.textView); //used to edit text

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on click Opens Settings Activity.
                //finish(); //when button is clicked MainAcivity will close
                //startActivity(new Intent(MainActivity.this, Settings.class));
                startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on click Opens Settings Activity.
                //finish(); //when button is clicked MainAcivity will close
                startActivity(new Intent(MainActivity.this, Settings.class));
                //startActivity(new Intent(MainActivity.this, PlayActivity.class));
            }
        });

        highScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                startActivity(new Intent(MainActivity.this, HighScores.class));
            }
        });




    }
}