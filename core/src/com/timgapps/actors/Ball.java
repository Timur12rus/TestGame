package com.timgapps.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

//объединен.'1.10.1-SNAPSHOT'build.gradle
public class Ball extends Actor {

    private TextureRegion image;

    private Vector2 position;

    private Texture texture;

    public Ball(Vector2 position) {
        setPosition(position.x, position.y);
        texture = new Texture("ball.png");
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY());
    }

    @Override
    public void act(float delta) {
//        super.act(delta);
    }
}
