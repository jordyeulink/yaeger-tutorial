package com.github.hanyaeger.tutorial.timers;
import com.github.hanyaeger.tutorial.entities.karakters.Tank;
import com.github.hanyaeger.tutorial.entities.karakters.Speeder;
import com.github.hanyaeger.tutorial.scenes.SpelScherm;

public class TegenstanderTimer extends com.github.hanyaeger.api.Timer {

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void setSpeeder(Speeder speeder) {
        this.speeder = speeder;
    }

    private Tank tank;
    private Speeder speeder;
    private SpelScherm spel;


    public TegenstanderTimer(long intervalInMs, Tank tank, Speeder speeder, SpelScherm spel) {
        super(intervalInMs);
        this.tank = tank;
        this.speeder = speeder;
        this.spel = spel;
    }

    @Override
    public void onAnimationUpdate(long l) {
        tank.schiet();
        speeder.schiet();
        spel.respawner();
    }
}
