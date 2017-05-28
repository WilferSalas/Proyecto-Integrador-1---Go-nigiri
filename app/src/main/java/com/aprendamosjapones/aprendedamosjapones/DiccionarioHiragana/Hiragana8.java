package com.aprendamosjapones.aprendedamosjapones.DiccionarioHiragana;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.aprendamosjapones.aprendedamosjapones.R;

/**
 * Created by wilfer on 27/05/17.
 */

public class Hiragana8 extends AppCompatActivity {
    MediaPlayer audioHiragana08;
    Button audioHiragana8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana8);

        audioHiragana08 = MediaPlayer.create(this, R.raw.aud8ku);

        audioHiragana8 = (Button)findViewById(R.id.audioHiragana8);
        audioHiragana8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana08.start();

            }
        });
    }
}
