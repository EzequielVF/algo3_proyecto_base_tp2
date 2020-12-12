package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaIzquierda implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.dibujar();
        personaje.moverALaIzquierda();
        personaje.dibujar();
    }

}