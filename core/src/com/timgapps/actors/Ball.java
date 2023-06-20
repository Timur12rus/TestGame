package com.timgapps.actors;

import com.badlogic.gdx.math.Vector2;

public class Ball extends GameActor {

    private DirectionArrow directionArrow;

    private float directionArrowAngle;

    public Ball(DirectionArrow directionArrow) {
        super("ball");
        setOrigin(getWidth() / 2, getHeight() / 2);
        this.directionArrow = directionArrow;


    }

    public void generateDirectionArrowAngle(Vector2 otherBallPosition) {

    }

    public void updateDirectionArrowPosition() {
        directionArrow.setPosition(getX() + getWidth() / 2 - directionArrow.getWidth() / 2,
                getY() + getHeight() / 2);
        directionArrow.setRotation(directionArrowAngle);
    }

    public DirectionArrow getDirectionArrow() {
        return directionArrow;
    }

    public void setDirectionArrow(DirectionArrow directionArrow) {
        this.directionArrow = directionArrow;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        updateDirectionArrowPosition();
    }
}
