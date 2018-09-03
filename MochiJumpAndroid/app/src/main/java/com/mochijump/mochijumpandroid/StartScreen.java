package com.mochijump.mochijumpandroid;


import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class StartScreen extends AppCompatActivity {
ImageButton start;
ImageView mochiIcon;

Display display;
Point size = new Point();
int screenWidth;
int screenHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        start =  (ImageButton) findViewById(R.id.startButton);
        mochiIcon = (ImageView) findViewById(R.id.mochiIcon);
        display= getWindowManager().getDefaultDisplay();
        resizeScreen();
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("test Accepted");

            }
        });
    }

    public void resizeScreen(){
        display.getSize(size);
        screenWidth = size.x;
        screenHeight = size.y;

        mochiIcon.getLayoutParams().width= (222*screenWidth/1366);
        mochiIcon.getLayoutParams().height = (225*screenHeight/786);
    }



}
