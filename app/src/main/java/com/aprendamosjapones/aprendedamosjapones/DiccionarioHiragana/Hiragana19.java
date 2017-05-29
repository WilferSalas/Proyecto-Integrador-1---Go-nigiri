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

public class Hiragana19 extends AppCompatActivity {
    MediaPlayer audioHiragana019;
    Button audioHiragana19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiragana19);

        audioHiragana019 = MediaPlayer.create(this, R.raw.aud19te);

        audioHiragana19 = (Button)findViewById(R.id.audioHiragana19);
        audioHiragana19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioHiragana019.start();

            }
        });
    }
}