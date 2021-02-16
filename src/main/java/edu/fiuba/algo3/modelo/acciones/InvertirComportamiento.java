package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;

public class InvertirComportamiento extends Repetible {
    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccionInversa(personaje);
            accion.limpiar();
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
            accion.limpiar();
        }
    }

    public String devolverNombre(){
        return " Invertir comportamiento";
    }
}
