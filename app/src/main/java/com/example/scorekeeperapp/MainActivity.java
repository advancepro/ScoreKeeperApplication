package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAscore = 0;
    int TeamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamA(View view) {
        TeamAscore=TeamAscore + 1;
        display(TeamAscore);
    }

    private void display(int teamAscore) {
        TextView TeamAValue = (TextView) findViewById(R.id.TeamAValue);
        TeamAValue.setText(""+teamAscore);
    }

    public void TeamB(View view) {
        TeamBscore = TeamBscore + 1;
        displayS(TeamBscore);
    }

    private void displayS(int teamBscore) {
        TextView TeamBValue = (TextView) findViewById(R.id.TeamBValue);
        TeamBValue.setText(""+TeamBscore);
    }

    public void reset(View view) {
        TeamAscore = 0;
        TeamBscore = 0;
        display(TeamAscore);
        displayS(TeamBscore);
    }
}