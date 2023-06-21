package com.timgapps.actors;

import com.badlogic.gdx.math.Vector2;

public class Ball extends GameActor {

    private DirectionArrow directionArrow;

    public float getDirectionArrowAngle() {
        return directionArrowAngle;
    }

    public void setDirectionArrowAngle(float directionArrowAngle) {
        this.directionArrowAngle = directionArrowAngle;
    }

    private float directionArrowAngle;

    public Ball(DirectionArrow directionArrow) {
        super("ball");
        setOrigin(getWidth() / 2, getHeight() / 2);
        this.directionArrow = directionArrow;


    }

    public Vector2 getCenterPosition() {
        return new Vector2(getX() + getWidth() / 2, getY() + getHeight() / 2);
    }

    // рассчитаем угол отклонения второго шара после удара(по которому бьет первый)
    public float generateDirectionArrowAngle(Vector2 otherBallPosition) {
        Vector2 centerPositionOtherBall = new Vector2(otherBallPosition.x + getWidth() / 2, otherBallPosition.y + getHeight() / 2);
        Vector2 centerPosition = new Vector2(getX() + getWidth() / 2, getY() + getHeight() / 2);  // позиция центра шара по х и у

        Vector2 vector2 = new Vector2(centerPosition.sub(centerPositionOtherBall));
//        Vector2 vector2 = new Vector2(centerPositionOtherBall.sub(centerPosition));


        System.out.println(directionArrowAngle);

        return vector2.angleDeg() - 90;
//        return directionArrowAngle = vector2.angleDeg() - 90;
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
