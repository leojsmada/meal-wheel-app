package com.example.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    ImageView spinning_wheel;
    MediaPlayer mp;
    Random r;
    int degree = 0, degree_old = 0;
    //12 sections on the wheels? (30 degrees each)
    private static final float FACTOR = 30.0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.wheel_spinning);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        spinning_wheel = (ImageView) findViewById(R.id.spinning_wheel);
        r = new Random();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degree_old = degree % 360;
                degree = r.nextInt(3600) + 720;//<-----------was 720
                RotateAnimation rotate = new RotateAnimation(degree_old, degree, RotateAnimation.RELATIVE_TO_SELF,
                        0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(7250);
                rotate.setFillAfter(true);
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        //textView.setText(currentNumber(360 - (degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }


                });


                mp.start();
                mp.isLooping();
                spinning_wheel.startAnimation(rotate);
            }
        });

    }
}
//    private String currentSelection(int degrees)
//    {
//        String text = "";
//
//        if(degrees >= (FACTOR * 1) && degrees < (FACTOR)* 1  )
//
//        {
//            text = "red";
//        }
//
//        if(degrees >= (FACTOR * 2) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 3) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 4) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 5) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 6) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 7) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 8) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 9) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 10) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 11) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        if(degrees >= (FACTOR * 12) && degrees < (FACTOR)* 3  )
//
//        {
//            text = "";
//        }
//        return text;
//    }




