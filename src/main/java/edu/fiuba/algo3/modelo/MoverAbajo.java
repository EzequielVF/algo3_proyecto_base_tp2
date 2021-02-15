package edu.fiuba.algo3.modelo;

public class MoverAbajo implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverAbajo();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverArriba(); }

    public String devolverNombre(){
        return " Mover abajo";
    }
}