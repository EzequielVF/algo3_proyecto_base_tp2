package edu.fiuba.algo3.modelo;

public class SubirLapiz implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        pincel.subirLapiz();
    }

    public String nombre(){
        return "Subir pincel.";
    }
}