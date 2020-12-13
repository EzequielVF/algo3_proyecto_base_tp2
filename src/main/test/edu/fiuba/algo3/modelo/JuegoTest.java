package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {
    @Test
    public void PruebaMoverALaderecha() {
        Juego juego = new Juego();
        juego.bajarLapiz();
        juego.moverDerecha();
        juego.moverArriba();
        juego.ejecutar();

        assertEquals(3, juego.devovlerCeldasPintadas());
    }
}
