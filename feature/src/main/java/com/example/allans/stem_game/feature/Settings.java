package com.example.allans.stem_game.feature;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Objects;

public class Settings extends AppCompatActivity {

    private TextView changeDifficulty;
    private Switch difficultySwitch;
    private String switchValue;
    private TextView beginner;
    private SharedPreferences level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        changeDifficulty = (TextView) findViewById(R.id.changeDifficulty);
        difficultySwitch = (Switch) findViewById(R.id.difficultySwitch);
        beginner = (TextView) findViewById(R.id.beginner);
        level=getSharedPreferences("difficultyLevel",MODE_PRIVATE);
        switchValue = level.getString("difficulty","");
        if(Objects.equals(switchValue, "advanced")){
            difficultySwitch.setChecked(true);
            beginner.setText("Advanced");

        }
        else {
            difficultySwitch.setChecked(false);
            beginner.setText("Easy");

        }
        difficultySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    beginner.setText("Advanced");
                    level.edit().putString("difficulty", "advanced").apply();
                }
                else{
                    beginner.setText("Easy");
                    level.edit().putString("difficulty", "beginner").apply();
                }
            }
        });

    }

}