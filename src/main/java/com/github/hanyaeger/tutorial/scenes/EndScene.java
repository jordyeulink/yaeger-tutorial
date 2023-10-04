package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.WaterWorld;
import com.github.hanyaeger.tutorial.entities.buttons.ExitButton;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class EndScene extends StaticScene implements MouseButtonPressedListener {
    private WaterWorld waterWorld;

    public EndScene(WaterWorld waterWorld) {
        this.waterWorld = waterWorld;
    }


    @Override
    public void setupScene(){
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
    var PlayAgain = new StartButton(new Coordinate2D(getWidth() / 2, getHeight() / 2),waterWorld);

    var Exit = new ExitButton(new Coordinate2D(getWidth() / 2, getHeight() / 2 + 100));

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
