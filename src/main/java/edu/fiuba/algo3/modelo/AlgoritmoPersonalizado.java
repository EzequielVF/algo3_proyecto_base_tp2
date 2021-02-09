package edu.fiuba.algo3.modelo;

public class AlgoritmoPersonalizado extends Repetible implements Accion{
    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {  }

}
