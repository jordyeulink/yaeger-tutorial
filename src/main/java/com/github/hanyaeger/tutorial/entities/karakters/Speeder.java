package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Speeder extends Tegenstanders{
    protected Speeder(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }

    @Override
    public void onCollision(Collider collider) {

    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }
}
