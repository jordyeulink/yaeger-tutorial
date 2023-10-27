package com.github.hanyaeger.tutorial.entities.kogels;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Wapen extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, Collider {
    public Wapen(Coordinate2D initialLocation, String resource) {
        super(resource, initialLocation, new Size(50,70));

    }


    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {
        remove();
    }
}
