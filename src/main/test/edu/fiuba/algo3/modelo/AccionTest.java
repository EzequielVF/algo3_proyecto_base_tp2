package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccionTest {
    @Test
    public void PruebaMoverALaderechaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
    }
    @Test
    public void PruebaMoverALaIzquierdaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaIzquierda();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
    }
    @Test
    public void PruebaMoverArribaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverArriba();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.restarAFila();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
    }
    @Test
    public void PruebaMoverAbajoModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverAbajo();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.sumarAFila();
        assertEquals(posicion.hashCode(),personaje.posicionActual());
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
