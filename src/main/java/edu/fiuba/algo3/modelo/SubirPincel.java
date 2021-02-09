package edu.fiuba.algo3.modelo;

public class SubirPincel implements Accion{

    public void aplicarAccion(Personaje personaje){
        personaje.subirPincel();
    }

    public void aplicarAccionInversa(Personaje personaje) { personaje.bajarPincel(); }

}