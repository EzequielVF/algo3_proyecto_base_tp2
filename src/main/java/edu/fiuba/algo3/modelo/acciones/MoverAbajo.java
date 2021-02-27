package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;

public class MoverAbajo implements Accion {

    public void aplicarAccion(Personaje personaje){
        personaje.moverAbajo();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverArriba(); }

    public String devolverNombre(){
        return "Mover abajo";
    }
}