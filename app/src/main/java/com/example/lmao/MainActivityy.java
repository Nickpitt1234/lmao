package com.example.lmao;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivityy extends AppCompatActivity{
        private Button butao,Switch;
        private Fragment creditos;
        public static int value=1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.hotline);
                mediaPlayer.start();
                final MediaPlayer nightcall= MediaPlayer.create(this,R.raw.nightcal);



                butao = findViewById(R.id.comecar);
                final MediaPlayer vine = MediaPlayer.create(this,R.raw.vine);

                butao.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                openActivity2();
                                vine.start();
                                mediaPlayer.stop();
                        }
                });

        }
        public void openActivity2(){
                Intent intent = new Intent(this, Activity2.class);
                startActivity(intent);
        }
}

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context
/*public class MainActivityy extends AppCompatActivity{
        private Button butao;
       @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activityy_main);
                butao = findViewById(R.id.calculate_button);
                final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.money);

                butao.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                //mediaPlayer.start();
                                //
                                openActivity2();
                                //zap();
                        }
                });
        }
        public void openActivity2(){
                Intent intent = new Intent(this,Activity4.class);
                startActivity(intent);
        }
        public void zap(){
                /*Intent sendIntent = new Intent(Intent.ACTION_SEND);
                String title = getResources().getString(R.string.calculate);
                Intent chooser = Intent.createChooser(sendIntent,title);
                if(sendIntent.resolveActivity(getPackageManager()) != null){
                        startActivity(chooser);
                }
                Uri number = Uri.parse("tel:1111");
                Intent callIntent = new Intent(Intent.ACTION_DIAL,number);
                startActivity(callIntent);
        }
}*/
