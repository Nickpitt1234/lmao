package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityFinal extends AppCompatActivity {
    private Button butao,butao1;
    private ImageView ttwice,ryan_blade_photo,jimin_photo,raluca_photo,bill_photo;
    private int max;
    public static int bill = Activity4.bill;
    public static int raluca = Activity4.raluca;
    public static int ryan = Activity4.ryan;
    public static int jimin = Activity4.jimin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        int max= Math.max(Math.max(bill,ryan),Math.max(raluca,jimin));
        butao = findViewById(R.id.mamae);
        final MediaPlayer vine = MediaPlayer.create(this,R.raw.vine);

        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                zap();
            }
        });
        raluca_photo= findViewById(R.id.raluca);
        ryan_blade_photo= findViewById(R.id.ryan_blade);
        jimin_photo= findViewById(R.id.jimin);
        bill_photo= findViewById(R.id.bill_murray);

        if (bill==max){
            bill_photo.setVisibility(View.VISIBLE);
        }
        if (ryan==max){
            ryan_blade_photo.setVisibility(View.VISIBLE);
        }
        if (jimin==max){
            jimin_photo.setVisibility(View.VISIBLE);
        }
        if (raluca==max){
            raluca_photo.setVisibility(View.VISIBLE);
        }
        butao1 = findViewById(R.id.saiba);

        butao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vine.start();
                finalActivity();
            }
        });
    }
    public void zap() {
        Uri number = Uri.parse("tel:1111");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
    public void finalActivity(){
        Intent intent = new Intent(this,lastActivity.class);
        startActivity(intent);
    }
}
