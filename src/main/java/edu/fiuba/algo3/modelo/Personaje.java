package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public Pincel pincel = new Pincel();
    public Posicion posicion = new Posicion();
    public Tablero tablero = new Tablero();

    public int devolverCantidadCeldasPintadas(){
        return (tablero.celdasPintadas());
    }

    public boolean posicionPintada(Posicion posicion){
        return tablero.posicionPintada(posicion);
    }

    public EstadoPincel devolverEstadoPincel(){
        return pincel.devolverEstadoPincel();
    }

    public int posicionActual(){
        return posicion.hashCode();
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
