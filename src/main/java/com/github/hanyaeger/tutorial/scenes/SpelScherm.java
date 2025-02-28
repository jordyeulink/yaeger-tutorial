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
import com.github.hanyaeger.tutorial.entities.karakters.Tegenstander;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.timers.TegenstanderTimer;
import javafx.scene.input.MouseButton;

import java.util.ArrayList;
import java.util.Random;



public class SpelScherm extends DynamicScene implements MouseButtonPressedListener,TimerContainer{
    private TegenstanderTimer timer;

    ArrayList <Tegenstander> lijst = new ArrayList<Tegenstander>();
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
        timer = new TegenstanderTimer(1000, tank, speeder, this);
        lijst.add(tank);
        lijst.add(speeder);

        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            meteoriet = new Meteorieten(500 * rand.nextDouble(),500 * rand.nextDouble());
            addEntity(meteoriet);
        }
        for(Tegenstander tegenstander: lijst){
            addEntity(tegenstander);
        }

        addEntity(speler);
        addEntity(Levens);
    }

    public void entityToevoegen(YaegerEntity entity) {
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

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        speler.schiet(this);
    }
}
