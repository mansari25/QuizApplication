package com.example.mackansari.quizapplication;

/**
 * Created by mackansari on 7/16/17.
 */

public class Questions {

    public String mQuestions[] = {
           " Which is the only American state to begin with the letter 'p'?" ,
            "Name the world's biggest island.",
            "What is the world longest river? " ,
           " Name the world largest ocean.",
            "What is the diameter of Earth?",
            "Where would you find the world's most ancient forest?",
            "Which British cities have underground rail systems?",
           " What is the capital city of Spain?",
    };


    private String mChoices[][] = {
            {"Pennsylvania","PennState","Pittsburgh","PeaceOut"},
            {"Greenland","PennState","Pittsburgh","PeaceOut"},
            {"Amazon","PennState","Pittsburgh","PeaceOut"},
            {"Pacific","PennState","Pittsburgh","PeaceOut"},
            {"8,0000","PennState","Pittsburgh","PeaceOut"},
            {"Australia","PennState","Pittsburgh","PeaceOut"},
            {"Liverpool","PennState","Pittsburgh","PeaceOut"},
            {"Madrid","PennState","Pittsburgh","PeaceOut"},

    };

    private String mCorrectAnswers[] = {"Pennsylvania","Greenland","Amazon","Pacific","8,0000","Australia","Liverpool","Madrid"};

    public String getQuestions(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswers(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
