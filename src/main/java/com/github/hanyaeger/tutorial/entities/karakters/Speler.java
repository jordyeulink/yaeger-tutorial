package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;

import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;

import java.util.Optional;
import java.util.Set;

public class Speler extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Collided {
    HealthText healthText;
    GameApp gameApp;
    private int levens = 10;
    public Speler(Coordinate2D location,  HealthText healthText, GameApp gameApp) {
        super("", location);
        this.healthText = healthText;
        this.gameApp = gameApp;
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border){
        setSpeed(0);

        switch(border){
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
                break;
            case LEFT:
                setAnchorLocationX(1);
                break;
            case RIGHT:
                setAnchorLocationX(getSceneWidth() - getWidth() - 1);
            default:
                break;
        }
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys){
        if(pressedKeys.contains(KeyCode.LEFT)){
            setMotion(3,270d);
        } else if(pressedKeys.contains(KeyCode.RIGHT)){
            setMotion(3,90d);
        } else if(pressedKeys.contains(KeyCode.UP)){
            setMotion(3,180d);
        } else if(pressedKeys.contains(KeyCode.DOWN)){
            setMotion(3,0d);
        }
    }

    @Override
    public void onCollision(Collider collider) {

    }
}
