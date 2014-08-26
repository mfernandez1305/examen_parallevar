package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class enemigo1 extends Image{
enemigo1(){
	super(new Texture("data/enemigo1.png"));
	setY(250);
	setX(0);
	
}

public void act(float delta)
{
	
	if(getX()<160+fernandezGame.image.getX())
	setX(getX()+1);
	
			
		
	}

	
}



