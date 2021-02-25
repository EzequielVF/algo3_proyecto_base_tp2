package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.Controlador.Observable;
import edu.fiuba.algo3.modelo.campodejuego.Celda;

public class Pincel extends Observable {

    public EstadoPincel estadoArriba = new PincelArriba();

    public EstadoPincel estadoAbajo = new PincelAbajo();

    public EstadoPincel estado = estadoArriba;

    public void usarSobre(Celda celda){
        estado.aplicarA(celda);
    }

    public EstadoPincel devolverEstadoPincel(){
        return estado;
    }

    public EstadoPincel devolverEstadoPincelAbajo(){
        return estadoAbajo;
    }

    public void subirPincel(){
        estado = estadoArriba;
        notifyObservers();
    }

    public void bajarPincel(){
        estado = estadoAbajo;
        notifyObservers();
    }

}
