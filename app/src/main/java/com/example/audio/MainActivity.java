package com.example.audio;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,stop,pause;
    MediaPlayer mediaPlayer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.start);
        pause=findViewById(R.id.id_pause);
        stop=findViewById(R.id.stop);
        mediaPlayer=MediaPlayer.create(this,R.raw.hukum);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {mediaPlayer.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });
    }
}