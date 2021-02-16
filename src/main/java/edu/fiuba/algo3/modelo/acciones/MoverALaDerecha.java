package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.acciones.Accion;

public class MoverALaDerecha implements Accion {

    public void aplicarAccion(Personaje personaje){
        personaje.moverDerecha();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.moverIzquierda(); }

    public String devolverNombre(){
        return " Mover a la derecha";
    }

    public void limpiar(){};
}
