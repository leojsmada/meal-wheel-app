/*
package com.example.animationproject;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;

public class AnimationSound extends MainActivity
{

  // This class is used to handle playing the sounds when animation is started/stopped

    AnimationDrawable frameAnimation;
    AnimationSound asound;

        AnimationSound(Context context, int id)
        {

// Creates an instance of the mediaplayer using the passed mp3 file

            mp = MediaPlayer.create(context, id);

        }

// When this method is called, the sound is played in a loop until the stopsound method is called

        public void startsound()


        {
            mp.start();
            mp.setLooping(true);

            if(frameAnimation.isRunning())
            {
                asound.startsound();
            }else
            {
                asound.stopsound();
            }
        }

// When this method is called , the playing of the sound is stopped

        public void stopsound()
        {
            if (mp != null) {
                if (mp.isPlaying())
                {
                    mp.stop();
                    mp.setLooping(false);
                }

//Finally release everything and clear out the mediaplayer object

                mp.release();
                mp = null;
            }

        }
    }

*/
