package com.example.allans.stem_game.feature;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;
import java.util.Random;

public class PlayActivity extends AppCompatActivity {
    private String difficultylevel;
    TextView question;
    TextView score;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;

    private Questions cQuestions = new Questions();

    private String cAnswer;
    private int cScore = 0;
    private int cQuestionsLength = cQuestions.cQuestions.length;

    Random r;


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


        SharedPreferences sharedPreferences = getSharedPreferences("difficultyLevel",MODE_PRIVATE);
        difficultylevel= sharedPreferences.getString("difficulty","");

        score.setText("Score; " + cScore);


        updateQuestion(r.nextInt(cQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answer1.getText() == cAnswer) {
                cScore++;
                score.setText("Score; " + cScore);
                updateQuestion(r.nextInt(cQuestionsLength));
            }
            else {
                GameOver();
            }

        }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2 .getText() == cAnswer) {
                    cScore++;
                    score.setText("Score; " + cScore);
                    updateQuestion(r.nextInt(cQuestionsLength));
                }
                else {
                    GameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score; " + cScore);
                    updateQuestion(r.nextInt(cQuestionsLength));
                }
                else {
                    GameOver();
                }

            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == cAnswer) {
                    cScore++;
                    score.setText("Score; " + cScore);
                    updateQuestion(r.nextInt(cQuestionsLength));
                }
                else {
                    GameOver();
                }

            }
        });
//    String [] beginnerQuestions = {
//            "What is the chemical compound of water?",
//            "What is the chemical compound of CarbonDioxide?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//
//    };
//
//    String [][] beginnerChoices={
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//
//    };
//
//    String [] beginnerCorrectAnswers = {
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//
//    };
//
//    String [] advancedQuestions = {
//            "What is the chemical compound of water?",
//            "What is the chemical compound of CarbonDioxide?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//            "What is the chemical compound of water?",
//
//    };
//
//    String [][]advancedChoices ={
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
//
//    };
//
//    String [] advancedCorrectAnswers = {
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//            "Hydrogen" + "Hydrogen" +"Carbon",
//
//    };



//    if (Objects.equals(difficultylevel, "advanced")){
//        question.setText(advancedQuestions[0]);
//
//
//    }
//        public String cGetQuestion(int a){
//        String question = beginnerQuestions[a];
//        return question;


//    public String getChoice1(int a){
//         String choice = beginnerChoices[a][0];
//         return choice;
//    }
//    public String getChoice2 (int a){
//        String choice = beginnerChoices[a][1];
//        return choice;
//    }
//    public String getChoice3 (int a){
//        String choice = beginnerChoices[a][2];
//        return choice;
//    }
//    public String getChoice4 (int a){
//        String choice = beginnerChoices[a][3];
//        return choice;
//    }
//
//    public String getCorrectAnswer(int a){
//        String answer = beginnerCorrectAnswers[a];
//        return answer;
//    }
//
//        else{
//        public String cGetQuestion(int a){
//        String question = advancedQuestions[a];
//        return question;
//    }
//
//    public String getChoice1(int a){
//         String choice = advancedChoices[a][0];
//         return choice;
//    }
//    public String getChoice2 (int a){
//        String choice = advancedChoices[a][1];
//        return choice;
//    }
//    public String getChoice3 (int a){
//        String choice = advancedChoices[a][2];
//        return choice;
//    }
//    public String getChoice4 (int a){
//        String choice = advancedChoices[a][3];
//        return choice;
//    }
//
//    public String getCorrectAnswer(int a){
//        String answer = advancedCorrectAnswers[a];
//        return answer;
    }

    private void updateQuestion(int num) {
        question.setText(cQuestions.getQuestion(num));
        answer1.setText(cQuestions.getChoice1(num));
        answer2.setText(cQuestions.getChoice2(num));
        answer3.setText(cQuestions.getChoice3(num));
        answer4.setText(cQuestions.getChoice4(num));

        cAnswer = cQuestions.getCorrectAnswer(num);

    }

    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PlayActivity.this);
        alertDialogBuilder
                .setMessage("Gamer Over !!! Your Score is" + cScore + "Questions Right")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), PlayActivity.class));

                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();

                            }
                        });

    }




    }
