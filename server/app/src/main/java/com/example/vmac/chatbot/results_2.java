package com.example.vmac.chatbot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.vmac.WatBot.R;


//RESULT SCREEN IF THEY USER PLAYED A HUMAN
public class results_2 extends genericResults {

    private static String TAG = "results_2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_2);

        //get the time taken from the main activity class
        Intent in = getIntent();
        String timeTaken;
        timeTaken = in.getStringExtra("timeTaken");
        //Toast.makeText(this, "Time elapsed:" + timeTaken, Toast.LENGTH_SHORT).show();

        //display the time taken to the screen - using the layout screen
        TextView timeToDisplay = (TextView) findViewById(R.id.timeHumanText);
        timeToDisplay.setText(timeTaken);
        boolean result = in.getBooleanExtra("guessedRight", false);
        changeScore(result);
    }

    //avoid user going back into game when it is finished. Back to home screen.
    @Override
    public void onBackPressed() {
        Intent backToHome = new Intent(this, home_screen.class);
        startActivity(backToHome);
    }

}
