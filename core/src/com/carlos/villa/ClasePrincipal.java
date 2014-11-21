package com.carlos.villa;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class ClasePrincipal extends ApplicationAdapter {
	Stage stage;
    Music music;

   @Override
	public void create () {
       // Image fondo= new Image(new Texture("Espacio00.png"));
        music=Gdx.audio.newMusic(Gdx.files.getFileHandle("Middleton Kaiju.mp3", Files.FileType.Internal));
        music.play();
        music.setLooping(true);
        stage= new Stage();
        stage.addActor(new Fondo());
        stage.addActor(new PersonajesAmimados());
        stage.addActor(new FuegoAnimado());
        stage.addActor(new Gusano());
        //Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
        stage.act();
    }


}
