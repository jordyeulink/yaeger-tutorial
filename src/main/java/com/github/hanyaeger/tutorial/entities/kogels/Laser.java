package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;


public class Laser extends Wapen {
    public Laser(Coordinate2D initialLocation) {
        super(initialLocation,"sprites/laser.png");
        setMotion(3,90);
    }

}
