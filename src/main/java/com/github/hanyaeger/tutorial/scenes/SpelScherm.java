package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.enemy.Swordfish;
import com.github.hanyaeger.tutorial.entities.karakters.Speler;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class SpelScherm extends DynamicScene {

    private GameApp gameApp;
    private HealthText Levens = new HealthText(new Coordinate2D(200,10));
    private Swordfish S;
    private Speler speler;

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
        //S = new Swordfish(new Coordinate2D(100,100));
        //addEntity(S);
        addEntity(speler);
        addEntity(Levens);
    }
}
