package edu.fiuba.algo3.modelo;
import java.util.ArrayList;
import java.util.List;


public class RepetirPorDos implements Accion{

    public List<Accion> AccionesARepetir = new ArrayList();

    public void aplicarAccion(Personaje personaje){
        for(Accion accion: AccionesARepetir){
            accion.aplicarAccion(personaje);
            accion.aplicarAccion(personaje);
        }
    }

    public void almacenarAccion(Accion accion){
        AccionesARepetir.add(accion);
    }

    public String nombre(){
        return "Repetir por dos.";
    }

}

