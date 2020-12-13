package edu.fiuba.algo3.modelo;

public class PincelAbajo implements EstadoPincel {

    public Celda aplicarA(Celda celda){
        return (new CeldaPintada());
    }
}
