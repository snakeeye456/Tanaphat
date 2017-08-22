package com.example.khongbang.santisuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game2 extends AppCompatActivity {

    public void gotomaingame(View view){
        Intent intent = new Intent(this, Maingame.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }
}
