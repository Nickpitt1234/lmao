package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button butao,b_cachorro,b_estrela,b_reptil,b_metamorfo;
    public static int bill = Activity2.bill;
    public static int raluca = Activity2.raluca;
    public static int ryan = Activity2.ryan;
    public static int jimin = Activity2.jimin;



    public static int bill1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        butao = findViewById(R.id.confirma_tres);
        final MediaPlayer vine = MediaPlayer.create(this,R.raw.vine);
        final MediaPlayer baraka= MediaPlayer.create(this,R.raw.baraka);
        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vine.start();
                baraka.stop();
                proxActivity();

            }
        });
        b_cachorro= findViewById(R.id.b_cachorro_quente);

        b_cachorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill=bill+2;
                ryan=ryan+2;
                raluca++;
            }
        });
        b_estrela= findViewById(R.id.b_estrela);

        b_estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill++;
                ryan=ryan+2;
                jimin=jimin+3;
            }
        });
        b_reptil=findViewById(R.id.b_reptil);
        b_reptil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ryan++;
                raluca=raluca+3;
            }
        });
        b_metamorfo=findViewById(R.id.b_metamorfo);
        b_metamorfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bill++;
                raluca=raluca+2;
                jimin=jimin+2;
            }
        });
    }


    public void proxActivity() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
}
