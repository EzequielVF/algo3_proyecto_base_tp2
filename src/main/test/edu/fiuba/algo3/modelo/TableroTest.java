package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableroTest {
    @Test
    public void TableroDibujarEfectivamenteDibuja() {
        Tablero tablero = new Tablero();
        assertEquals(0, tablero.celdasPintadas());
        Pincel pincel = new Pincel();
        pincel.bajarPincel();
        Posicion posicion_a = new Posicion();
        Posicion posicion_b = new Posicion();
        tablero.dibujar(posicion_a, pincel);
        posicion_b.sumarAColumna();
        tablero.dibujar(posicion_b, pincel);
        posicion_b.sumarAColumna();
        tablero.dibujar(posicion_b, pincel);
        assertEquals(3, tablero.celdasPintadas());
    }

    @Test
    public void pruebahash() {
        Tablero tablero = new Tablero();
        Posicion posicion_a = new Posicion();
        Posicion posicion_b = new Posicion();
        Posicion posicion_c = new Posicion();
        posicion_b.sumarAFila();
        posicion_a.restarAFila();
        posicion_c.restarAFila();
        HashMap hash = new HashMap<Integer, Integer>();
        hash.put(posicion_a.devolverPosicion(), 1);
        hash.put(posicion_b.devolverPosicion(), 2);

        assertEquals(1,hash.get(posicion_c.devolverPosicion()));
    }
}
