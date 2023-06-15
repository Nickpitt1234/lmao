/*package com.example.lmao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class primeiro extends AppCompatActivity {
    private Button butao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butao= findViewById(R.id.comecar);

        butao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finalActivity();
            }
        });
    }
    public void finalActivity(){
        Intent intent = new Intent(this,ActivityFinal.class);
        startActivity(intent);
    }
}*/