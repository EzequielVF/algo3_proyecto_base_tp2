package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaDerecha implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.dibujar();
        personaje.moverALaDerecha();
        personaje.dibujar();
    }

}
