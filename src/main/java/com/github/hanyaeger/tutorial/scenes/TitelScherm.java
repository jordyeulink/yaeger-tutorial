package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.buttons.StartKnop;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitelScherm extends StaticScene implements MouseButtonPressedListener {

    private GameApp gameApp;

    public TitelScherm(GameApp gameApp){
        this.gameApp = gameApp;
    }

    @Override
    public void setupScene(){
        setBackgroundImage("backgrounds/backgroundspel.jpg");
    }

    @Override
    public void setupEntities(){
        var TitelText = new TextEntity(new Coordinate2D(getWidth() / 2, getHeight() / 2),"Star Shooter");

        var startButton = new StartKnop(new Coordinate2D(getWidth() / 2, getHeight() / 2 +100),gameApp);

        TitelText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        TitelText.setFill(Color.ORANGE);
        TitelText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(TitelText);

        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        startButton.setFill(Color.ORANGE);
        startButton.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(startButton);
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
