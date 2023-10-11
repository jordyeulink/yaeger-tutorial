package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public abstract class Tegenstanders extends DynamicSpriteEntity implements Collided, Newtonian, SceneBorderTouchingWatcher {
    protected Tegenstanders(String resource, Coordinate2D initialLocation, Size size) {
        super(resource, initialLocation, size);
    }
}
