package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaIzquierda implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        tablero.dibujar(posicion, pincel);
        posicion.restarAColumna();
        tablero.dibujar(posicion, pincel);
    }

    public String nombre(){
        return "Mover a la izquierda.";
    }

}