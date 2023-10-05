package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.enemy.Swordfish;
import com.github.hanyaeger.tutorial.entities.karakters.Speeder;
import com.github.hanyaeger.tutorial.entities.karakters.Speler;
import com.github.hanyaeger.tutorial.entities.karakters.Tank;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class SpelScherm extends DynamicScene {

    private GameApp gameApp;
    private HealthText Levens = new HealthText(new Coordinate2D(200,10));
    private Tank tank;
    private Speler speler;

    private Speeder speeder;

    public SpelScherm(GameApp gameApp) {
        this.gameApp = gameApp;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/backgroundspelscherm.jpg");
    }

    @Override
    public void setupEntities() {
        speler = new Speler(new Coordinate2D(100,300), Levens, gameApp);
        tank = new Tank(new Coordinate2D(getWidth()-100, 100), new Size(50,50));
        speeder = new Speeder(new Coordinate2D(getWidth()-100, 100), new Size(50,50));
        addEntity(speler);
        addEntity(Levens);
        addEntity(tank);
        addEntity(speeder);
    }
}
