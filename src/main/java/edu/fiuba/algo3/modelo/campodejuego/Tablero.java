package edu.fiuba.algo3.modelo.campodejuego;

import edu.fiuba.algo3.modelo.pincel.Pincel;

import java.util.*;
import java.util.stream.Collectors;

public class Tablero {
    public HashMap<Integer, Celda> terreno = new HashMap<>();

    public int celdasPintadas(){
        List<Celda> celdas = new ArrayList<Celda>(terreno.values());
        List<Celda> celdasPintadas = celdas.stream().filter(a -> a.devolverEstado()).collect(Collectors.toList());
        return (celdasPintadas.size());
    }

    public void dibujar(Posicion posicion, Pincel pincel){
        terreno.putIfAbsent(posicion.hashCode(), new Celda());
        Celda celda = terreno.get(posicion.hashCode());
        pincel.usarSobre(celda);
    }

    public boolean posicionPintada(Posicion posicion){
        return ((terreno.get(posicion.hashCode())).devolverEstado());
    }
}
