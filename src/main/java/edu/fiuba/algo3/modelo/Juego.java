package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    private Tablero tablero = new Tablero();
    List<Accion> accionesSeleccionables = new ArrayList<>(List.of(
            new MoverALaDerecha(),
            new MoverALaIzquierda()
    ));

    public void moverALaDerecha(){
        tablero.guardarMovimiento(accionesSeleccionables.get(1));
    }

}
