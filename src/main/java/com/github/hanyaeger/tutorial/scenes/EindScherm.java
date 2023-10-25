package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.GameApp;
import com.github.hanyaeger.tutorial.entities.buttons.ExitKnop;
import com.github.hanyaeger.tutorial.entities.buttons.StartKnop;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EindScherm extends StaticScene implements MouseButtonPressedListener {
    private GameApp gameApp;

    public EindScherm(GameApp gameApp) {
        this.gameApp = gameApp;
    }


    @Override
    public void setupScene(){
        setBackgroundImage("backgrounds/backgroundpauze.jpg");
    }

    @Override
    public void setupEntities() {
    var PlayAgain = new StartKnop(new Coordinate2D(getWidth() / 2, getHeight() / 2),gameApp);

    var Exit = new ExitKnop(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100));

    PlayAgain.setAnchorPoint(AnchorPoint.CENTER_CENTER);
    PlayAgain.setFill(Color.DARKBLUE);
    PlayAgain.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
    addEntity(PlayAgain);

        Exit.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        Exit.setFill(Color.DARKBLUE);
        Exit.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
    addEntity(Exit);
}

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {

    }
}
