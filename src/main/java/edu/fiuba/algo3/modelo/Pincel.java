package edu.fiuba.algo3.modelo;

public class Pincel {
    public EstadoPincel estado = new PincelArriba();

    public Celda usarSobre(Celda celda){
        return (estado.aplicarA(celda));
    }

    public EstadoPincel devolverEstadoPincel(){
        return estado;
    }

    public void subirLapiz(){
        estado = new PincelArriba();
    }

    public void bajarLapiz(){
        estado = new PincelAbajo();
    }

}
