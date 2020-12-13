package edu.fiuba.algo3.modelo;

import java.util.List;

public interface Accion {

    public void aplicarAccion(Posicion posicion, Pincel pincel, Tablero tablero);
    public String nombre();
}
