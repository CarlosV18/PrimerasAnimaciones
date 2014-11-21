package com.carlos.villa;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

/**
        * Created by PC on 14/11/2014.
        */
public class PersonajesAmimados extends Actor{
    ArrayList<Image> images;
    int dibujo_actual=0,llamadas_act=0;
    float tiempo_act=0;
    public PersonajesAmimados (){
        super();
        images = new ArrayList<Image>();
        images.add(new Image(new Texture("golem-walk1.png")));
        images.add(new Image(new Texture("golem-walk2.png")));
        images.add(new Image(new Texture("golem-walk3.png")));
        images.add(new Image(new Texture("golem-walk4.png")));
        images.add(new Image(new Texture("golem-walk5.png")));
        images.add(new Image(new Texture("golem-walk6.png")));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        System.out.println(delta);
        tiempo_act+=delta;
        if(tiempo_act>0.45f){
            dibujo_actual++;
            tiempo_act=0;
        }

        if (dibujo_actual>=images.size()){
            dibujo_actual=0;
        }
        llamadas_act++;
        images.get(dibujo_actual).moveBy(1,0);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        images.get(dibujo_actual).draw(batch,parentAlpha);

    }
}
