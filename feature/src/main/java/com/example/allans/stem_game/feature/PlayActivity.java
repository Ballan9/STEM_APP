package com.example.allans.stem_game.feature;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class PlayActivity extends AppCompatActivity {
    private String difficultylevel;
    TextView question;
    TextView score;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;
    ImageView qImage;

    private TextView hintText;

    private Questions cQuestions = new Questions();

    private String cAnswer;
    private int cScore = 0;
    private int cQuestionsLength = cQuestions.cQuestions.length;

    Random r;

    private SensorManager shakeSensorManager;
    private float sensorAccel;
    private float sensorAccelCurrent;
    private float sensorAccelLast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        r = new Random();


        question = findViewById(R.id.question);
        score = findViewById(R.id.score);
        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
        hintText = findViewById(R.id.hintText);
        qImage =  findViewById(R.id.qImage);



        SharedPreferences sharedPreferences = getSharedPreferences("difficultyLevel",MODE_PRIVATE);
        difficultylevel= sharedPreferences.getString("difficulty","");

        score.setText("Score: " + cScore);

        shakeSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        assert shakeSensorManager != null;
        shakeSensorManager.registerListener(mSensorListener, shakeSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        sensorAccel = 0.00f;
        sensorAccelCurrent = SensorManager.GRAVITY_EARTH;
        sensorAccelLast = SensorManager.GRAVITY_EARTH;


        updateQuestion(r.nextInt(cQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answer1.getText() == cAnswer) {
                cScore++;
                score.setText("Score: " + cScore);
                hintText.setVisibility(View.INVISIBLE);
                updateQuestion(r.nextInt(cQuestionsLength));
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.correct);
                mp.start();
            }
            else {
                System.out.println("You suck");
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.inccorect);
                mp.start();
                gameOver();
            }

        }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2 .getText() == cAnswer) {
                    cScore++;
                    score.setText("Score: " + cScore);
                    hintText.setVisibility(View.INVISIBLE);
                    updateQuestion(r.nextInt(cQuestionsLength));
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.correct);
                    mp.start();
                }
                else {
                    System.out.println("You suck");
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.inccorect);
                    mp.start();
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score: " + cScore);
                    hintText.setVisibility(View.INVISIBLE);
                    updateQuestion(r.nextInt(cQuestionsLength));
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.correct);
                    mp.start();
                }
                else {
                    System.out.println("You suck");
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.inccorect);
                    mp.start();
                    gameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score: " + cScore);
                    hintText.setVisibility(View.INVISIBLE);
                    updateQuestion(r.nextInt(cQuestionsLength));
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.correct);
                    mp.start();
                }
                else {
                    System.out.println("You suck");
                    MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.inccorect);
                    mp.start();
                    gameOver();
                }

            }
        });


    }

    private void updateQuestion(int num) {
        question.setText(cQuestions.getQuestion(num));
        answer1.setText(cQuestions.getChoice1(num));
        answer2.setText(cQuestions.getChoice2(num));
        answer3.setText(cQuestions.getChoice3(num));
        answer4.setText(cQuestions.getChoice4(num));
        hintText.setText(cQuestions.getHint(num));
        qImage.setImageDrawable(getResources().getDrawable(cQuestions.getQImages(num)));


        cAnswer = cQuestions.getCorrectAnswer(num);

    }

    private void gameOver(){
        System.out.println("Gameover function");
        ScoreDatabase scoreDatabase = new ScoreDatabase(this);
        SQLiteDatabase db = scoreDatabase.getReadableDatabase();
        String sql = "INSERT INTO people (name,score) VALUES (\"Jack Smith\", " + cScore + ");";
        db.execSQL(sql);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Gamer Over !!! Your Score is " + cScore)
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), PlayActivity.class));
                                finish();

                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                shareOnTwitter();
                                finish();

                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    private final SensorEventListener mSensorListener = new SensorEventListener() {
        /** Detects Shakes from the Accelerometer **/

        public void onSensorChanged(SensorEvent se) {
            float x = se.values[0];
            float y = se.values[1];
            float z = se.values[2];
            sensorAccelLast = sensorAccelCurrent;
            sensorAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
            float delta = sensorAccelCurrent - sensorAccelLast;
            sensorAccel = sensorAccel * 0.9f + delta;

            //number for sensorAccel is the shaken amount threshold (higher equals more shake)
            if (sensorAccel >= 10 ) {
                hintText.getText();
                hintText.setVisibility(View.VISIBLE);
            }
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        shakeSensorManager.registerListener(mSensorListener, shakeSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        shakeSensorManager.unregisterListener(mSensorListener);
        super.onPause();
    }

    void shareOnTwitter()
    {
        PackageManager pm=getPackageManager();
        try {
            Intent waIntent = new Intent(Intent.ACTION_SEND);
            waIntent.setType("text/plain");
            String text = "I scored " + ""+cScore + "On My chemical Romance, you should give it a go ";

            @SuppressWarnings("unused")
            PackageInfo info=pm.getPackageInfo("com.twitter.android", PackageManager.GET_META_DATA);
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.setPackage("com.twitter.android");

            waIntent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(waIntent, "Share with"));

        } catch (PackageManager.NameNotFoundException e) {
            Toast.makeText(this, "Twitter not Installed", Toast.LENGTH_SHORT)
                    .show();
            return ;
        }
        return ;
    }




    }
