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
// okay if I understand this right, I want to start here and treat this as the main() method. I can then build my framework
// around this. Odd that andriod studio just sticks all this into one class.
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
