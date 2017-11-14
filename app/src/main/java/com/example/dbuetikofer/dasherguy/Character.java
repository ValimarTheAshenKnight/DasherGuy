package com.example.dbuetikofer.dasherguy;

/**
 * Created by d.buetikofer on 10.11.2017.
 */

public class Character extends Gameobject implements Moveable {

    private boolean dead;
    private int health;
    private int speed;

    public Character(){
        boolean dead = false;
        int health = 100;
    }
}
