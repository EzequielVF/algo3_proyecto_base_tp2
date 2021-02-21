package edu.fiuba.algo3.modelo.campodejuego;

import edu.fiuba.algo3.interfaz.Observable;

import java.util.Objects;

public class Posicion extends Observable {
    public int fila = 0;
    public int columna = 0;

    public int devolverColumna(){
        return columna;
    }

    public int devolverFila(){
        return fila;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    public void sumarAColumna(){
        columna++;
        notifyObservers();
    }
    public void restarAColumna(){
        columna--;
        notifyObservers();
    }
    public void sumarAFila(){
        fila ++;
        notifyObservers();
    }
    public void restarAFila(){
        fila --;
        notifyObservers();
    }

}
