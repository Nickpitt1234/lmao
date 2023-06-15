package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button butao,butao_joker,butao_harley,butao_bill,butao_ryan;
    public static int ryan,raluca,bill,jimin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        butao = findViewById(R.id.confirma_dois);
        final MediaPlayer vine = MediaPlayer.create(this,R.raw.vine);
        final MediaPlayer nightcall= MediaPlayer.create(this,R.raw.nightcal);
        final MediaPlayer baraka= MediaPlayer.create(this,R.raw.baraka);


        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proxActivity();
                vine.start();
                baraka.start();
                nightcall.stop();


            }
        });
        butao_joker = findViewById(R.id.b_joker);

        butao_joker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ryan=ryan+2;
                raluca++;
            }
        });
        butao_harley = findViewById(R.id.b_harley);

        butao_harley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                raluca=raluca+2;
                jimin++;
                ryan++;
            }
        });
        butao_bill =findViewById(R.id.b_bill);
        butao_bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2){
                bill=bill+3;
            }
        });
        butao_ryan= findViewById(R.id.b_ryan);
        butao_ryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3){
                ryan=ryan+3;
                raluca++;
            }
        });
    }
    public void proxActivity() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}