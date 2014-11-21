package com.carlos.villa;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

/**
 * Created by PC on 20/11/2014.
 */
public class FuegoAnimado extends Actor {
    ArrayList<Image> fuego;

    int dibujo_actual=0,llamadas_act=0;
    float tiempo_act=0;
    public FuegoAnimado(){
        super();
        fuego = new ArrayList<Image>();
        fuego.add(new Image(new Texture("fireblast1.png")));
        fuego.add(new Image(new Texture("fireblast2.png")));
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        System.out.println(delta);
        tiempo_act+=delta;
        if(tiempo_act>0.1f){
            dibujo_actual++;
            tiempo_act=0;
        }

        if (dibujo_actual>=fuego.size()){
            dibujo_actual=0;
        }
        llamadas_act++;
        this.setX(this.getX() + 1);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        fuego.get(dibujo_actual).setX(850);
        fuego.get(dibujo_actual).setY(400);
        fuego.get(dibujo_actual).draw(batch,parentAlpha);

    }
}
