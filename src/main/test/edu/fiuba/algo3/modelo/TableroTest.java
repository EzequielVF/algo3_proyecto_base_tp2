package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableroTest {
    @Test
    public void TableroDibujarEfectivamenteDibuja() {
        Tablero tablero = new Tablero();
        assertEquals(0, tablero.celdasPintadas());
        Pincel pincel = new Pincel();
        pincel.bajarPincel();
        Posicion posicion = new Posicion();
        tablero.dibujar(posicion, pincel);
        assertEquals(1, tablero.celdasPintadas());
    }
}
