package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PosicionTest {
    @Test
    public void PosicionSeIniciaEnLaPosicionCorrecta() {
        Posicion posicion = new Posicion();
        assertEquals(0,posicion.devolverColumna());
        assertEquals(0,posicion.devolverFila());
    }
    @Test
    public void PosicionSumarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAColumna();
        assertEquals(1,posicion.devolverColumna());
    }
    @Test
    public void PosicionRestarColumnaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAColumna();
        assertEquals(-1,posicion.devolverColumna());
    }
    @Test
    public void PosicionSumarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.sumarAFila();
        assertEquals(1,posicion.devolverFila());
    }
    @Test
    public void PosicionRestarFilaActualizaCorrectamente() {
        Posicion posicion = new Posicion();
        posicion.restarAFila();
        assertEquals(-1,posicion.devolverFila());
    }
}
