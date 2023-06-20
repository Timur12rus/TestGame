package com.timgapps.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.timgapps.TestGame;

public class GameActor extends Actor {
    private TextureRegion image;

    public GameActor(String textureRegionName) {
        image = new TextureRegion(TestGame.atlas.findRegion(textureRegionName));
        setSize(image.getRegionWidth(), image.getRegionHeight());
        debug();
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(image, getX(), getY(), getOriginX(), getOriginY(),
                getWidth(), getHeight(), 1, 1, getRotation());
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }
}
