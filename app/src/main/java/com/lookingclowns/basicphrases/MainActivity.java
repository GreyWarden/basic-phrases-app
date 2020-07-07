package com.lookingclowns.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(View view) {
        play(view.getTag().toString());
    }

    public void play(String soundName) {
        MediaPlayer.create(
                this,
                getResources()
                        .getIdentifier(
                                soundName,
                                "raw",
                                getPackageName()
                        )
        ).start();
    }
}