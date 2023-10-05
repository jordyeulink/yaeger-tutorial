package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Random;

public class Speeder extends Tegenstanders implements SceneBorderCrossingWatcher {
    public Speeder(Coordinate2D initialLocation, Size size) {
        super("sprites/speeder.png", initialLocation, size);
        setMotion(7,345d);
        setGravityConstant(0);
        setFrictionConstant(0);
    }



    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        if(sceneBorder == SceneBorder.TOP){
            setMotion(7,345d);
        } else if(sceneBorder == SceneBorder.BOTTOM){
            setMotion(7, 195d);
        }
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        if(sceneBorder == SceneBorder.LEFT){
            setAnchorLocation(new Coordinate2D(
                    getSceneWidth() + 100,
                    new Random().nextInt((int)(getSceneHeight()-getHeight())))
            );
        }
    }
}
