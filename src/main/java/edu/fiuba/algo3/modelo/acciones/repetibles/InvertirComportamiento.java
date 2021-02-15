package edu.fiuba.algo3.modelo.acciones.repetibles;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.acciones.Accion;
import edu.fiuba.algo3.modelo.acciones.Repetible;

public class InvertirComportamiento extends Repetible {
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

    public String devolverNombre(){
        return " Invertir comportamiento";
    }
}
