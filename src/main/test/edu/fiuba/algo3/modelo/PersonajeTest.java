package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonajeTest {
    @Test
    public void personajeSeIniciaEnLaPosicionCorrecta() {
        Personaje personaje = new Personaje();
        assertEquals(13,personaje.posicionActual());
    }
    @Test
    public void personajeSeIniciaConPincelArriba() {
        EstadoPincel aux = new PincelArriba();
        Personaje personaje = new Personaje();
        assertEquals(aux.getClass(),personaje.devolverEstadoPincel().getClass());
    }
    @Test
    public void personajeMoverAbajoModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverAbajo();
        assertEquals(18,personaje.posicionActual());
    }
    @Test
    public void personajeMoverDerechaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverDerecha();
        assertEquals(14,personaje.posicionActual());
    }
    @Test
    public void personajeMoverIzquierdaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverIzquierda();
        assertEquals(12,personaje.posicionActual());
    }
    @Test
    public void personajeMoverArribaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverArriba();
        assertEquals(8,personaje.posicionActual());
    }
    @Test
    public void personajeBajaCorrectamenteElPincel() {
        EstadoPincel aux = new PincelAbajo();
        Personaje personaje = new Personaje();
        personaje.bajarPincel();
        assertEquals(aux.getClass(),personaje.devolverEstadoPincel().getClass());
    }
    @Test
    public void personajeSubeCorrectamenteElPincel() {
        EstadoPincel aux = new PincelArriba();
        Personaje personaje = new Personaje();
        personaje.bajarPincel();
        personaje.subirPincel();
        assertEquals(aux.getClass(),personaje.devolverEstadoPincel().getClass());
    }
}
