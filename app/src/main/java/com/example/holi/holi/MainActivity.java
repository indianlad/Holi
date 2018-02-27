package com.example.holi.holi;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song=MediaPlayer.create(MainActivity.this,R.raw.balampich);
    }
    public void play(View view){
        song.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
    }
}
