package com.example.dbuetikofer.dasherguy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);

    }

    public void levelStart(View view){
        Intent start = new Intent(SelectScreen.this, Game.class);
        startActivity(start);
    }

    public void optionsOpen(View view){
        Intent intent = new Intent(SelectScreen.this, Options.class);
        startActivity(intent);

    }
}
