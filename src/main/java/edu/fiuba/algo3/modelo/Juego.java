package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    public Personaje personaje = new Personaje();
    public Algoritmo algoritmo = new Algoritmo();

    public void agregarAccion(Accion accion){algoritmo.agregarAccion(accion); }

    public void ejecutar(){
        algoritmo.ejecutar(personaje);
    }

    public Posicion devolverPosicionActualPersonaje() { return personaje.posicionActual(); }

    public EstadoPincel devolverEstadoPincel(){
        return personaje.devolverEstadoPincel();
    }

    /*public int devolverCeldasPintadas(){
        return personaje.devolverCantidadCeldasPintadas();
    }*/
}