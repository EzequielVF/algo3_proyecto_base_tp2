package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableroTest {
    /*@Test
        public void TableroDibujarEfectivamenteDibuja() {
        Tablero tablero = new Tablero();
        assertEquals(0, tablero.celdasPintadas());
        Pincel pincel = new Pincel();
        pincel.bajarPincel();
        Posicion posicion = new Posicion();
        tablero.dibujar(posicion, pincel);
        assertEquals(1, tablero.celdasPintadas());
    }*/

    @Test
    public void pruebahash() {
        Tablero tablero = new Tablero();
        Posicion posicion_a = new Posicion();
        Posicion posicion_b = new Posicion();
        Posicion posicion_c = new Posicion();
        posicion_b.sumarAFila();
        posicion_a.restarAFila();
        Dictionary hash = new Hashtable();
        hash.put(posicion_a, 1);
        hash.put(posicion_b, 2);


        assertEquals(hash.get(posicion_c), null);
    }
}
