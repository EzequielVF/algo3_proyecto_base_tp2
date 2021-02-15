package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaIzquierda implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverIzquierda();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverDerecha(); }

    public String devolverNombre(){
        return " Mover a la izquierda";
    }
}