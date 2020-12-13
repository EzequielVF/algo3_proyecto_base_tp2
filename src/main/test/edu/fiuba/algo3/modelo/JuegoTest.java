package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {
    @Test
    public void PruebaMoverALaderecha() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.moverDerecha();
        juego.ejecutar();
        assertEquals(14, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverALaIzquierda() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.moverIzquierda();
        juego.ejecutar();
        assertEquals(12, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverArriba() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.moverArriba();
        juego.ejecutar();
        assertEquals(8, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverAbajo() {
        Juego juego = new Juego();
        assertEquals(13,juego.devolverPosicionActualPersonaje());
        juego.moverAbajo();
        juego.ejecutar();
        assertEquals(18, juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaEstadoInicialPincelArriba() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelArriba();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarPincel() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelAbajo();
        juego.bajarLapiz();
        juego.ejecutar();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarYSubirPincel() {
        Juego juego = new Juego();
        EstadoPincel aux = new PincelArriba();
        juego.bajarLapiz();
        juego.subirLapiz();
        juego.ejecutar();
        assertEquals(aux.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
}
