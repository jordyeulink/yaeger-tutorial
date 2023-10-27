package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public abstract class Tegenstander extends DynamicSpriteEntity implements Collided, Newtonian, SceneBorderTouchingWatcher {
    protected boolean levend;
    protected Tegenstander(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
        levend = true;
    }

    public abstract void beweeg(SceneBorder sceneBorder);

    public boolean isLevend() {
        return levend;
    }
}
