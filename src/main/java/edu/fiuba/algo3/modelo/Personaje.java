package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public Pincel pincel = new Pincel();
    public Posicion posicion = new Posicion();
    public Tablero tablero = new Tablero();

    /*public int devolverCantidadCeldasPintadas(){
        return (tablero.celdasPintadas());
    }*/

    public EstadoPincel devolverEstadoPincel(){
        return pincel.devolverEstadoPincel();
    }

    public Posicion posicionActual(){
        return posicion;
    }

    public void moverAbajo(){
        posicion.sumarAFila();
        tablero.dibujar(posicion, pincel);
    }

    public void moverArriba(){
        posicion.restarAFila();
        tablero.dibujar(posicion, pincel);
    }

    public void moverDerecha(){
        posicion.sumarAColumna();
        tablero.dibujar(posicion, pincel);
    }

    public void moverIzquierda(){
        posicion.restarAColumna();
        tablero.dibujar(posicion, pincel);
    }

    public void bajarPincel(){
        pincel.bajarPincel();
        tablero.dibujar(posicion, pincel);
    }

    public void subirPincel(){
        pincel.subirPincel();
    }
}
