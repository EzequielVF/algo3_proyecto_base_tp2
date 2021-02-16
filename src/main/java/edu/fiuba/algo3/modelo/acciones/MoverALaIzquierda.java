package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.acciones.Accion;

public class MoverALaIzquierda implements Accion {

    public void aplicarAccion(Personaje personaje){
        personaje.moverIzquierda();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverDerecha(); }

    public String devolverNombre(){
        return " Mover a la izquierda";
    }

    public void limpiar(){};
}