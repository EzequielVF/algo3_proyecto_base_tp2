package edu.fiuba.algo3.modelo;

public class BajarLapiz implements Accion{

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero){
        pincel.bajarLapiz();
    }
    public String nombre(){
        return "Bajar pincel.";
    }
}
