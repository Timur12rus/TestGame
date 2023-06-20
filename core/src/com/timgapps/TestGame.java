package com.timgapps;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.timgapps.scenes.PlayScene;

public class TestGame extends Game {

    public static TextureAtlas atlas;
    public static SpriteBatch batch;

    private static TestGame instance = new TestGame();

    private Screen scene;

    public static final int V_WIDTH = 1280;
    public static final int V_HEIGHT = 720;

    public static TestGame getInstance() {
        return instance;
    }

    public TestGame() {
    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        atlas = new TextureAtlas("assets/pack.atlas");
        showScene();
    }

    @Override
    public void render() {
        super.render();
    }

    public void showScene() {
        scene = new PlayScene(this);
        setScreen(scene);
    }

    @Override
    public void dispose() {
        super.dispose();
        atlas.dispose();
    }
}