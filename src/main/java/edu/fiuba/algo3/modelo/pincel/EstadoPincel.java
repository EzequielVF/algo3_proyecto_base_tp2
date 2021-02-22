package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.Controlador.Observable;
import edu.fiuba.algo3.Controlador.Observer;
import edu.fiuba.algo3.modelo.campodejuego.Celda;

public abstract class EstadoPincel extends Observable {

    abstract void aplicarA(Celda celda);
}
