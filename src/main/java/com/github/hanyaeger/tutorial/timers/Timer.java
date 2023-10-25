package com.github.hanyaeger.tutorial.timers;
import com.github.hanyaeger.tutorial.scenes.SpelScherm;

public class Timer extends com.github.hanyaeger.api.Timer {

    private SpelScherm spel;


    public Timer(long intervalInMs, SpelScherm spel) {
        super(intervalInMs);
        this.spel = spel;
    }

    @Override
    public void onAnimationUpdate(long l) {
        spel.handelInteractieAf();
    }
}
