package com.lookingclowns.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int[] SOUND_IDS = {
            R.raw.doyouspeakenglish,
            R.raw.goodevening,
            R.raw.hello,
            R.raw.howareyou,
            R.raw.ilivein,
            R.raw.mynameis,
            R.raw.please,
            R.raw.welcome
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(View view) {
        int sound = Integer.parseInt(view.getTag().toString());
        play(sound);
    }

    public void play(int sound) {
        MediaPlayer.create(this, SOUND_IDS[sound]).start();
    }
}