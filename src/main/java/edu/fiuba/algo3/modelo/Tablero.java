package edu.fiuba.algo3.modelo;

import java.util.stream.Collectors;
import java.util.*;
import java.util.ArrayList;

public class Tablero {
    public List<Celda> terreno = new ArrayList<Celda>();

    public Tablero(){
            for(int i = 0; i<25; i++){
                terreno.add (new Celda());
            }
    }

    public int celdasPintadas(){
        List<Celda> celdasPintadas = terreno.stream().filter(a -> a.devolverEstado()).collect(Collectors.toList());
        return (celdasPintadas.size());
    }

    public void dibujar(Posicion posicion, Pincel pincel){

        pincel.usarSobre(terreno.get(posicion.devolverPosicion()));
        //terreno.remove(posicion.devolverPosicion());
        //terreno.add(posicion.devolverPosicion(), aux);
    }
}
