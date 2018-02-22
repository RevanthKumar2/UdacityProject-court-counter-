package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add6toTeamA(View view)
    {
        scoreA =scoreA+6;
        displayForTeamA(scoreA);
    }
    public void add3toTeamA(View view)
    {
        scoreA = scoreA+3;
        displayForTeamA(scoreA );
    }
    public void add1toTeamA(View view)
    {
        scoreA =scoreA+1;
        displayForTeamA(scoreA );
    }
    public void add2toTeamA(View view)
    {
        scoreA =scoreA+2;
        displayForTeamA(scoreA );
    }
    public void add6toTeamB(View view)
    {
        scoreB=scoreB+6;
        displayForTeamB(scoreB );
    }
    public void add3toTeamB(View view)

    {
        scoreB = scoreB+3;
        displayForTeamB(scoreB );
    }
    public void add1toTeamB(View view)
    {
        scoreB=scoreB+1;
        displayForTeamB(scoreB );
    }
    public void add2toTeamB(View view)
    {
        scoreB =scoreB+2;
        displayForTeamB(scoreB );
    }
    public void reset(View view)
    {
        scoreA = 0 ;
        scoreB = 0 ;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
