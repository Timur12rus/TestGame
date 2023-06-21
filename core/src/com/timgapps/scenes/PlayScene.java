package com.timgapps.scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.timgapps.MyInputProcessor;
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

    private MyInputProcessor myInputProcessor;

    public PlayScene(TestGame testGame) {
        this.testGame = testGame;
        stage = new Stage();
        myInputProcessor = new MyInputProcessor(this);

        directionArrowOne = new DirectionArrow();

        directionArrowTwo = new DirectionArrow();

        ball1 = new Ball(directionArrowOne);
        ball2 = new Ball(directionArrowTwo);

        ball2.setPosition(400, 200);
        ball1.setPosition(368, 145);


        stage.addActor(ball1);
        stage.addActor(ball2);
        stage.addActor(directionArrowOne);
        stage.addActor(directionArrowTwo);

        generateDirectionArrowAngle(ball1, ball2);

    }

    // вычисляет угол отклонения второго шара(ф - угол) по которому ударил первый шар
    // ball2 - шар№2
    // ball1 - шар№1
    public void generateDirectionArrowAngle(Ball ball1, Ball ball2) {
        // центр позиции шара №2
        Vector2 ball2CenterPosition = ball2.getCenterPosition();
        Vector2 ball1CenterPosition = ball1.getCenterPosition();

        Vector2 vector2 = new Vector2(ball2CenterPosition.sub(ball1CenterPosition));

        float directionArrowAngle = vector2.angleDeg() - 90;
//        System.out.println(directionArrowAngle);

        ball2.setDirectionArrowAngle(directionArrowAngle);
        ball2.updateDirectionArrowPosition();

//        return vector2.angleDeg() - 90;
    }

    @Override
    public void show() {
        Gdx.input.setInputProcessor(myInputProcessor);
//        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if (ball1 != null && ball2 != null) {
            generateDirectionArrowAngle(ball1, ball2);
        }
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
