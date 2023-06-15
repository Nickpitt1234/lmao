package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity {
    private Button butao2;
    private Button butao,b_twice,b_carlos,b_xg,b_twopac;
    public static int bill = Activity3.bill;
    public static int raluca = Activity3.raluca;
    public static int ryan = Activity3.ryan;
    public static int jimin = Activity3.jimin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        final MediaPlayer vine = MediaPlayer.create(this,R.raw.vine);

        butao = findViewById(R.id.b_confirmar);
        final MediaPlayer kyoto= MediaPlayer.create(this,R.raw.kyoto);

        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vine.start();
                kyoto.start();
                finalActivity();

            }
        });
        butao2= findViewById(R.id.listen);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.genz);


        butao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        b_twice = findViewById(R.id.b_twice);
        b_twice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jimin=jimin+3;
                raluca=raluca+2;
            }
        });
        b_carlos= findViewById(R.id.b_carlos);
        b_carlos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ryan=ryan+3;
                bill++;
            }
        });
        b_xg= findViewById(R.id.b_xg);
        b_xg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill=bill+3;
                jimin=jimin+3;
            }
        });
        b_twopac= findViewById(R.id.b_twopac);
        b_twopac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill=bill+3;
                ryan=ryan+2;
            }
        });
        }
    public void finalActivity(){
        Intent intent = new Intent(this,ActivityFinal.class);
        startActivity(intent);
    }
}