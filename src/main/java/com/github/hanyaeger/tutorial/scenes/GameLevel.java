package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.WaterWorld;
import com.github.hanyaeger.tutorial.entities.enemy.Hanny;
import com.github.hanyaeger.tutorial.entities.enemy.Swordfish;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class GameLevel extends DynamicScene {

    private WaterWorld waterWorld;
    private HealthText T = new HealthText(new Coordinate2D(200,10));
    private Swordfish S;
    private Hanny H;

    public GameLevel(WaterWorld waterWorld) {
        this.waterWorld = waterWorld;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        H = new Hanny(new Coordinate2D(100,300), T, waterWorld);
        S = new Swordfish(new Coordinate2D(100,100));
        addEntity(S);
        addEntity(H);
        addEntity(T);
    }
}
