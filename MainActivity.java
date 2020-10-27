package com.example.animationproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

import static android.os.Build.VERSION_CODES.LOLLIPOP;


public class MainActivity extends AppCompatActivity
{
    Button button;
    TextView textView;
    ImageView spinning_wheel;
    //MediaPlayer mp;
    Random r;
    int degree = 0, degree_old = 0;

    //12 sections on the wheels? (30 degrees each)
    private static final float FACTOR = 30.0f;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //mp = MediaPlayer.create(this, R.raw.banjo);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        spinning_wheel = (ImageView) findViewById(R.id.spinning_wheel_updated);
        r = new Random();


        button.setOnClickListener(new View.OnClickListener()
        {
            @RequiresApi(api = LOLLIPOP)
            MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.ukulelee);
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
                        //startSound();//<-------------------------------------------------CHECK THIS
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }


                });

                spinning_wheel.startAnimation(rotate);
                mp.start();


            }


        });

    }


    private String currentNumber(int degrees) {
        String text = "";


        if (degrees >= (1) && degrees < (FACTOR) * 1) {
            text = "LIGHT YELLOW";
        }

        if (degrees >= (31) && degrees < (FACTOR) * 2) {
            text = "LIGHT ORANGE";
        }
        if (degrees >= (61) && degrees < (FACTOR) * 3) {
            text = "RED";
        }
        if (degrees >= (91) && degrees < (FACTOR) * 4) {
            text = "DARK ORANGE";
        }
        if (degrees >= (121) && degrees < (FACTOR) * 5) {
            text = "DARK YELLOW";
        }
        if (degrees >= (151) && degrees < (FACTOR) * 6) {
            text = "DARK GREEN";
        }
        if (degrees >= (181) && degrees < (FACTOR) * 7) {
            text = "DARK BLUE";
        }
        if (degrees >= (211) && degrees < (FACTOR) * 8) {
            text = "NAVY BLUE";
        }
        if (degrees >= (241) && degrees < (FACTOR) * 9) {
            text = "PURPLE";
        }
        if (degrees >= (271) && degrees < (FACTOR) * 10) {
            text = "PINK";
        }
        if (degrees >= (301) && degrees < (FACTOR) * 11) {
            text = "LIGHT BLUE";
        }
        if (degrees >= (331) && degrees < (FACTOR) * 12) {
            text = "LIGHT GREEN";
        }
 /*       if((degrees >= (FACTOR * 73) && degrees < 360 || (degrees >= 0 && degrees < (FACTOR * 1))))
        {
            text = "0";
        }*/
        return text;


    }


}




