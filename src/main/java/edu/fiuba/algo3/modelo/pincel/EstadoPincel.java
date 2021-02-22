package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.interfaz.Observable;
import edu.fiuba.algo3.interfaz.Observer;
import edu.fiuba.algo3.modelo.campodejuego.Celda;

public abstract class EstadoPincel extends Observable {

    abstract void aplicarA(Celda celda);
}
