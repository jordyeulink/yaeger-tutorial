package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class Wapens extends DynamicSpriteEntity implements SceneBorderCrossingWatcher {
    public Wapens( Coordinate2D initialLocation) {
        super("sprites/laser.png", initialLocation, new Size(70,50));
        setMotion(3,90);
    }


    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        remove();
    }
}
