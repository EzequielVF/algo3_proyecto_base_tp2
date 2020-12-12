package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Accion;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.*;
import java.util.ArrayList;

public class Tablero {
    public List<Accion> accionesElegidas = new ArrayList<Accion>();
    public Personaje personaje = new Personaje();

    public void procesarMovimientos(){
        personaje.incializarTerreno();
        for(Accion accion : accionesElegidas)
        {
            accion.aplicarAccion(personaje);
        }
    }

    public void guardarMovimiento(Accion accion){
        accionesElegidas.add(accion);
    }
}
