package edu.fiuba.algo3.modelo;

public class MoverAbajo implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.moverAbajo();
    }

    public String nombre(){
        return "Mover abajo.";
    }
}