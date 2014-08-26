package com.me.mygdxgame;



import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MiListener  extends ClickListener{
	nave nave;
	bala bala;
	MiListener(nave nave){
		this.nave=nave;
	}
	MiListener(bala bala){
		this.bala=bala;
	}
	
	public boolean touchDown(InputEvent event, float x,float y, int pointer, int button ){
		super.touchDown(event, x, y, pointer, button);
		
		
			fernandezGame.m_bala.setY(fernandezGame.m_bala.getY()+250);
		
	return true; 
	}
	

	

	
	}

