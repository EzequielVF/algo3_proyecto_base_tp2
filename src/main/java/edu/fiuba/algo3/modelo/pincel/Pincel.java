package edu.fiuba.algo3.modelo.pincel;

import edu.fiuba.algo3.modelo.campodejuego.Celda;

public class Pincel {
    public EstadoPincel estado = new PincelArriba();

    public void usarSobre(Celda celda){
        estado.aplicarA(celda);
    }

    public EstadoPincel devolverEstadoPincel(){
        return estado;
    }

    public void subirPincel(){
        estado = new PincelArriba();
    }

    public void bajarPincel(){
        estado = new PincelAbajo();
    }

}
