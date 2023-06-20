package com.timgapps.actors;

import com.badlogic.gdx.math.Vector2;

public class DirectionArrow extends GameActor {

    public DirectionArrow() {
        super("arrow");
        setOrigin(getWidth() / 2, 0);
        System.out.println("Arrow originX =" + getOriginX());
    }
}
