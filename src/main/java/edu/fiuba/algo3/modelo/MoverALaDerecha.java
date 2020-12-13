package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaDerecha implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        tablero.dibujar(posicion, pincel);
        posicion.sumarAColumna();
        tablero.dibujar(posicion, pincel);
    }

    public String nombre(){
        return "Mover a la derecha.";
    }

}
