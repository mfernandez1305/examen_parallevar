package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class nave extends Image {
nave(){
	super(new Texture("data/nave.png"));
	setX(200);

	addListener(new MiListener(this));
	
}

}