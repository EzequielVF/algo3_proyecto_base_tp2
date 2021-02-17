package edu.fiuba.algo3.modelo.excepciones;

public class AlgoritmoNoTieneAccionesTodaviaExcepcion extends RuntimeException{
    public String getMessage(){
        return "El Algoritmo esta vacio";
    }
}
