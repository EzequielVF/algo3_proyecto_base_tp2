package edu.fiuba.algo3.modelo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonajeTest {
    @Test
    public void personajeSeIniciaEnLaPosicionCorrecta() {
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        assertTrue(posicion.hashCode() == personaje.posicionActual());
    }
    @Test
    public void personajeSeIniciaConPincelArriba() {
        EstadoPincel aux = new PincelArriba();
        Personaje personaje = new Personaje();
        assertTrue(aux.getClass() == personaje.devolverEstadoPincel().getClass());
    }
    @Test
    public void personajeMoverAbajoModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverAbajo();
        Posicion posicion = new Posicion();
        posicion.sumarAFila();
        assertTrue(posicion.hashCode() == personaje.posicionActual());
    }
    @Test
    public void personajeMoverDerechaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverDerecha();
        Posicion posicion = new Posicion();
        posicion.sumarAColumna();
        assertTrue(posicion.hashCode() == personaje.posicionActual());
    }
    @Test
    public void personajeMoverIzquierdaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverIzquierda();
        Posicion posicion = new Posicion();
        posicion.restarAColumna();
        assertTrue(posicion.hashCode() == personaje.posicionActual());
    }
    @Test
    public void personajeMoverArribaModificaCorrectamentePosicion() {
        Personaje personaje = new Personaje();
        personaje.moverArriba();
        Posicion posicion = new Posicion();
        posicion.restarAFila();
        assertTrue(posicion.hashCode() == personaje.posicionActual());
    }
    @Test
    public void personajeBajaCorrectamenteElPincel() {
        EstadoPincel aux = new PincelAbajo();
        Personaje personaje = new Personaje();
        personaje.bajarPincel();
        assertTrue(aux.getClass() == personaje.devolverEstadoPincel().getClass());
    }
    @Test
    public void personajeSubeCorrectamenteElPincel() {
        EstadoPincel aux = new PincelArriba();
        Personaje personaje = new Personaje();
        personaje.bajarPincel();
        personaje.subirPincel();
        assertTrue(aux.getClass() == personaje.devolverEstadoPincel().getClass());
    }
}
