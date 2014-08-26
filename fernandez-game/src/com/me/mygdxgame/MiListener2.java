package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MiListener2 extends ClickListener{
	flecha1 flecha1;
	
	MiListener2(flecha1 flecha1){
		this.flecha1=flecha1;
	}
	


	public boolean touchDown(InputEvent event, float x,float y, int pointer, int button ){
		super.touchDown(event, x, y, pointer, button);
		
		
			fernandezGame.m_nave.setX(fernandezGame.m_nave.getX()-15);
		
	return true; 
	}
	

	

	
	}

