package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Accion;
import edu.fiuba.algo3.modelo.Personaje;

import java.util.*;
import java.util.ArrayList;

public class Tablero {
    public List<Accion> accionesElegidas = new ArrayList<Accion>();
    public List<Celda> terreno = new ArrayList<Celda>();
    public Personaje personaje = new Personaje();

    public void incializarTerreno(){
        for(int i = 0; i<25; i++){
            terreno.add (new CeldaSinPintar());
        }
    }

    public void procesarMovimiento(){
        for(Accion accion : accionesElegidas)
        {
            accion.aplicarAccion(personaje, terreno);

        }
    }
}
