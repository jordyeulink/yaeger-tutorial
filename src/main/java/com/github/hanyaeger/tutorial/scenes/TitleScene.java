package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.WaterWorld;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene implements MouseButtonPressedListener {

    private WaterWorld waterworld;

    public TitleScene(WaterWorld waterworld){
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene(){
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities(){
        var waterworldText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 2),"Waterworld");

        var startButton = new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 +100),waterworld);

        waterworldText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        waterworldText.setFill(Color.DARKBLUE);
        waterworldText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(waterworldText);

        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        startButton.setFill(Color.DARKBLUE);
        startButton.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(startButton);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
