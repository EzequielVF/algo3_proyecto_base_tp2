package edu.fiuba.algo3.modelo;

public class InvertirComportamiento extends Repetible{
    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccionInversa(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
        }
    }
}
