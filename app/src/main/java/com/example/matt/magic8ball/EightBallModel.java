package com.example.matt.magic8ball;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import android.util.Log;
import java.util.*;

public class EightBallModel extends AppCompatActivity {

    static ArrayList<String> initialResponseArray = new ArrayList<>();
    static ArrayList<String> responseArray = new ArrayList<>();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    EightBallModel() {
        this.initialiseResponse();
    }


    EightBallModel(ArrayList <String> extraResponseArray) {
        this.initialiseResponse();
        for(String resp : initialResponseArray){
            responseArray.add(resp);
        }
        for (String value : extraResponseArray) {
            responseArray.add(value);
        }

    }

    private void initialiseResponse() {
        this.initialResponseArray.add("Will I get full marks for this lab");
        this.initialResponseArray.add("Will the Cronulla sharks receive a premiership this year");
        this.initialResponseArray.add("Will I end up becoming a cat person when I get old");

    }

    public String magicResponse(){

        int size = responseArray.size();
        Random rand;
        int n = 0;
        String eightResponse;

        if(size> 0){
            rand = new Random();
            n = rand.nextInt(responseArray.size()-1) + 1;
            eightResponse = String.valueOf(responseArray.get(n));
            return eightResponse;
        }

        return "";

    }

    // override the toString function to return the information of the current object
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + ", ArrayList: " + responseArray;
    }


    // constructors and other methods omitted

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "EightBallModel Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.matt.magic8ball/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "EightBallModel Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.matt.magic8ball/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
