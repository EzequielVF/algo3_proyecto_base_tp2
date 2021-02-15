package edu.fiuba.algo3.modelo;

import java.util.List;

public interface Accion {
    public void aplicarAccion(Personaje personaje);
    public void aplicarAccionInversa(Personaje personaje);
    public String devolverNombre();
}
