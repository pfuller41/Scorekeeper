package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamOne = 0;

    // Tracks the score for Team B
    int scoreTeamTwo = 0;



    //Add Outs Team 1
    int outTeamOne = 0;

    //Add Outs Team 2
    int outTeamTwo = 0;

    //Add Strike Team 1
    int strikeTeamOne = 0;

    //Add Strike Team 1
    int strikeTeamTwo = 0;

    //Add Ball Team 1
    int ballTeamOne = 0;

    //Add Ball Team2
    int ballTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Add the score for Team One
     */
    public void addScoreForTeamOne(View v) {
        scoreTeamOne = scoreTeamOne + 1;
        displayscoreTeamOne(scoreTeamOne);
    }

    /**
     *Add the score for Team Two
     */
    public void addScoreForTeamTwo(View v) {
        scoreTeamTwo = scoreTeamTwo + 1;
        displayscoreTeamTwo(scoreTeamTwo);
    }



    /**
     *Add the out for Team One
     */
    public void addOutForTeamOne(View v) {
        outTeamOne = outTeamOne + 1;
        displayoutTeamOne(outTeamOne);
    }

    /**
     *Add the out for Team Two
     */
    public void addOutForTeamTwo (View v) {
        outTeamTwo = outTeamTwo + 1;
        displayoutTeamTwo(outTeamTwo);
    }

    /**
     *Add the strike for Team One
     */
    public void addStrikeForTeamOne(View v) {
        strikeTeamOne = strikeTeamOne + 1;
        displaystrikeTeamOne(strikeTeamOne);
    }

    /**
     *Add the strike for Team Two
     */
    public void addStrikeForTeamTwo(View v) {
        strikeTeamTwo = strikeTeamTwo + 1;
        displaystrikeTeamTwo(strikeTeamTwo);
    }

    /**
     *Add the ball for Team One
     */
    public void addBallForTeamOne(View v) {
        ballTeamOne = ballTeamOne + 1;
        displayballTeamOne(ballTeamOne);
    }

    /**
     *Add the ball for Team Two
     */
    public void addBallForTeamTwo(View v) {
        ballTeamTwo = ballTeamTwo + 1;
        displayballTeamTwo(ballTeamTwo);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        displayscoreTeamOne(scoreTeamOne);
        displayscoreTeamTwo(scoreTeamTwo);

        outTeamOne = 0;
        outTeamTwo = 0;
        displayoutTeamOne(outTeamOne);
        displayoutTeamTwo(outTeamTwo);

        strikeTeamOne = 0;
        strikeTeamTwo = 0;
        displaystrikeTeamOne(strikeTeamOne);
        displaystrikeTeamTwo(strikeTeamTwo);

        ballTeamOne = 0;
        ballTeamTwo = 0;
        displayballTeamOne(ballTeamOne);
        displayballTeamTwo(ballTeamTwo);
    }

    /**
     * This display shows the score for team One
     */
    public void displayscoreTeamOne(int scoreTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.team_one_score);
        scoreView.setText(String.valueOf(scoreTeamOne));
    }

    /**
     * Displays the given score for Team Two.
     */
    public void displayscoreTeamTwo(int scoreTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.team_two_score);
        scoreView.setText(String.valueOf(scoreTeamTwo));
    }


    /**
     * Displays the out for Team One.
     */
    public void displayoutTeamOne(int outTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.team_one_out);
        scoreView.setText(String.valueOf(outTeamOne));
    }

    /**
     * Displays out for Team Two.
     */
    public void displayoutTeamTwo(int outTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.team_two_out);
        scoreView.setText(String.valueOf(outTeamTwo));
    }

    /**
     * Displays strike for Team One.
     */
    public void displaystrikeTeamOne(int strikeTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.team_one_strike);
        scoreView.setText(String.valueOf(strikeTeamOne));
    }

    /**
     * Displays strike for Team Two.
     */
    public void displaystrikeTeamTwo(int strikeTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.team_two_strike);
        scoreView.setText(String.valueOf(strikeTeamTwo));
    }

    /**
     * Displays ball for Team One.
     */
    public void displayballTeamOne(int ballTeamOne) {
        TextView scoreView = (TextView) findViewById(R.id.team_one_ball);
        scoreView.setText(String.valueOf(ballTeamOne));
    }

    /**
     * Displays ball for Team Two.
     */
    public void displayballTeamTwo(int ballTeamTwo) {
        TextView scoreView = (TextView) findViewById(R.id.team_two_ball);
        scoreView.setText(String.valueOf(ballTeamTwo));
    }
}




