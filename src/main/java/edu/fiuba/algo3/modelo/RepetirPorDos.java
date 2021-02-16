package edu.fiuba.algo3.modelo;
import java.util.ArrayList;
import java.util.List;


public class RepetirPorDos extends Repetible{

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        this.aplicarAccion(personaje);
    }

    public String devolverNombre(){
        return " Repetir por 2";
    }
}

