package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.excepciones.NombreNoValidoParaAlgoritmoExcepcion;
import edu.fiuba.algo3.modelo.pincel.EstadoPincel;
import edu.fiuba.algo3.modelo.pincel.PincelAbajo;
import edu.fiuba.algo3.modelo.pincel.PincelArriba;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {
    @Test
    public void PruebaMoverALaderecha() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverALaDerecha());
        juego.ejecutar();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverALaIzquierda() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverALaIzquierda());
        juego.ejecutar();
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverArriba() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverArriba());
        juego.ejecutar();
        posicion.sumarAFila();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaMoverAbajo() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        assertEquals(posicion.hashCode(),juego.devolverPosicionActualPersonaje());
        juego.agregarAccion(new MoverAbajo());
        juego.ejecutar();
        posicion.restarAFila();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }
    @Test
    public void PruebaEstadoInicialPincelArriba() {
        Juego juego = new Juego();
        EstadoPincel pincelArriba = new PincelArriba();
        assertEquals(pincelArriba.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarPincel() {
        Juego juego = new Juego();
        EstadoPincel pincelAbajo = new PincelAbajo();
        juego.agregarAccion(new BajarPincel());
        juego.ejecutar();
        assertEquals(pincelAbajo.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaBajarYSubirPincel() {
        Juego juego = new Juego();
        EstadoPincel pincelArriba = new PincelArriba();
        juego.agregarAccion(new BajarPincel());
        juego.agregarAccion(new SubirPincel());
        juego.ejecutar();
        assertEquals(pincelArriba.getClass(),(juego.devolverEstadoPincel().getClass()));
    }
    @Test
    public void PruebaCantidadDeCeldasPintadasCorrecta() {
        Juego juego = new Juego();
        juego.agregarAccion(new BajarPincel());
        juego.agregarAccion(new MoverALaDerecha());
        juego.agregarAccion(new MoverALaDerecha());
        juego.ejecutar();
        assertEquals(3,(juego.devolverCeldasPintadas()));
    }

    @Test
    public void PruebaRepetirPorDos() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        RepetirPorDos repetirPorDos = new RepetirPorDos();
        repetirPorDos.almacenarAccion(new MoverALaDerecha());
        juego.agregarAccion(repetirPorDos);
        juego.ejecutar();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }

    @Test
    public void PruebaRepetirPorTres() {
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        RepetirPorTres repetirPorTres = new RepetirPorTres();
        repetirPorTres.almacenarAccion(new MoverALaDerecha());
        juego.agregarAccion(repetirPorTres);
        juego.ejecutar();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }

    @Test
    public void PruebaAccionInversa(){
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        InvertirComportamiento invertircomportamiento = new InvertirComportamiento();
        invertircomportamiento.almacenarAccion(new MoverALaDerecha());
        juego.agregarAccion(invertircomportamiento);
        juego.ejecutar();
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }

    @Test
    public void PruebaAlgoritmoPersonalizado(){
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        String nombre = "Mover a la derecha 2 veces";
        juego.agregarAccion(new MoverALaDerecha());
        juego.agregarAccion(new MoverALaDerecha());
        juego.crearAlgoritmoPersonalizado(nombre);
        juego.usarAlgoritmoPersonalizado(nombre);
        juego.ejecutar();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), juego.devolverPosicionActualPersonaje());
    }

    @Test
    public void PruebaDibujarCorrectamenteUnCuadrado(){
        Juego juego = new Juego();
        Posicion posicion = new Posicion();
        juego.agregarAccion(new BajarPincel());
        juego.agregarAccion(new MoverALaDerecha());
        juego.agregarAccion(new MoverAbajo());
        juego.agregarAccion(new MoverALaIzquierda());
        juego.agregarAccion(new MoverArriba());
        juego.ejecutar();
        assertTrue(juego.posicionPintada(posicion));
        posicion.sumarAColumna();
        assertTrue(juego.posicionPintada(posicion));
        posicion.restarAFila();
        assertTrue(juego.posicionPintada(posicion));
        posicion.restarAColumna();
        assertTrue(juego.posicionPintada(posicion));
    }

    @Test
    public void PruebaCrearAlgoritmoPersonalizadoTextoVacio(){
        Juego juego = new Juego();
        assertThrows(NombreNoValidoParaAlgoritmoExcepcion.class, () -> {
            juego.crearAlgoritmoPersonalizado("");
        });
    }
}
