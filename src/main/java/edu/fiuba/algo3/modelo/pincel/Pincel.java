package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.Controlador.Observable;
import edu.fiuba.algo3.modelo.campodejuego.Celda;

public class Pincel extends Observable {
    public EstadoPincel estado = new PincelArriba();

    public void usarSobre(Celda celda){
        estado.aplicarA(celda);
    }

    public EstadoPincel devolverEstadoPincel(){
        return estado;
    }

    public void subirPincel(){
        estado = new PincelArriba();
        notifyObservers();
    }

    public void bajarPincel(){
        estado = new PincelAbajo();
        notifyObservers();
    }

}
