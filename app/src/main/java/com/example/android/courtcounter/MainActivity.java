package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    
    public void addThreeToA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeToB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoToA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoToB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneToA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneToB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetToZero(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForWinner();
    }

    public void predictWinner(View view) {
        int result;
        if (scoreTeamB>scoreTeamA){
            result = scoreTeamB-scoreTeamA;
            displayForWinner(result,"B");
        }
        else if (scoreTeamA > scoreTeamB){
            result = scoreTeamA - scoreTeamB;
            displayForWinner(result,"A");
        }
        else{
            displayForWinner( "Tie");
        }

    }
    public void displayForWinner(int score, String winner) {
        TextView scoreView = (TextView) findViewById(R.id.predict_winner);
        scoreView.setText("Team "+winner+" wins the game by "+String.valueOf(score)+" points.");
    }
    public void displayForWinner(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.predict_winner);
        scoreView.setText("It's a Tie Game");
    }
    public void displayForWinner() {
        TextView scoreView = (TextView) findViewById(R.id.predict_winner);
        scoreView.setText("");
    }
}