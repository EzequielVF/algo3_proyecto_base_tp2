package edu.fiuba.algo3.interfaz;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;

public class AreaDeDibujado extends GridPane{
    private NumberAxis xAxis = new NumberAxis(-5,5,1);
    private NumberAxis yAxis = new NumberAxis(-5,5,1);
    private LineChart lineChart = new LineChart(xAxis,yAxis);

    public AreaDeDibujado(){
        this.getChildren().add(lineChart);
    }
    public void agregar(XYChart.Series datos){
        this.lineChart.getData().add(datos);
    }
}
