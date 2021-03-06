package com.example.alannahcooke.callofthewild;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

/**
 * Created by alannahcooke on 17/08/16.
 */
public class pop_snake extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_snake);

        final MediaPlayer snakeSound = MediaPlayer.create(this, R.raw.snake);

        Button playSnakeHiss = (Button) this.findViewById(R.id.audioSnake);

        playSnakeHiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snakeSound.start();
            }
        });

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));


    }
}
