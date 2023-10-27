package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.TimerContainer;
import com.github.hanyaeger.api.entities.YaegerEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.Meteorieten;
import com.github.hanyaeger.tutorial.entities.karakters.Speeder;
import com.github.hanyaeger.tutorial.entities.karakters.Speler;
import com.github.hanyaeger.tutorial.entities.karakters.Tank;
import com.github.hanyaeger.tutorial.entities.kogels.Laser;
import com.github.hanyaeger.tutorial.entities.kogels.Raket;
import com.github.hanyaeger.tutorial.entities.kogels.Schot;
import com.github.hanyaeger.tutorial.entities.kogels.Wapen;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.timers.Timer;
import javafx.scene.input.MouseButton;

import java.util.Random;


public class SpelScherm extends DynamicScene implements MouseButtonPressedListener, TimerContainer{
    private Timer timer;

    private GameApp gameApp;
    private HealthText Levens = new HealthText(new Coordinate2D(200,10));
    private Tank tank;
    private Speler speler;

    private Meteorieten meteoriet;

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
        tank = new Tank(new Coordinate2D(getWidth()-100, 100), new Size(50,50), this);
        speeder = new Speeder(new Coordinate2D(getWidth()-100, 100), new Size(50,50), this);
        timer = new Timer(1000, tank, speeder, this);

        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            meteoriet = new Meteorieten(500 * rand.nextDouble(),500 * rand.nextDouble());
            addEntity(meteoriet);
        }

        addEntity(speler);
        addEntity(Levens);
        addEntity(tank);
        addEntity(speeder);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        Wapen kogel = new Laser(speler.getAnchorLocation());

        addEntity(kogel);
    }

    public void entityToevoegen(YaegerEntity entity){
        addEntity(entity);
    }
    public void respawner(){
        if(!speeder.isLevend()) {
            speeder = new Speeder(new Coordinate2D(getWidth() - 100, 100), new Size(50, 50),this );
            addEntity(speeder);
            timer.setSpeeder(speeder);
        }
        if (!tank.isLevend()) {
            tank = new Tank(new Coordinate2D(getWidth()-100, 100), new Size(50,50),this);
            addEntity(tank);
            timer.setTank(tank);
        }
    }
    @Override
    public void setupTimers() {
        addTimer(timer);
    }

}
