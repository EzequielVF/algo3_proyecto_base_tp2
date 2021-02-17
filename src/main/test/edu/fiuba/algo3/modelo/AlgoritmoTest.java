package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.acciones.Algoritmo;
import edu.fiuba.algo3.modelo.excepciones.AlgoritmoNoTieneAccionesTodaviaExcepcion;
import org.junit.jupiter.api.Test;

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

}
