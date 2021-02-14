package com.example.weigthlifting;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamAcleanjurk = 0;
    int scoreTeamAsnatch = 0;
    int scoreTeamAtotal = 0;
    int scoreTeamBcleanjurk = 0;
    int scoreTeamBsnatch = 0;
    int scoreTeamBtotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A Clean by +20 kg.
     */

    public void addcleanTeamA(View v) {
        scoreTeamAcleanjurk = scoreTeamAcleanjurk + 20;
        displayForTeamAClean(scoreTeamAcleanjurk);
        scoreTeamAtotal = scoreTeamAsnatch + scoreTeamAcleanjurk;
        displayForTeamAtotal(scoreTeamAtotal);
    }

    /**
     * Decrease the score for Team A Clean by -20 kg.
     */

    public void minuscleanTeamA(View v) {
        scoreTeamAcleanjurk = scoreTeamAcleanjurk - 20;
        displayForTeamAClean(scoreTeamAcleanjurk);
        scoreTeamAtotal = scoreTeamAsnatch + scoreTeamAcleanjurk;
        displayForTeamAtotal(scoreTeamAtotal);
    }

    /**
     * Increase the score for Team A Snatch by +20 kg.
     */

    public void addsnatchTeamA(View v) {
        scoreTeamAsnatch = scoreTeamAsnatch + 20;
        displayForTeamASnatch(scoreTeamAsnatch);
        scoreTeamAtotal = scoreTeamAsnatch + scoreTeamAcleanjurk;
        displayForTeamAtotal(scoreTeamAtotal);
    }

    /**
     * Decrease the score for Team A Snatch by -20 kg.
     */

    public void minussnatchTeamA(View v) {
        scoreTeamAsnatch = scoreTeamAsnatch - 20;
        displayForTeamASnatch(scoreTeamAsnatch);
        scoreTeamAtotal = scoreTeamAsnatch + scoreTeamAcleanjurk;
        displayForTeamAtotal(scoreTeamAtotal);
    }

    /**
     * Increase the score for Team B Clean by +20 kg.
     */

    public void addcleanTeamB(View v) {
        scoreTeamBcleanjurk = scoreTeamBcleanjurk + 20;
        displayForTeamBClean(scoreTeamBcleanjurk);
        scoreTeamBtotal = scoreTeamBsnatch + scoreTeamBcleanjurk;
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Decrease the score for Team B Clean by -20 kg.
     */

    public void minuscleanTeamB(View v) {
        scoreTeamBcleanjurk = scoreTeamBcleanjurk - 20;
        displayForTeamBClean(scoreTeamBcleanjurk);
        scoreTeamBtotal = scoreTeamBsnatch + scoreTeamBcleanjurk;
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Increase the score for Team B Snatch by +20 kg.
     */

    public void addsnatchTeamB(View v) {
        scoreTeamBsnatch = scoreTeamBsnatch + 20;
        displayForTeamBSnatch(scoreTeamBsnatch);
        scoreTeamBtotal = scoreTeamBsnatch + scoreTeamBcleanjurk;
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Decrease the score for Team A Snatch by -20 kg.
     */

    public void minussnatchTeamB(View v) {
        scoreTeamBsnatch = scoreTeamBsnatch - 20;
        displayForTeamBSnatch(scoreTeamBsnatch);
        scoreTeamBtotal = scoreTeamBsnatch + scoreTeamBcleanjurk;
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Reset Only A TEAM
     */

    public void resetA(View v) {
        scoreTeamAcleanjurk = 0;
        scoreTeamAsnatch = 0;
        scoreTeamAtotal = 0;
        displayForTeamAClean(scoreTeamAcleanjurk);
        displayForTeamASnatch(scoreTeamAsnatch);
        displayForTeamAtotal(scoreTeamAtotal);
    }

    /**
     * Reset Only B TEAM
     */

    public void resetB(View v) {
        scoreTeamBcleanjurk = 0;
        scoreTeamBsnatch = 0;
        scoreTeamBtotal = 0;
        displayForTeamBClean(scoreTeamBcleanjurk);
        displayForTeamBSnatch(scoreTeamBsnatch);
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Reset All TEAM
     */

    public void resetall(View v) {
        scoreTeamAcleanjurk = 0;
        scoreTeamAsnatch = 0;
        scoreTeamAtotal = 0;
        displayForTeamAClean(scoreTeamAcleanjurk);
        displayForTeamASnatch(scoreTeamAsnatch);
        displayForTeamAtotal(scoreTeamAtotal);
        scoreTeamBcleanjurk = 0;
        scoreTeamBsnatch = 0;
        scoreTeamBtotal = 0;
        displayForTeamBClean(scoreTeamBcleanjurk);
        displayForTeamBSnatch(scoreTeamBsnatch);
        displayForTeamBtotal(scoreTeamBtotal);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamAClean(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cjscoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamASnatch(int score) {
        TextView scoreView = (TextView) findViewById(R.id.snatchscoreA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAtotal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ttscoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamBClean(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cjscoreB);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamBSnatch(int score) {
        TextView scoreView = (TextView) findViewById(R.id.snatchscoreB);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamBtotal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ttscoreB);
        scoreView.setText(String.valueOf(score));
    }
}