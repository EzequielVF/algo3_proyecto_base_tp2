package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTest {
    @Test
    public void PosicionSeIniciaEnLaPosicionCorrecta() {
        Posicion posicion = new Posicion();
        assertEquals(3,posicion.columna);
        assertEquals(3,posicion.fila);
    }
    @Test
    public void PosicionSumarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAColumna();
        assertEquals(4,posicion.columna);
    }
    @Test
    public void PosicionRestarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAColumna();
        assertEquals(2,posicion.columna);
    }
    @Test
    public void PosicionSumarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAFila();
        assertEquals(4,posicion.fila);
    }
    @Test
    public void PosicionRestarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAFila();
        assertEquals(2,posicion.fila);
    }
}
