package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.acciones.Accion;

public class MoverArriba implements Accion {

    public void aplicarAccion(Personaje personaje){
        personaje.moverArriba();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverAbajo(); }

    public String devolverNombre(){
        return " Mover arriba";
    }

    public void limpiar(){};
}
