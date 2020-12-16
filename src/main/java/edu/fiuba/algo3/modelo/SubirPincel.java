package edu.fiuba.algo3.modelo;

public class SubirPincel implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.subirPincel();
    }

    public String nombre(){
        return "Subir pincel.";
    }
}