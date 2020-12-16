package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaDerecha implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverDerecha();
    }

    public String nombre(){
        return "Mover a la derecha.";
    }

}
