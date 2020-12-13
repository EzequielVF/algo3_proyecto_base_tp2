package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public List<Accion> accionesElegidas = new ArrayList();
    public Pincel pincel = new Pincel();
    public Posicion posicion = new Posicion();
    public Tablero tablero = new Tablero();

    public void agregarAccion(Accion accion){
        accionesElegidas.add(accion);
    }

    public int devolverCantidadCeldasPintadas(){
        return (tablero.celdasPintadas());
    }

    public void realizarMovimientos(){
        for(Accion accion: accionesElegidas){
            accion.aplicarAccion(posicion, pincel, tablero);
        }
    }
}
