package edu.fiuba.algo3.modelo;

public class MoverArriba implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverArriba();
    }

    public String nombre(){
        return "Mover arriba.";
    }
}
