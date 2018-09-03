package com.mochijump.mochijumpandroid;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartScreen extends AppCompatActivity {
ImageButton start = (ImageButton) findViewById(R.id.startButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("test Accepted");

            }
        });
    }



}
