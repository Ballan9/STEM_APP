package com.example.allans.stem_game.feature;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HighScores extends AppCompatActivity {
    private ScoreDatabase scoreDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_scores);
    }
    @Override
    protected void onStart() {
        super.onStart();
        scoreDatabase = new ScoreDatabase(this);
        SQLiteDatabase db = scoreDatabase.getReadableDatabase();

        String[] names = {"Jack Smith"};
//        Cursor cursor = db.rawQuery("SELECT * FROM people WHERE name = ?", names);

        Cursor cursor = db.query(true, ScoreDatabase.PEOPLE_TABLE_NAME,
                null, null, null, null, null, null, null);



        while (cursor.moveToNext()) {
            String name = cursor.getString(ScoreDatabase.NAME_COLUMN);
            System.out.println("name: " + name);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        scoreDatabase.close();
    }
}
