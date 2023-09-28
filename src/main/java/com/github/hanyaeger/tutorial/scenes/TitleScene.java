package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.scenes.StaticScene;

public class TitleScene extends StaticScene {
    @Override
    public void setupScene(){
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {

    }
}
