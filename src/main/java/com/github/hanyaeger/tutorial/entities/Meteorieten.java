package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.tutorial.entities.kogels.Laser;

public class Meteorieten extends DynamicSpriteEntity implements Collided {
    public Meteorieten(double x, double y) {
        super("sprites/meteoriet.png", new Coordinate2D(x, y), new Size(50));
    }


    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Laser){
            remove();
        }
    }
}
