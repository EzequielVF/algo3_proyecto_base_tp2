package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import edu.fiuba.algo3.modelo.pincel.EstadoPincel;
import edu.fiuba.algo3.modelo.pincel.PincelAbajo;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
//import org.apache.commons.lang.SerializationUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AreaDeDibujado extends GridPane implements Observer {

    private Posicion posicion;
    private EstadoPincel pincelAbajo;
    private Juego juego;

    private NumberAxis xAxis = new NumberAxis(-5,5,1);
    private NumberAxis yAxis = new NumberAxis(-5,5,1);
    private XYChart.Series seriePosiciones;

    private LineChart lineChart = new LineChart(xAxis,yAxis);

    public AreaDeDibujado(Juego juego){

        this.getChildren().add(lineChart);
        this.juego = juego;
        this.posicion = juego.devolverReferenciaPosicion();
        this.pincelAbajo = juego.devolverEstadoPincel();


        posicion.addObserver((Observer) this);
    }

    public void change(){
        seriePosiciones = new XYChart.Series();
        //ArrayList<XYChart.Series> seriePosiciones2 = seriePosiciones.getData().stream().collect(Collectors.toList());
        //XYChart.Series seriePosiciones2 = SerializationUtils.clone(this.seriePosiciones);
        seriePosiciones.getData().add(new XYChart.Data(posicion.devolverColumna(), posicion.devolverFila()));
        this.lineChart.getData().add(seriePosiciones);
    }
}
