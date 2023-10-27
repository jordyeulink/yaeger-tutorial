package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;

public class Raket extends Wapen {
    public Raket(Coordinate2D initialLocation) {
        super(initialLocation, "sprites/raket.png");
        setMotion(6,270);
    }
}
