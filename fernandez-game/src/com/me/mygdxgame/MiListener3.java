package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MiListener3 extends ClickListener{
	flecha2 flecha2;
	
	MiListener3(flecha2 flecha2){
		this.flecha2=flecha2;
	}
	


	public boolean touchDown(InputEvent event, float x,float y, int pointer, int button ){
		super.touchDown(event, x, y, pointer, button);
		
		
			fernandezGame.m_nave.setX(fernandezGame.m_nave.getX()+15);
		
	return true; 
	}
	

	

	
	}

