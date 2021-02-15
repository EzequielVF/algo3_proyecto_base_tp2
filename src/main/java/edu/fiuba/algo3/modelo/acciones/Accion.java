package edu.fiuba.algo3.modelo.acciones;

import edu.fiuba.algo3.modelo.Personaje;

import java.util.List;

public interface Accion {
    public void aplicarAccion(Personaje personaje);
    public void aplicarAccionInversa(Personaje personaje);
    public String devolverNombre();
}
