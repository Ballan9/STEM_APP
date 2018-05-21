package com.example.allans.stem_game.feature;

import android.content.SharedPreferences;

import java.util.Objects;
import java.util.Random;


public class Questions {

    //SharedPreferences sharedPreferences = getSharedPreferences("difficultyLevel",MODE_PRIVATE);
    //difficultylevel= sharedPreferences.getString("difficulty","");

    public String cQuestions[] = {
            "What is the chemical compound of water?",
            "What is the chemical compound of CarbondDioxide?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",

    };

    private String cChoices[][] ={
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },

    };

    private String cCorrectAnswers[] = {
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,
            "Hydrogen" ,

    };

    public String aQuestions[] = {
            "What is the chemical compound of water?",
            "What is the chemical compound of CarbondDioxide?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",
            "What is the chemical compound of water?",

    };

    private String aChoices[][] ={
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Gold" },

    };

    private String aCorrectAnswers[] = {
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",
            "Hydrogen" + "Hydrogen" +"Carbon",

    };

    public String getQuestion(int a){
        String question = cQuestions[a];
        return question;

    }

    public String getChoice1(int a){
        String choice = cChoices[a] [0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = cChoices[a] [1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = cChoices[a] [2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = cChoices[a] [3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = cCorrectAnswers[a];
        return answer;
    }



//    if (Objects.equals(difficultylevel, "advanced")){
//        public String cGetQuestion(int a){
//        String question = beginnerQuestions[a];
//        return question;
//    }
//
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
//    }

    }



