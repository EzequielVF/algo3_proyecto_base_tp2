package edu.fiuba.algo3.modelo;

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
