package edu.fiuba.algo3.modelo;

public class MoverAbajo implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        tablero.dibujar(posicion, pincel);
        posicion.sumarAFila();
        tablero.dibujar(posicion, pincel);
    }

    public String nombre(){
        return "Mover abajo.";
    }
}