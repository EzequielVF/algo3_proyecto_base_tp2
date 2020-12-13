package edu.fiuba.algo3.modelo;

public class Posicion {
    public int fila = 0;
    public int columna = 0;

    public int devolverPosicion(){
        return (((fila-1) * 5)+ columna);
    }

    public void sumarAColumna(){
        columna++;
    }
    public void restarAColumna(){
        columna--;
    }
    public void sumarAFila(){ fila ++;}
    public void restarAFila(){ fila --;}
}
