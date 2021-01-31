package edu.fiuba.algo3.modelo;

import java.util.stream.Collectors;
import java.util.*;
import java.util.ArrayList;

public class Tablero {
    public Dictionary<Posicion, Celda> terreno = new Hashtable();
    /*public List<Celda> terreno2 = new ArrayList<Celda>();

    public Tablero(){
            for(int i = 0; i<25; i++){
                terreno.add (new Celda());
            }
    }

    public int celdasPintadas(){
        List<Celda> celdasPintadas = terreno.stream().filter(a -> a.devolverEstado()).collect(Collectors.toList());
        return (celdasPintadas.size());
    }*/

    public void dibujar(Posicion posicion, Pincel pincel){
        Celda celda = terreno.get(posicion);
        if (celda == null){
            celda = new Celda();
        }
        pincel.usarSobre(celda);
        terreno.put(posicion, celda);
    }
}
