package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    public Personaje personaje = new Personaje();
    public Algoritmo algoritmo = new Algoritmo();
    public ArrayList<Accion> posiblesAcciones = new ArrayList();
    {
        posiblesAcciones.add(new MoverAbajo());
        posiblesAcciones.add(new MoverArriba());
        posiblesAcciones.add(new MoverALaDerecha());
        posiblesAcciones.add(new MoverALaIzquierda());
        posiblesAcciones.add(new SubirPincel());
        posiblesAcciones.add(new BajarPincel());
    }
    public void mostrarPosiblesAcciones(){
        int i = 1;
        for(Accion accion: posiblesAcciones){
            System.out.printf("%d - %s\n",i,accion.nombre());
            i++;
        }
    }

    public void moverAbajo(){
        algoritmo.agregarAccion(posiblesAcciones.get(0));
    }
    public void moverArriba(){
        algoritmo.agregarAccion(posiblesAcciones.get(1));
    }
    public void moverDerecha(){ algoritmo.agregarAccion(posiblesAcciones.get(2)); }
    public void moverIzquierda(){
        algoritmo.agregarAccion(posiblesAcciones.get(3));
    }
    public void subirLapiz(){
        algoritmo.agregarAccion(posiblesAcciones.get(4));
    }
    public void bajarLapiz(){
        algoritmo.agregarAccion(posiblesAcciones.get(5));
    }

    public void ejecutar(){
        algoritmo.ejecutar(personaje);
    }

    public int devolverPosicionActualPersonaje() { return personaje.posicionActual(); }

    public EstadoPincel devolverEstadoPincel(){
        return personaje.devolverEstadoPincel();
    }

    public int devolverCeldasPintadas(){
        return personaje.devolverCantidadCeldasPintadas();
    }
}