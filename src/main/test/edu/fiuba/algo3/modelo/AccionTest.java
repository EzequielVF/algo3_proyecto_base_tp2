package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccionTest {
    @Test
    public void PruebaMoverALaderechaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaMoverALaIzquierdaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaIzquierda();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaMoverArribaModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverArriba();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.restarAFila();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaMoverAbajoModificaCorrectamenteLaPosicion() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverAbajo();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        accion.aplicarAccion(personaje);
        posicion.sumarAFila();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaBajarPincelCambiaCorrectamenteElEstadoDelPincel() {
        Personaje personaje = new Personaje();
        Accion accion = new BajarPincel();
        EstadoPincel pincelAbajo = new PincelAbajo();
        EstadoPincel pincelArriba = new PincelArriba();
        assertEquals(pincelArriba.getClass(), personaje.devolverEstadoPincel().getClass());
        accion.aplicarAccion(personaje);
        assertEquals(pincelAbajo.getClass(), personaje.devolverEstadoPincel().getClass());
    }

    @Test
    public void PruebaSubirPincelCambiaCorrectamenteElEstadoDelPincel() {
        Personaje personaje = new Personaje();
        Accion accion = new BajarPincel();
        Accion subir = new SubirPincel();
        EstadoPincel pincelAbajo = new PincelAbajo();
        EstadoPincel pincelArriba = new PincelArriba();
        assertEquals(pincelArriba.getClass(), personaje.devolverEstadoPincel().getClass());
        accion.aplicarAccion(personaje);
        assertEquals(pincelAbajo.getClass(), personaje.devolverEstadoPincel().getClass());
        subir.aplicarAccion(personaje);
        assertEquals(pincelArriba.getClass(), personaje.devolverEstadoPincel().getClass());
    }

    @Test
    public void PruebaRepetirPorDosModificaCorrectamenteLaPosicionDelPersonaje() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        RepetirPorDos repetirPorDos = new RepetirPorDos();
        repetirPorDos.almacenarAccion(new MoverALaDerecha());
        repetirPorDos.aplicarAccion(personaje);
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaRepetirPorTresModificaCorrectamenteLaPosicionDelPersonaje() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        RepetirPorTres repetirPorTres = new RepetirPorTres();
        repetirPorTres.almacenarAccion(new MoverALaDerecha());
        repetirPorTres.aplicarAccion(personaje);
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaInvertirComportamientoModificaCorrectamenteLaPosicionDelPersonaje() {
        Personaje personaje = new Personaje();
        Accion accion = new MoverALaDerecha();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        InvertirComportamiento invertirComportamiento = new InvertirComportamiento();
        invertirComportamiento.almacenarAccion(new MoverALaDerecha());
        invertirComportamiento.aplicarAccion(personaje);
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }
}
