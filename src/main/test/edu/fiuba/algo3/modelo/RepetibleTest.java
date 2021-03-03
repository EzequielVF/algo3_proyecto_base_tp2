package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.modelo.actoresPrincipales.Personaje;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.excepciones.RepetibleNoTieneAccionesTodaviaExcepcion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RepetibleTest {
    @Test
    public void PruebaTransferirAccionesVaciasLanzaError(){
        Algoritmo algoritmo = new Algoritmo();
        Algoritmo aux = new Algoritmo();
        assertThrows(RepetibleNoTieneAccionesTodaviaExcepcion.class, () -> {
            algoritmo.transferirAcciones(aux);
        });
    }
    @Test
    public void PruebaTransferirAccionesTransfiereLasAcciones(){
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.almacenarAccion(new MoverALaDerecha());
        Algoritmo aux = new Algoritmo();
        algoritmo.transferirAcciones(aux);
        aux.aplicarAccion(personaje);
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

    @Test
    public void PruebaCopiarGeneraUnNuevorepetibleYEliminaLasAccionesEnElAnterior(){
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        Algoritmo algoritmo = new Algoritmo();
        algoritmo.almacenarAccion(new MoverALaDerecha());
        Repetible aux = algoritmo.copiar();
        aux.aplicarAccion(personaje);
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        algoritmo.aplicarAccion(personaje);
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }
    @Test
    public void PruebaCopiarEnRepetirPorDosGeneraUnNuevorepetibleYEliminaLasAccionesEnElAnterior(){
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        RepetirPorDos algoritmo = new RepetirPorDos();
        algoritmo.almacenarAccion(new MoverALaDerecha());
        Repetible aux = algoritmo.copiar();
        aux.aplicarAccion(personaje);
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        algoritmo.aplicarAccion(personaje);
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }
    @Test
    public void PruebaCopiarEnRepetirPorTresGeneraUnNuevorepetibleYEliminaLasAccionesEnElAnterior(){
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        RepetirPorTres algoritmo = new RepetirPorTres();
        algoritmo.almacenarAccion(new MoverALaDerecha());
        Repetible aux = algoritmo.copiar();
        aux.aplicarAccion(personaje);
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        posicion.sumarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        algoritmo.aplicarAccion(personaje);
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }
    @Test
    public void PruebaCopiarEnInvertirComporamientoGeneraUnNuevorepetibleYEliminaLasAccionesEnElAnterior(){
        Personaje personaje = new Personaje();
        Posicion posicion = new Posicion();
        InvertirComportamiento algoritmo = new InvertirComportamiento();
        algoritmo.almacenarAccion(new MoverALaDerecha());
        Repetible aux = algoritmo.copiar();
        aux.aplicarAccion(personaje);
        posicion.restarAColumna();
        assertEquals(posicion.hashCode(), personaje.posicionActual());
        algoritmo.aplicarAccion(personaje);
        assertEquals(posicion.hashCode(), personaje.posicionActual());
    }

}
