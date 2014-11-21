package com.carlos.villa;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import java.util.ArrayList;

/**
 * Created by PC on 20/11/2014.
 */
public class Fondo extends Actor{
    ArrayList<Image> espacio;

    int dibujo_actual=0,llamadas_act=0;
    float tiempo_act=0;
    public Fondo(){
        super();
        espacio = new ArrayList<Image>();
        espacio.add(new Image(new Texture("Espacio00.png")));

        for(int i=1;i<=27;i++){
            if(i!=4)
            espacio.add(new Image(new Texture("Espacio"+i+".png")));
        }

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

        if (dibujo_actual>=espacio.size()){
            dibujo_actual=0;
        }
        llamadas_act++;

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
       // espacio.get(dibujo_actual).setX(1150);
        espacio.get(dibujo_actual).draw(batch,parentAlpha);

    }
}
