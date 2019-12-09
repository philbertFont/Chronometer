package com.n01192769.chronometer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    Button buttonStart, buttonStop, buttonReset;
    //initialize a variable that will keep track of time passed
    private long seconds = 0;
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//declare buttons to use
        buttonStart = findViewById(R.id.startbutton);
        buttonStop = findViewById(R.id.stopbutton);
        buttonReset = findViewById(R.id.resetbutton);
        chronometer = findViewById(R.id.chronometer);
//button created to start chronometer so it counts up from base time of 0
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //adjusts base time of chronometer with last time it was stopped
                chronometer.setBase(SystemClock.elapsedRealtime() + seconds);
                chronometer.start();//starts chronometer counting
            }
        });
//button to stop chronometer counting
        buttonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//saving current time when stop button is pressed in variable
                seconds = chronometer.getBase() - SystemClock.elapsedRealtime();
                chronometer.stop(); //stops chronometer
            }
        });
//button to reset the chronometer back to 0
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sets the base time as elapse time it was clicked mean (0)
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
    }
}