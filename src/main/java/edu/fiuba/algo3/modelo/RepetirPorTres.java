package edu.fiuba.algo3.modelo;

public class RepetirPorTres extends Repetible{
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
        return " Repetir por 3";
    }
}
