package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.acciones.Algoritmo;
import edu.fiuba.algo3.modelo.acciones.MoverALaDerecha;
import edu.fiuba.algo3.modelo.acciones.MoverAbajo;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.excepciones.AlgoritmoNoTieneAccionesTodaviaExcepcion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlgoritmoTest {
    @Test
    public void PruebaTransferirAccionesVaciasLanzaError(){
        Algoritmo algoritmo = new Algoritmo();
        Algoritmo aux = new Algoritmo();
        assertThrows(AlgoritmoNoTieneAccionesTodaviaExcepcion.class, () -> {
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
        assertThrows(AlgoritmoNoTieneAccionesTodaviaExcepcion.class, () -> {
            algoritmo.aplicarAccion(personaje);
        });
    }
}
