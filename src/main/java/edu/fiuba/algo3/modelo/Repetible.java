package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Repetible implements Accion {
        public List<Accion> accionesAEjecutar = new ArrayList();
        public abstract void aplicarAccion(Personaje personaje);

        public void almacenarAccion(Accion accion){
            accionesAEjecutar.add(accion);
        }
}



