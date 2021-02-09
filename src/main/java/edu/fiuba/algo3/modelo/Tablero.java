package edu.fiuba.algo3.modelo;

import java.util.*;
import java.util.stream.Collectors;

public class Tablero {
    public HashMap<Integer, Celda> terreno = new HashMap<>();
    /*public List<Celda> terreno2 = new ArrayList<Celda>();

    public Tablero(){
            for(int i = 0; i<25; i++){
                terreno.add (new Celda());
            }
    }
    */
    public int celdasPintadas(){
        List<Celda> celdas = new ArrayList<Celda>(terreno.values());
        List<Celda> celdasPintadas = celdas.stream().filter(a -> a.devolverEstado()).collect(Collectors.toList());
        return (celdasPintadas.size());
    }

    public void dibujar(Posicion posicion, Pincel pincel){
        terreno.putIfAbsent(posicion.devolverPosicion(), new Celda());
        Celda celda = terreno.get(posicion.devolverPosicion());
        pincel.usarSobre(celda);
    }
}
