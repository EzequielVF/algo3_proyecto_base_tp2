package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.campodejuego.Tablero;
import edu.fiuba.algo3.modelo.pincel.Pincel;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

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
        Posicion posicion_a = new Posicion();
        Posicion posicion_b = new Posicion();
        Posicion posicion_c = new Posicion();
        posicion_b.sumarAFila();
        posicion_a.restarAFila();
        posicion_c.restarAFila();
        HashMap dictionary = new HashMap<Integer, Integer>();
        dictionary.put(posicion_a.hashCode(), 1);
        dictionary.put(posicion_b.hashCode(), 2);
        System.out.println(posicion_a.hashCode());
        assertEquals(1,dictionary.get(posicion_c.hashCode()));
    }
}
