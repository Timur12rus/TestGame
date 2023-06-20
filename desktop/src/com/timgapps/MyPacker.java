package com.timgapps;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class MyPacker {
    public static void main(String[] args) {
        TexturePacker.process("assets/images", "assets/", "pack");
    }
}
