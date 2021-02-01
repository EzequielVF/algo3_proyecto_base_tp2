package edu.fiuba.algo3.modelo;

import java.util.*;

public class Tablero {
    public HashMap<Posicion, Celda> terreno = new HashMap<>();
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
        terreno.putIfAbsent(posicion,new Celda());
        Celda celda = terreno.get(posicion);
        pincel.usarSobre(celda);
    }
}
