package com.example.triviagame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ScorePage extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        text = findViewById(R.id.score);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        text.setText("Your score is " + message + "/10");
        Toast.makeText(ScorePage.this, "Thank you for playing",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(ScorePage.this, MainActivity.class);
        ScorePage.this.startActivity(myIntent);
        System.exit(0);
    }
}
