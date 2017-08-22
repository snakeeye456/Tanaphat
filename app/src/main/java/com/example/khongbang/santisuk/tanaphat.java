package com.example.khongbang.santisuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class tanaphat extends AppCompatActivity {

    public void gotoRegister(View view){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void gotoLogin(View view){
        Intent intent = new Intent(this, Maingame.class);
        startActivity(intent);
    }

    public void gotoContact(View view){
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santisuk);
    }
}
