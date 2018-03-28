package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView   ballDisplay = findViewById(R.id.image_eightBall); //Locating the imageball

        final int   ballArray[] = { //Storing all the responses in an array
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        Button  askButton = findViewById(R.id.askButton);//Linking xml button to java code

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();//Random object to generate random numbers
                int randomNumber = randomNumberGenerator.nextInt(5);//Variable to store random number

                ballDisplay.setImageResource(ballArray[randomNumber]);//Throw a random answer stored in ballArray with randomNumber

            }
        });

    }
}
