package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.Controlador.Observable;
import edu.fiuba.algo3.modelo.campodejuego.Celda;

public class Pincel {

    public EstadoPincel estadoArriba = new PincelArriba();

    public EstadoPincel estadoAbajo = new PincelAbajo();

    public EstadoPincel estado = estadoArriba;

    public void usarSobre(Celda celda){
        estado.aplicarA(celda);
    }

    public EstadoPincel devolverEstadoPincel(){
        return estado;
    }

    public void subirPincel(){
        estado = estadoArriba;
    }

    public void bajarPincel(){
        estado = estadoAbajo;
    }

}
