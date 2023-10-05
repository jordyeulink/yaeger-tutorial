package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Speeder extends Tegenstanders{
    protected Speeder( Coordinate2D initialLocation, Size size) {
        super("", initialLocation, size);
        //setMotion(3,0d);
        setGravityConstant(0);
        setFrictionConstant(0);
    }



    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {

    }
}
