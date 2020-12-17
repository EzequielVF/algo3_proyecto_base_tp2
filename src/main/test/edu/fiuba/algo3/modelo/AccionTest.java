package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccionTest {
    @Test
    public void PruebaMoverALaderechaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        assertEquals(13,personaje.posicionActual());
        accion.aplicarAccion(personaje);
        assertEquals(14,personaje.posicionActual());
    }
    @Test
    public void PruebaMoverALaIzquierdaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaIzquierda();
        assertEquals(13,personaje.posicionActual());
        accion.aplicarAccion(personaje);
        assertEquals(12,personaje.posicionActual());
    }
    @Test
    public void PruebaMoverArribaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverArriba();
        assertEquals(13,personaje.posicionActual());
        accion.aplicarAccion(personaje);
        assertEquals(8,personaje.posicionActual());
    }
    @Test
    public void PruebaMoverAbajoModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverAbajo();
        assertEquals(13,personaje.posicionActual());
        accion.aplicarAccion(personaje);
        assertEquals(18,personaje.posicionActual());
    }
    @Test
    public void PruebaBajarPincelCambiaCorrectamenteElEstadoDelPincel() {
        Personaje personaje = new Personaje();
        Accion accion = new BajarPincel();
        EstadoPincel aux = new PincelAbajo();
        EstadoPincel auxArriba = new PincelArriba();
        assertEquals(auxArriba.getClass(),personaje.devolverEstadoPincel().getClass());
        accion.aplicarAccion(personaje);
        assertEquals(aux.getClass(),personaje.devolverEstadoPincel().getClass());
    }
    @Test
    public void PruebaSubirPincelCambiaCorrectamenteElEstadoDelPincel() {
        Personaje personaje = new Personaje();
        Accion accion = new BajarPincel();
        Accion subir = new SubirPincel();
        EstadoPincel aux = new PincelAbajo();
        EstadoPincel auxArriba = new PincelArriba();
        assertEquals(auxArriba.getClass(),personaje.devolverEstadoPincel().getClass());
        accion.aplicarAccion(personaje);
        assertEquals(aux.getClass(),personaje.devolverEstadoPincel().getClass());
        subir.aplicarAccion(personaje);
        assertEquals(auxArriba.getClass(),personaje.devolverEstadoPincel().getClass());
    }
}
