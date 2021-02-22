package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.modelo.campodejuego.Celda;

public class PincelAbajo extends EstadoPincel {

    public void aplicarA(Celda celda){
        celda.pintar();
        notifyObservers();
    }
}
