package com.example.triviagame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Questions extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mQuestion;
    private Button mChoice1;
    private Button mChoice2;
    private Button mChoice3;
    private Button mChoice4;

    private String mAnswer;
    private int score = 0;
    private int questionNumber = 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        mQuestion = findViewById(R.id.question);
        mChoice1 = findViewById(R.id.choice1);
        mChoice2 = findViewById(R.id.choice2);
        mChoice3 = findViewById(R.id.choice3);
        mChoice4 = findViewById(R.id.choice4);

        updateQuestion();

        //Button Listener for first button
        mChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mChoice1.getText() == mAnswer) {
                    score++;
                    Toast.makeText(Questions.this, "correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Questions.this, "wrong",Toast.LENGTH_SHORT).show();
                }

                if(questionNumber == 10) {
                    Intent intent = new Intent(Questions.this, ScorePage.class);
                    intent.putExtra("message", String.valueOf(score));
                    startActivity(intent);
                }
                else updateQuestion();
            }
        });
        //End Listener for first button



        //Button Listener for second button
        mChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mChoice2.getText() == mAnswer) {
                    score++;
                    Toast.makeText(Questions.this, "correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Questions.this, "wrong",Toast.LENGTH_SHORT).show();
                }

                if(questionNumber == 10) {
                    Intent intent = new Intent(Questions.this, ScorePage.class);
                    intent.putExtra("message", String.valueOf(score));
                    startActivity(intent);
                }
                else updateQuestion();
            }
        });
        //End Listener for second button




        //Button Listener for third button
        mChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mChoice3.getText() == mAnswer) {
                    score++;
                    Toast.makeText(Questions.this, "correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Questions.this, "wrong",Toast.LENGTH_SHORT).show();
                }

                if(questionNumber == 10) {
                    Intent intent = new Intent(Questions.this, ScorePage.class);
                    intent.putExtra("message", String.valueOf(score));
                    startActivity(intent);
                }
                else updateQuestion();
            }
        });
        //End Listener for third button




        //Button Listener for forth button
        mChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mChoice4.getText() == mAnswer) {
                    score++;
                    Toast.makeText(Questions.this, "correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Questions.this, "wrong",Toast.LENGTH_SHORT).show();
                }

                if(questionNumber == 10) {
                    Intent intent = new Intent(Questions.this, ScorePage.class);
                    intent.putExtra("message", String.valueOf(score));
                    startActivity(intent);
                }
                else updateQuestion();
            }
        });
        //End Listener for forth button

    }

    public void updateQuestion() {

        mQuestion.setText(mQuestionLibrary.getQuestion(questionNumber));
        mChoice1.setText(mQuestionLibrary.getChoice1(questionNumber));
        mChoice2.setText(mQuestionLibrary.getChoice2(questionNumber));
        mChoice3.setText(mQuestionLibrary.getChoice3(questionNumber));
        mChoice4.setText(mQuestionLibrary.getChoice4(questionNumber));
        mAnswer = mQuestionLibrary.getAnswer(questionNumber);

        questionNumber++;
    }
}