package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.excepciones.RepetibleNoTieneAccionesTodaviaExcepcion;

public class Algoritmo extends Repetible {

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccion(personaje);
        }
    }
    public void aplicarAccionInversa(Personaje personaje) {
        for(Accion accion: accionesAEjecutar){
            accion.aplicarAccionInversa(personaje);
        }
    }

    public void transferirAcciones(Algoritmo aux){
        if(accionesAEjecutar.isEmpty()){ throw new RepetibleNoTieneAccionesTodaviaExcepcion();}
        for(Accion accion: accionesAEjecutar){
            aux.almacenarAccion(accion);
        }
    }

    public Repetible copiar(){
        Algoritmo copia = new Algoritmo();
        transferirAcciones(copia);
        accionesAEjecutar.clear();
        return copia;
    }

    public String devolverNombre(){
        return "Algoritmo personalizado";
    }
}
