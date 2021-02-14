package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    public Personaje personaje = new Personaje();
    public Algoritmo algoritmo = new Algoritmo();
    public HashMap<String, Algoritmo> algoritmosGuardados = new HashMap<>();

    public void agregarAccion(Accion accion){algoritmo.almacenarAccion(accion); }

    public void crearAlgoritmoPersonalizado(String nombre){
        Algoritmo AlgoritmoPersonalizado = new Algoritmo();
        algoritmo.transferirAcciones(AlgoritmoPersonalizado);
        algoritmosGuardados.put(nombre, AlgoritmoPersonalizado);
    }

    public void usarAlgoritmoPersonalizado(String nombre){
        Algoritmo AlgoritmoPersonalizado = algoritmosGuardados.get(nombre);
        algoritmo.almacenarAccion(AlgoritmoPersonalizado);
    }

    public void ejecutar(){
        algoritmo.aplicarAccion(personaje);
    }

    public Integer devolverPosicionActualPersonaje() { return personaje.posicionActual(); }

    public EstadoPincel devolverEstadoPincel(){
        return personaje.devolverEstadoPincel();
    }

    public int devolverCeldasPintadas(){
        return personaje.devolverCantidadCeldasPintadas();
    }

    public boolean posicionPintada(Posicion posicion){
        return personaje.posicionPintada(posicion);
    }
}