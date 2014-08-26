package com.me.mygdxgame;





import com.badlogic.gdx.ApplicationListener;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class fernandezGame implements ApplicationListener {
	Stage stage;
	static nave m_nave;
	static bala m_bala;
	static Image image;
	public static Object enemigo1;
	

	@Override
	public void create() {		
		stage=new Stage();
		image=new Image(new Texture("data/fondo.png"));
		stage.addActor(image);
		stage.addActor(new flecha1());
		stage.addActor(new flecha2());
		m_nave=new nave();
		stage.addActor(m_nave);
		stage.addActor(new enemigo1());
		stage.addActor(new enemigo2());
		stage.addActor(new enemigo3());
		m_bala=new bala();
		stage.addActor(m_bala);
		

		
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {		
		stage.draw();
		stage.act();
		}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
