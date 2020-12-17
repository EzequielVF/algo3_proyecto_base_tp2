package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTest {
    @Test
    public void PosicionSeIniciaEnLaPosicionCorrecta() {
        Posicion posicion = new Posicion();
        assertEquals(13,posicion.devolverPosicion());
    }
    @Test
    public void PosicionSumarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAColumna();
        assertEquals(14,posicion.devolverPosicion());
    }
    @Test
    public void PosicionRestarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAColumna();
        assertEquals(12,posicion.devolverPosicion());
    }
    @Test
    public void PosicionSumarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAFila();
        assertEquals(18,posicion.devolverPosicion());
    }
    @Test
    public void PosicionRestarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAFila();
        assertEquals(8,posicion.devolverPosicion());
    }
}
