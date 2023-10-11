package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;

public class Schot extends Wapens{
    public Schot(Coordinate2D initialLocation) {
        super(initialLocation, "sprites/enemylaser.png");
        setMotion(2,270);
    }
}
