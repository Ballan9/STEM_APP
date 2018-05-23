package com.example.allans.stem_game.feature;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighScores extends AppCompatActivity {
    private ScoreDatabase scoreDatabase;
    private TextView textView;
    Button back;

    String column;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
        textView = (TextView) findViewById(R.id.highScore);
        textView.setText("");
        column = "SCORE ";
        back = findViewById(R.id.back);
        Database();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HighScores.this, MainActivity.class));
            }
        });




    }
    protected void Database() {
        scoreDatabase = new ScoreDatabase(this);
        SQLiteDatabase db = scoreDatabase.getReadableDatabase();

        String[] names = {"Jack Smith"};
//        Cursor cursor = db.rawQuery("SELECT * FROM people WHERE name = ?", names);

        Cursor cursor = db.query(true, ScoreDatabase.PEOPLE_TABLE_NAME,
                null, null, null, null, null, column + "DESC", "10");



        while (cursor.moveToNext()) {
            int score = cursor.getInt(ScoreDatabase.SCORE_COLUMN);
            textView.append(score + "\n" );
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        scoreDatabase.close();
    }
}
