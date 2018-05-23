package com.example.allans.stem_game.feature;


public class Questions {

    //SharedPreferences sharedPreferences = getSharedPreferences("difficultyLevel",MODE_PRIVATE);
    //difficultylevel= sharedPreferences.getString("difficulty","");

    public String cQuestions[] = {
            "What is the chemical Property of H?",
            "What is the chemical Property of C?",
            "What is the chemical Property of O?",
            "What is the chemical Property of Au?",
            "What is the chemical Property of Li?",
            "What is the chemical Property of Mg?",
            "What is the chemical Property of Ca?",
            "What is the chemical Property of K?",
            "What is the chemical Property of Kr?",
            "What is the chemical Property of He?",

    };

    private int qImages []= {
            R.drawable.hydrogen,
            R.drawable.carbon,
            R.drawable.oxygen,
            R.drawable.gold,
            R.drawable.lithium,
            R.drawable.magnesium,
            R.drawable.calcium,
            R.drawable.potassium,
            R.drawable.krypton,
            R.drawable.helium,


    };

    private String cChoices[][] ={
            {"Hydrogen" ,"Helium", "Oxygen", "Harmonica" },
            {"Cotton" ,"Carbon", "Calcium", "Gold" },
            {"Ollie" ,"Osmium", "Oxygen", "Ox" },
            {"Australia" ,"Autism", "Oxygen", "Gold" },
            {"Oxygen" ,"Lighter", "Lithium", "Loom" },
            {"Gold" ,"Muscles", "Manganese", "Magnesium" },
            {"Calcium" ,"Carbon", "Cowboys", "Cook" },
            {"Hydrogen" ,"Possum", "Potassium", "Punter" },
            {"Krunk" ,"Krypton", "Oxygen", "Krusty" },
            {"Hydrogen" ,"Carbon", "Oxygen", "Helium" },

    };

    private String cCorrectAnswers[] = {
            "Hydrogen" ,
            "Carbon" ,
            "Oxygen" ,
            "Gold" ,
            "Lithium" ,
            "Magnesium" ,
            "Calcium" ,
            "Potassium" ,
            "Krypton" ,
            "Helium" ,

    };

    public String cHint[] = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",


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

    public int getQImages(int a) {
        int image = qImages[a];
        return image;
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

    public String getHint(int a){
        String hint = cHint[a];
        return hint;
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



