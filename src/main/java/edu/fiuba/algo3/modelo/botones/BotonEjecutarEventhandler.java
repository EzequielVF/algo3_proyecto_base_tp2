package edu.fiuba.algo3.modelo.botones;

import edu.fiuba.algo3.interfaz.*;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

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
        XYChart.Series dataSeries1 = new XYChart.Series();

        dataSeries1.getData().add(new XYChart.Data( 0, 0));
        dataSeries1.getData().add(new XYChart.Data( 1, 0));
        dataSeries1.getData().add(new XYChart.Data(1, 1));
        dataSeries1.getData().add(new XYChart.Data(2, 1));

        this.lineChart.agregar(dataSeries1);
    }
}