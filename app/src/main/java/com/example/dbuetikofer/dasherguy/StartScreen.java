package com.example.dbuetikofer.dasherguy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/*
Der Bildschirm auf dem die App startet
 */
public class StartScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void screenTapped(View view) {
        Intent i = new Intent(StartScreen.this, SelectScreen.class);
        startActivity(i);
    }

}
