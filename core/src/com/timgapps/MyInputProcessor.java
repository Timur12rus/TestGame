package com.timgapps;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;

public class MyInputProcessor implements InputProcessor {
    private boolean isAim;
    private Vector2 mousePosition;
    private Vector2 startPosition;
    private Vector2 endPosition;

    InputProcessor inputProcessor;

    public MyInputProcessor(Screen screen) {
        mousePosition = new Vector2();
        startPosition = new Vector2();
        endPosition = new Vector2();

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        startPosition.set(screenX, screenY);
        System.out.println("TouchDown");
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        mousePosition.set(screenX, screenY);
        System.out.println("Position = (" + mousePosition.x + ", " + mousePosition.y + ")");
        getAngleBetweenTwoPoints(startPosition, mousePosition);
        System.out.println("TouchDragged");
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }

    public float getAngleBetweenTwoPoints(Vector2 startPosition, Vector2 currentPosition) {
        Vector2 centerPoint = startPosition.cpy().add(0, 128);
        Vector2 currentVector = new Vector2(currentPosition.sub(centerPoint));
        float angleBetweenTwoPoints = currentVector.angleDeg();
        System.out.println("Angle between two points = " + angleBetweenTwoPoints);
        return angleBetweenTwoPoints;
    }
}
