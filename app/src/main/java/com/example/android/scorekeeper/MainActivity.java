package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* Initialization of the team scores and team fouls*/
    private int teamScoreA = 0;
    private int teamFoulsA = 0;
    private int teamScoreB = 0;
    private int teamFoulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Resetting both team scores and fouls*/
    public void resetBothTeams(View view){
        teamFoulsB = 0;
        teamScoreB = 0;
        teamFoulsA = 0;
        teamScoreA = 0;
        displayTeamAScore();
        displayTeamAFouls();
        displayTeamBScore();
        displayTeamBFouls();
    }





    /* Java code for Team A */



    /* Incrementing team score for team A for every goal scored by team A */
    public void goalTeamA(View view){
        teamScoreA++;
        displayTeamAScore();
    }

    /* Displays the score of team A */
    private void displayTeamAScore(){
        TextView ScoreTeamA = findViewById(R.id.teamA_score_text_view);
        String score = "" + teamScoreA;
        ScoreTeamA.setText(score);
    }

    /* Incrementing team fouls for team A for every foul committed by team A */
    public void foulTeamA(View view){
        teamFoulsA++;
        displayTeamAFouls();
    }

    /* Displays the fouls of team A */
    private void displayTeamAFouls(){
        TextView ScoreTeamA = findViewById(R.id.teamA_fouls_text_view);
        String fouls = "" + teamFoulsA;
        ScoreTeamA.setText(fouls);
    }

    /* Resets the fouls of team A only */
    public void resetTeamA(View view){
        teamFoulsA = 0;
        teamScoreA = 0;
        displayTeamAScore();
        displayTeamAFouls();
    }





    /* Java code for Team B */





    /* Incrementing team score for team B for every goal scored by team B */
    public void goalTeamB(View view){
        teamScoreB++;
        displayTeamBScore();
    }

    /* Displays the score of team B */
    private void displayTeamBScore(){
        TextView ScoreTeamB = findViewById(R.id.teamB_score_text_view);
        String score = "" + teamScoreB;
        ScoreTeamB.setText(score);
    }

    /* Incrementing team fouls for team B for every foul committed by team B */
    public void foulTeamB(View view){
        teamFoulsB++;
        displayTeamBFouls();
    }

    /* Displays the fouls of team B */
    private void displayTeamBFouls(){
        TextView ScoreTeamB = findViewById(R.id.teamB_fouls_text_view);
        String fouls = "" + teamFoulsB;
        ScoreTeamB.setText(fouls);
    }

    /* Resets the fouls of team B only */
    public void resetTeamB(View view){
        teamFoulsB = 0;
        teamScoreB = 0;
        displayTeamBScore();
        displayTeamBFouls();
    }

}
