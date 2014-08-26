package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class enemigo3 extends Image{
	enemigo3(){
		super(new Texture("data/enemigo3.png"));
		setY(250);
		setX(415);
		
	}
	public void act(float delta)
	{
		if(getX()>200+fernandezGame.image.getX())
		setX(getX()-1);
		
		}
	
}
