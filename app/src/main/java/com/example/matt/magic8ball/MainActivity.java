package com.example.matt.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.e("TAG", "Matthew");
        double myAge = 27.0;

        String result = String.format("%.2f", myAge);
        Log.d("TAG", result);

        ArrayList<String> newResponses = new ArrayList<>();

        newResponses.add("Will the weather be good tomorrow");
        newResponses.add("Will this be a long semester");

        EightBallModel myFortune;
        myFortune = new EightBallModel(newResponses);

        Log.d("TAG", myFortune.magicResponse());

        // output object to the console
        System.out.println(myFortune);

        // emoji support - doesn't support emojis because strings are 2bytes in size and
        // emojis are bigger than this in size

        setContentView(R.layout.activity_main);
    }
}
