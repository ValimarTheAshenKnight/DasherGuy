package com.example.dbuetikofer.dasherguy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by admin on 14.11.2017.
 */



public class Game extends AppCompatActivity implements View.OnTouchListener {


   /* BitmapFactory.Options options = new BitmapFactory.Options();
    options.inScaled = false;
    options.inMutable = true;

    Bitmap platformbg = BitmapFactory.decodeResource(getResources(), R.drawable.grass1);
    Canvas canvas = new Canvas(platformbg);
    ImageView v = (ImageView) findViewById(R.id.imageView);*/

    private boolean running;

    private boolean paused;

    private List<Gameobject> gameobjects;

    private GestureDetector swipeDetector;

    public Game() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game); //Setzt die xml Datei activity_game als content welcher angezeigt wird.
        //setContentView(new GameView(this));
    }

    public Game(Context context) {
                swipeDetector = new GestureDetector(context, new swipeListener());
            }

        public void onSwipeUp () {
            System.out.println("Hello!");
        }

        public void onSwipeDown () {
            System.out.println("Hello!");
        }

        @Override
        public boolean onTouch (View v, MotionEvent event){
            return false;
        }

        /*
        * Das hier sollte es erlauben mit einem strich nach oben etwas auszuführen.
        * Aber momentan habe ich noch nichts implementiert was davon Gebrauch machen könnte.
        */
        private final class swipeListener extends GestureDetector.SimpleOnGestureListener {

            private static final int swipe_distance_threshold = 100;
            private static final int swipe_velocity_threshold = 100;

            @Override
            public boolean onDown(MotionEvent e) {
                return true;
            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float VelocityX, float VelocityY) {
                float distanceX = e2.getX() - e1.getX();
                float distanceY = e2.getY() - e1.getY();
                if (Math.abs(distanceY) > Math.abs(distanceX) && Math.abs(distanceY) > swipe_distance_threshold && Math.abs(VelocityY) > swipe_velocity_threshold){
                    if(distanceY > 0)
                        onSwipeUp();
                    else
                        onSwipeDown();
                        return true;
                }
                return false;
            }


        }

        public void run(){

        }

        public void pause(){

        }

        public void update(){

        }
}

