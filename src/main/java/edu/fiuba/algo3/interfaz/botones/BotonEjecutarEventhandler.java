package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.*;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.XYChart;

public class BotonEjecutarEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Consola consola;
    private AreaDeDibujado lineChart;

    public BotonEjecutarEventhandler(Juego juego, Consola consola, AreaDeDibujado lineChart){
        this.juego = juego;
        this.consola = consola;
        this.lineChart = lineChart;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.ejecutar();
        consola.escribir("Algoritmo ejecutado");
        System.out.println(this.juego.devolverCeldasPintadas());


        XYChart.Series dataSeries1 = new XYChart.Series();

        dataSeries1.getData().add(new XYChart.Data( 0, 0));
        dataSeries1.getData().add(new XYChart.Data( 1, 0));
        dataSeries1.getData().add(new XYChart.Data(1, 1));
        dataSeries1.getData().add(new XYChart.Data(2, 1));

        this.lineChart.agregar(dataSeries1);
        this.juego.limpiar();
    }
}