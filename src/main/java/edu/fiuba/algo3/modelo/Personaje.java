package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public PosicionPincel pincel = new PincelArriba();
    public Posicion posicion = new Posicion();

    public int devolverCeldaActual(){
        return (posicion.devolverPosicion());
    }
    public Celda pasoCeldaOcupadaPorPersonaje(Celda celda){
        return (pincel pasoPincelSobre(celda));
    }
}
