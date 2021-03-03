package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.actoresPrincipales.Personaje;

public class RepetirPorDos extends Repetible {

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccionInversa(personaje);
            accion.aplicarAccionInversa(personaje);
        }
    }

    public String devolverNombre(){
        return "Repetir por 2";
    }

    public Repetible copiar(){
        RepetirPorDos copia = new RepetirPorDos();
        transferirAcciones(copia);
        accionesAEjecutar.clear();
        return copia;
    }
}

