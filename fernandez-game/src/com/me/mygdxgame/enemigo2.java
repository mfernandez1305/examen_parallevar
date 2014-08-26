package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class enemigo2 extends Image{
	enemigo2(){
		super(new Texture("data/enemigo2.png"));
		setY(250);
		setX(200);
		
	}
	public void act(float delta)
	{
		if(getX()<390+fernandezGame.image.getX())
		setX(getX()+1);
		
		}
	
		
		}


