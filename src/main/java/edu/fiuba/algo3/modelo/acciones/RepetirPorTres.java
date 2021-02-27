package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;

public class RepetirPorTres extends Repetible {

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
            accion.aplicarAccion(personaje);
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        this.aplicarAccion(personaje);
    }

    public String devolverNombre(){
        return "Repetir por 3";
    }

    public Repetible copiar(){
        RepetirPorTres copia = new RepetirPorTres();
        transferirAcciones(copia);
        accionesAEjecutar.clear();
        return copia;
    }
}
