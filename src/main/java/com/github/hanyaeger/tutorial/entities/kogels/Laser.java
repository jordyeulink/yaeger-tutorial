package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;

public class Laser extends Wapens{
    public Laser(Coordinate2D initialLocation, String resource, double direction) {
        super(initialLocation, resource);
        setMotion(3,direction);
    }
}
