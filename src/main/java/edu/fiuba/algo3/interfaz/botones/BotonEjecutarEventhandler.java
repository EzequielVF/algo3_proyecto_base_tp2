package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.*;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.XYChart;

public class BotonEjecutarEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Consola consola;

    public BotonEjecutarEventhandler(Juego juego, Consola consola){
        this.juego = juego;
        this.consola = consola;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.ejecutar();
        consola.escribir("Algoritmo ejecutado");
        System.out.println(this.juego.devolverCeldasPintadas());
        this.juego.limpiar();
    }
}