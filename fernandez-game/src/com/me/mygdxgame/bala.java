package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class bala extends Image {
bala(){
	super(new Texture("data/bala.png"));
	
	setX(250);
	addListener(new MiListener(this));

}
}
