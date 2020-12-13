package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Juego {
    public Personaje personaje = new Personaje();
    public ArrayList<Accion> posiblesAcciones = new ArrayList();
    {
        posiblesAcciones.add(new MoverAbajo());
        posiblesAcciones.add(new MoverArriba());
        posiblesAcciones.add(new MoverALaDerecha());
        posiblesAcciones.add(new MoverALaIzquierda());
        posiblesAcciones.add(new SubirLapiz());
        posiblesAcciones.add(new BajarLapiz());
    }
    public void mostrarPosiblesAcciones(){
        int i = 1;
        for(Accion accion: posiblesAcciones){
            System.out.printf("%d - %s\n",i,accion.nombre());
            i++;
        }
    }

    public void moverAbajo(){
        personaje.agregarAccion(posiblesAcciones.get(0));
    }
    public void moverArriba(){
        personaje.agregarAccion(posiblesAcciones.get(1));
    }
    public void moverDerecha(){
        personaje.agregarAccion(posiblesAcciones.get(2));
    }
    public void moverIzquierda(){
        personaje.agregarAccion(posiblesAcciones.get(3));
    }
    public void subirLapiz(){
        personaje.agregarAccion(posiblesAcciones.get(4));
    }
    public void bajarLapiz(){
        personaje.agregarAccion(posiblesAcciones.get(5));
    }

    public void ejecutar(){
        personaje.realizarMovimientos();
    }

    public int devovlerCeldasPintadas(){
        return personaje.devolverCantidadCeldasPintadas();
    }
}