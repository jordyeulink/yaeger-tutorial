package com.github.hanyaeger.tutorial.timers;
import com.github.hanyaeger.tutorial.scenes.SpelScherm;

public class TegenstanderTimer extends com.github.hanyaeger.api.Timer {

    private SpelScherm spel;


    public TegenstanderTimer(long intervalInMs, SpelScherm spel) {
        super(intervalInMs);
        this.spel = spel;
    }

    @Override
    public void onAnimationUpdate(long l) {
        spel.handelInteractieAf();
    }
}
