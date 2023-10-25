package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;

public abstract class Knoppen extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    public Knoppen(Coordinate2D initialLocation, String text) {
        super(initialLocation, text);
    }

    public abstract void doeKnopActie();
}
