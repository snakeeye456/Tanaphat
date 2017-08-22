package com.example.khongbang.santisuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Maingame extends AppCompatActivity {

    public void gotomain(View view){
        Intent intent = new Intent(this, Santisuk.class);
        startActivity(intent);
    }

    public void gotogame1(View view){
        Intent intent = new Intent(this, Game1.class);
        startActivity(intent);
    }

    public void gotoGame2(View view){
        Intent intent = new Intent(this, Game2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);
    }
}
