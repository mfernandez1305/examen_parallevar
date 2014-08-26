package com.me.mygdxgame;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class flecha1 extends Image{
	flecha1(){
	super(new Texture("data/flecha1.png"));
	addListener(new MiListener2(this));
	}

	
	}	
	

