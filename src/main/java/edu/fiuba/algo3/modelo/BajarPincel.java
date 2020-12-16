package edu.fiuba.algo3.modelo;

public class BajarPincel implements Accion{

    public void aplicarAccion(Personaje personaje){
       personaje.bajarPincel();
    }

    public String nombre(){
        return "Bajar pincel.";
    }
}
