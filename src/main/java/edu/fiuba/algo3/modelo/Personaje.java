package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    public PosicionPincel pincel = new PincelArriba();
    public Posicion posicion = new Posicion();
    public List<Celda> terreno = new ArrayList<Celda>();

    public void incializarTerreno(){
        for(int i = 0; i<25; i++){
            terreno.add (new CeldaSinPintar());
        }
    }
    public void dibujar(){
        terreno.add(posicion.devolverPosicion(), pincel.usarSobreCelda(terreno.get(posicion.devolverPosicion())));
    }
    public void moverALaDerecha(){
        posicion.sumarAColumna();
    }
    public void moverALaIzquierda(){
        posicion.restarAColumna();
    }
}
