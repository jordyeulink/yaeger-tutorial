package com.github.hanyaeger.tutorial.entities.karakters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.kogels.Laser;
import com.github.hanyaeger.tutorial.entities.kogels.Raket;
import com.github.hanyaeger.tutorial.entities.kogels.Wapen;
import com.github.hanyaeger.tutorial.scenes.SpelScherm;



public class Tank extends Tegenstander {
    private SpelScherm spel;
    public Tank(Coordinate2D initialLocation, Size size, SpelScherm spel) {
        super("sprites/tank.png", initialLocation, size);
        this.spel = spel;
        setMotion(3,0d);
        setGravityConstant(0);
        setFrictionConstant(0);
    }


    @Override
    public void notifyBoundaryTouching(SceneBorder sceneBorder) {
    beweeg(sceneBorder);
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof Laser){
            levend = false;
            remove();
        }

    }

    @Override
    public void beweeg(SceneBorder sceneBorder) {
        if(sceneBorder == SceneBorder.TOP){
            setMotion(3,0d);
        } else {
            setMotion(3, 180d);
        }
    }

    @Override
    public void schiet() {
        Wapen raket = new Raket(getAnchorLocation());
        if(isLevend()) {
            spel.entityToevoegen(raket);
        }
    }
}
