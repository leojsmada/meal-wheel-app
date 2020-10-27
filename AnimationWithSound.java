/*
package com.example.animationproject;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;



public class AnimationWithSound extends Activity implements View.OnClickListener
{

//Getting a reference of all the views on the UI


    Button btstart, btstop;

// Getting a reference of the frameanimation and the Animationsound class

    AnimationDrawable frameAnimation;
    AnimationSound asound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     // spinning_wheel = (ImageView) findViewById(R.id.spinning_wheel);
        btstart = (Button) findViewById(R.id.btStart);
        btstop = (Button) findViewById(R.id.btStop);

// To start with , just need the start button to be enabled, user should
        // not be able to click stop until the animation is started

        btstart.setEnabled(true);
        btstop.setEnabled(false);

// Registering the buttons to the onclicklistener

        btstart.setOnClickListener(this);
        btstop.setOnClickListener(this);

// Setting the background of the image view to the animation XML which
// defines how the image frames should be displayed one after the other


// Instantiating the frameanimation. Getting an instance of
        // AnimationDrawable



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int id = v.getId();
        switch (id) {
            case R.id.btStart:

// First create an instance of the AnimationSound class. This will
                // call the AnimationSound constructor in AnimationSound.java and
                // create an instance of the MP3 sound file. Passing the MP3 file
                // which will be used to create the instance of the MediaPlayer

                asound = new AnimationSound(this, R.raw.wheel_spinning_single);

// Starting the animation calling the startsound method in
                // AnimationSound class disabling the start button so that user
                // cannot click it until the animation is stopped enabling the stop
// animation button to allow the user to stop the animation

                frameAnimation.start();


                btstart.setEnabled(false);







                btstop.setEnabled(true);
                break;

            case R.id.btStop:
                // On click of the stop animation button, stopping the frame
                // animation and also the sound enabling the start animation button
                // so that user can restart the animation disabling the stop
                // animation button, so that user cannot click it until the
                // animation is started

                frameAnimation.stop();
                asound.stopsound();
                btstart.setEnabled(true);
                btstop.setEnabled(false);
                break;
            default:
                break;
        }

    }

}
*/
