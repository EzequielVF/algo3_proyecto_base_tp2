package edu.fiuba.algo3.modelo;

public class MoverArriba implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        tablero.dibujar(posicion, pincel);
        posicion.restarAFila();
        tablero.dibujar(posicion, pincel);
    }

    public String nombre(){
        return "Mover arriba.";
    }
}
