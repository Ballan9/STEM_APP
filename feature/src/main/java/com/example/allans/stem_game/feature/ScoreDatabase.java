package com.example.allans.stem_game.feature;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ScoreDatabase extends SQLiteOpenHelper {

    private final static int VERSION = 7;

    public static final String PEOPLE_TABLE_NAME = "people";
    public static final int ID_COLUMN = 0;
    public static final int NAME_COLUMN = 1;
    public static final int SCORE_COLUMN = 2;

    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String SCORE = "score";


    public ScoreDatabase(Context context) {
        super(context, "ScoreDatabase.db", null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        setup(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + PEOPLE_TABLE_NAME + ";");
        setup(db);
    }

    private void setup(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + PEOPLE_TABLE_NAME
                + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME + " TEXT, "
                + SCORE + " INTEGER);";
        db.execSQL(sql);

        sql = "INSERT INTO people (name,score) VALUES (\"Jack Smith\", 24);";
        db.execSQL(sql);

        sql = "INSERT INTO people (name,score) VALUES (\"Jill Smith\", 23);";
        db.execSQL(sql);

        sql = "INSERT INTO people (name,score) VALUES (\"Harry Potter\", 25);";
        db.execSQL(sql);
    }
}