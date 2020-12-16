package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {
    public List<Accion> accionesElegidas = new ArrayList();

    public void ejecutar(Personaje personaje){
        for(Accion accion: accionesElegidas){
            accion.aplicarAccion(personaje);
        }
    }

    public void agregarAccion(Accion accion){
        accionesElegidas.add(accion);
    }

}
