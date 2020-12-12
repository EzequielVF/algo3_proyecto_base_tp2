package edu.fiuba.algo3.modelo;

public class PincelAbajo implements PosicionPincel {

    public Celda pasoPincelSobre(Celda celda){
        return (new CeldaPintada());
    }
}
