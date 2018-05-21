package com.example.allans.stem_game.feature;

import android.content.SharedPreferences;

import java.util.Objects;
import java.util.Random;


public class Questions {

    //SharedPreferences sharedPreferences = getSharedPreferences("difficultyLevel",MODE_PRIVATE);
    //difficultylevel= sharedPreferences.getString("difficulty","");

    public String beginnerQuestions[] = {
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

    private String beginnerChoices[][] ={
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

    private String beginnerCorrectAnswers[] = {
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

    public String advancedQuestions[] = {
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

    private String advancedChoices[][] ={
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

    private String advancedCorrectAnswers[] = {
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



