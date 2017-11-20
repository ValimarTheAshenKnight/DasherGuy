package com.example.dbuetikofer.dasherguy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
Das ist die Klasse für den Auswahlbildschirm meiner App.
Hier kann man momentan Optionen und Level Starten auswählen.
 */
public class SelectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);

    }

    /*
    In dieser Methode wird die Game activity gestartet
     */
    public void levelStart(View view){
        Intent start = new Intent(SelectScreen.this, Game.class);
        startActivity(start);
    }

    /*
    In dieser Methode wird die Options activity gestartet
     */
    public void optionsOpen(View view){
        Intent intent = new Intent(SelectScreen.this, Options.class);
        startActivity(intent);

    }
}
