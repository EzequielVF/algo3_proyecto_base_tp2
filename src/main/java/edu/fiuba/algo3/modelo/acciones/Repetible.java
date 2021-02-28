package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.excepciones.RepetibleNoTieneAccionesTodaviaExcepcion;

import java.util.ArrayList;
import java.util.List;

public abstract class Repetible implements Accion {
        public List<Accion> accionesAEjecutar = new ArrayList();
        public abstract void aplicarAccion(Personaje personaje);

        public void almacenarAccion(Accion accion){
            accionesAEjecutar.add(accion);
        }

        public void transferirAcciones(Repetible repetible){

            if(accionesAEjecutar.isEmpty()){ throw new RepetibleNoTieneAccionesTodaviaExcepcion();}//cambiar Excepcion
            for(Accion accion: accionesAEjecutar){
                repetible.almacenarAccion(accion);
            }
        };

        public abstract Repetible copiar();
}



