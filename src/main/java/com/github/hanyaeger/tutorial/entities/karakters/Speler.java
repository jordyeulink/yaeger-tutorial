package com.github.hanyaeger.tutorial.entities.karakters;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.kogels.Laser;
import com.github.hanyaeger.tutorial.entities.kogels.Raket;
import com.github.hanyaeger.tutorial.entities.kogels.Schot;
import com.github.hanyaeger.tutorial.entities.kogels.Wapen;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.scenes.SpelScherm;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Speler extends DynamicSpriteEntity implements KeyListener, SceneBorderTouchingWatcher, Collided, Newtonian {
    HealthText healthText;
    GameApp gameApp;
    private int levens = 10;

    public Speler(Coordinate2D location, HealthText healthText, GameApp gameApp) {
        super("sprites/speler.png", location, new Size(50));
        this.healthText = healthText;
        this.gameApp = gameApp;


        setGravityConstant(0);
        setFrictionConstant(0.02);
        healthText.setHealthText(levens);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        setSpeed(0);

        switch (border) {
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
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.LEFT)) {
            setMotion(3, 270d);
        } else if (pressedKeys.contains(KeyCode.RIGHT)) {
            setMotion(3, 90d);
        } else if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3, 180d);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3, 0d);
        }
    }

    @Override
    public void onCollision(Collider collider) {
        if (collider instanceof Raket || collider instanceof Schot) {
            levens--;
            healthText.setHealthText(levens);
            if(levens == 0){
                remove();
                gameApp.setActiveScene(2);
            }
        }
    }

    public void schiet(SpelScherm spel){
        Wapen kogel = new Laser(getAnchorLocation());
        spel.entityToevoegen(kogel);
    }
}
