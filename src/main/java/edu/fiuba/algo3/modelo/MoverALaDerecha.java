package edu.fiuba.algo3.modelo;

import java.util.List;

public class MoverALaDerecha implements Accion{

    public void aplicarAccion(Personaje personaje, List Celda){
        int PosicionActual = personaje.devolverCeldaActual();
        Celda celdaAux = personaje.pasoCeldaOcupadaPorPersonaje((Celda.get(PosicionActual));
        Celda.add(PosicionActual, celdaAux);

        personaje.moverALaDerecha();

        PosicionActual = personaje.devolverCeldaActual();
        celdaAux  = personaje.pasoCeldaOcupadaPorPersonaje((Celda.get(PosicionActual));
        Celda.add(PosicionActual, celdaAux);

    }

}
