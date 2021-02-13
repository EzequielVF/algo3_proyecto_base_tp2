package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo extends Repetible{

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        this.aplicarAccion(personaje);
    }
    public void transferirAcciones(Algoritmo aux){
        for(Accion accion: accionesAEjecutar){
            aux.almacenarAccion(accion);
        }
    }
}
