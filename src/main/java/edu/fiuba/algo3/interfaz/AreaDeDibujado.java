package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.Controlador.ObservadorPincel;
import edu.fiuba.algo3.Controlador.Observer;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.pincel.EstadoPincel;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

public class AreaDeDibujado extends GridPane implements Observer {

    private final Posicion posicion;
    private EstadoPincel pincel;
    private final Juego juego;

    private final NumberAxis xAxis = new NumberAxis(-5,5,1);
    private final NumberAxis yAxis = new NumberAxis(-5,5,1);
    private ArrayList<XYChart.Series> seriePosiciones = new ArrayList<>();

    private LineChart lineChart = new LineChart(xAxis,yAxis);
    private ObservadorPincel observadorPincel;

    public AreaDeDibujado(Juego juego){
        this.getStylesheets().add(getClass().getResource("/edu.fiuba.algo3/LineChart.css").toExternalForm());
        seriePosiciones.add(new XYChart.Series());
        this.getChildren().add(lineChart);
        this.juego = juego;
        observadorPincel = new ObservadorPincel(this.juego,this);
        this.posicion = juego.devolverReferenciaPosicion();
        this.pincel = observadorPincel.devolverEstadoPincel();

        this.lineChart.getData().add(seriePosiciones.get(seriePosiciones.size()-1));
        this.lineChart.setTitle("Tablero");
        this.lineChart.setAxisSortingPolicy(LineChart.SortingPolicy.NONE);
        this.lineChart.setLegendVisible(false);
    }

    public void nuevaSerie(){
        seriePosiciones.add(new XYChart.Series());
        this.lineChart.getData().add(seriePosiciones.get(seriePosiciones.size()-1));
    }

    public void change(){
        seriePosiciones.get(seriePosiciones.size()-1).getData().add(new XYChart.Data(posicion.devolverColumna(), posicion.devolverFila()));
        columnas.add(posicion.devolverColumna());
        filas.add(posicion.devolverFila());
        xAxis.setLowerBound(Math.min(xAxis.getLowerBound(),Collections.min(columnas) -1));
        xAxis.setUpperBound(Math.max(xAxis.getUpperBound(),Collections.max(columnas) +1));
        yAxis.setLowerBound(Math.min(yAxis.getLowerBound(),Collections.min(filas) -1));
        yAxis.setUpperBound(Math.max(yAxis.getUpperBound(),Collections.max(filas) +1));

    }

    private ArrayList<Integer> columnas = new ArrayList<>();
    private ArrayList<Integer> filas = new ArrayList<>();
}
