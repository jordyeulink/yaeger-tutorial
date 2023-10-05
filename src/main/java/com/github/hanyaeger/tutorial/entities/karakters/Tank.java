package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Tank extends Tegenstanders{
    Coordinate2D initialLocation;
    public Tank(Coordinate2D initialLocation, Size size) {
        super("sprites/tank.png", initialLocation, size);
        this.initialLocation = initialLocation;
        setMotion(3,0d);
        setGravityConstant(0);
        setFrictionConstant(0);
    }

    @Override
    public void onCollision(Collider collider) {

    }

    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
        //(initialLocation.getY()<=getSceneHeight()) && (initialLocation.getY()<= 0)
        System.out.println("test");
        if(sceneBorder == SceneBorder.TOP){
            setMotion(3,0d);
            System.out.println("siuu");
        } else {
                setMotion(3, 180d);
        }
    }
}
