package com.timgapps.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.timgapps.TestGame;
import com.timgapps.actors.DirectionArrow;
import com.timgapps.actors.Ball;

public class PlayScene implements Screen {

    private TestGame testGame;
    private Stage stage;

    private Ball ball1;
    private Ball ball2;

    private DirectionArrow directionArrowOne;
    private DirectionArrow directionArrowTwo;

    public PlayScene(TestGame testGame) {
        this.testGame = testGame;
        stage = new Stage();

        directionArrowOne = new DirectionArrow();

        directionArrowTwo = new DirectionArrow();

        ball1 = new Ball(directionArrowOne);
        ball2 = new Ball(directionArrowTwo);

        ball1.setPosition(320, 100);
        ball2.setPosition(300, 400);


        stage.addActor(ball1);
        stage.addActor(ball2);
        stage.addActor(directionArrowOne);
        stage.addActor(directionArrowTwo);

        System.out.println("Position ball1 x= " + ball1.getX() + " y = " + ball1.getY());

    }


    @Override
    public void show() {
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
