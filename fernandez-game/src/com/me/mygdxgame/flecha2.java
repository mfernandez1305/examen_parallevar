package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class flecha2 extends Image{
flecha2(){
	super(new Texture("data/flecha2.png"));
	setX(415);
	addListener(new MiListener3(this));
}



}
