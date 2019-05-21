package com.example.triviagame;

public class QuestionLibrary {
    private String mQuestion [] = {"Which of these chess figures is closely related to 'Bohemian Rhapsody'?",
            "Adele performed the theme song to which James Bond film?",
            "Which of these countries was not a Soviet Republic in USSR?",
            "According to Persian folklore, who is the storyteller of 'One Thousand and One Nights'?",
            "Which mammal first reached Earth's orbit alive?",
            "What did Alfred Nobel develop?",
            "Which of these antagonist characters was created by novelist J.K. Rowling?",
            "What is the largest planet in our Solar System?",
            "Which country hosted the Summer Olympics in 2016?",
            "What temperature is the same in Celsius and Fahrenheit?"};

    private String mChoices [][] = {
            {"Bishop","Queen","Pawn","King"},
            {"Quantum of Solace","From Russia With Love","Skyfall","Casino Royale"},
            {"Azerbaijan","Serbia","Moldova","Kyrgyzstan"},
            {"Homer","Hatshepsut","Kanaan","Scheherazade"},
            {"Monkey","Human","Dog","Cat"},
            {"Dynamite","Gunpowder","Atomic bomb","Nobelium"},
            {"Professor Moriarty","Darth Vader","Lord Voldemort","Lord Farqaad"},
            {"Jupiter","Saturn","Earth","Pluto"},
            {"China","Spain","Greece","Brazil"},
            {"+100°","-40°","+40°","0°"}
    };
    private String mAnswers [] = {"Queen","Skyfall","Serbia","Scheherazade","Dog","Dynamite",
            "Lord Voldemort","Jupiter","Brazil","-40°"};


    public String getQuestion (int n) {
        String question = mQuestion[n];
        return question;
    }

    public String getChoice1 (int n) {
        String choice1 = mChoices[n][0];
        return choice1;
    }

    public String getChoice2 (int n) {
        String choice2 = mChoices[n][1];
        return choice2;
    }

    public String getChoice3 (int n) {
        String choice3 = mChoices[n][2];
        return choice3;
    }

    public String getChoice4 (int n) {
        String choice4 = mChoices[n][3];
        return choice4;
    }

    public String getAnswer (int n) {
        String answer = mAnswers[n];
        return answer;
    }

}
