package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * vars for the team scores and faults
     */
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int faultsTeamA = 0;
    private int faultsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * get team a score
     *
     * @return scoreTeamA
     */
    public int getScoreTeamA() {
        return scoreTeamA;
    }

    /**
     * set team a score
     *
     * @param scoreTeamA number of goals of team a
     */
    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    /**
     * get team b score
     *
     * @return scoreTemB
     */
    public int getScoreTeamB() {
        return scoreTeamB;
    }

    /**
     * set team b score
     *
     * @param scoreTeamB number of goals of team b
     */
    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }

    /**
     * get team a faults
     *
     * @return faultsTeamA
     */
    public int getFaultsTeamA() {
        return faultsTeamA;
    }

    /**
     * set team A faults
     *
     * @param faultsTeamA number of faults of team a
     */
    public void setFaultsTeamA(int faultsTeamA) {
        this.faultsTeamA = faultsTeamA;
    }

    /**
     * get team b faults
     *
     * @return faultsTeamB
     */
    public int getFaultsTeamB() {
        return faultsTeamB;
    }

    /**
     * set team b faults
     *
     * @param faultsTeamB number of faults of tram b
     */
    public void setFaultsTeamB(int faultsTeamB) {
        this.faultsTeamB = faultsTeamB;
    }

    /**
     * add's a goal to team a score
     *
     * @param view view of team a score
     */
    public void addGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);

    }

    /**
     * add's a fault to team a faults
     *
     * @param view view of team a fault's
     */
    public void addFaultTeamA(View view) {
        faultsTeamA = faultsTeamA + 1;
        displayFaultTeamA(faultsTeamA);

    }

    /**
     * displays the score of team a
     *
     * @param score team a score
     */
    private void displayScoreTeamA(int score) {
        TextView scoreTeamAView = findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(score));
    }

    /**
     * displays the faults of team a
     *
     * @param fault team a fault's
     */
    private void displayFaultTeamA(int fault) {
        TextView faultTeamAView = findViewById(R.id.team_a_fault);
        faultTeamAView.setText(String.valueOf(fault));
    }

    /**
     * add's a goal to team b score
     *
     * @param view view of team b score
     */
    public void addGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);

    }

    /**
     * add's a fault to team b fault
     *
     * @param view of team b fault's
     */
    public void addFaultTeamB(View view) {
        faultsTeamB = faultsTeamB + 1;
        displayFaultTeamB(faultsTeamB);

    }

    /**
     * displays the team b score
     *
     * @param score number of team b goals
     */
    private void displayScoreTeamB(int score) {
        TextView scoreTeamBView = findViewById(R.id.team_b_score);
        scoreTeamBView.setText(String.valueOf(score));
    }

    /**
     * displays team b fault's
     *
     * @param fault number of team faults
     */
    private void displayFaultTeamB(int fault) {
        TextView faultTeamBView = findViewById(R.id.team_b_fault);
        faultTeamBView.setText(String.valueOf(fault));
    }

    /**
     * resets all vars to 0 and display's them on the screen
     *
     * @param view resets the views vars
     */
    public void reset(View view) {
        setScoreTeamA(0);
        setScoreTeamB(0);
        setFaultsTeamA(0);
        setFaultsTeamB(0);
        displayScoreTeamA(getScoreTeamA());
        displayFaultTeamA(getFaultsTeamA());
        displayScoreTeamB(getScoreTeamB());
        displayFaultTeamB(getFaultsTeamB());
    }
}
