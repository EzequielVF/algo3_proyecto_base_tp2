package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.modelo.botones.*;
import javafx.geometry.Pos;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class BotonesDisponibles extends VBox {
    private Consola consola;
    private AreaDeDibujado areaDeDibujado;
    private Juego juego = new Juego();

    public BotonesDisponibles(Consola consola,AreaDeDibujado areaDeDibujado) {

        this.consola = consola;
        this.areaDeDibujado = areaDeDibujado;

        Label titulo = new Label("Acciones Disponibles");

        ArrayList<Accion> AccionesDisponibles = juego.DevolverAcciones();




        Button botonEjecutar = new Button();
        botonEjecutar.setText("Ejecutar");

        BotonEjecutarEventhandler botonEjecutarHandler = new BotonEjecutarEventhandler(juego, consola,areaDeDibujado);
        botonEjecutar.setOnAction(botonEjecutarHandler);

        Button botonDevolverCeldasPintadas = new Button();
        botonDevolverCeldasPintadas.setText("devolverCeldasPintadas");

        BotonDevolverCeldasPintadasEventhandler botonDevolverCeldasPintadasHandler = new BotonDevolverCeldasPintadasEventhandler(juego);
        botonDevolverCeldasPintadas.setOnAction(botonDevolverCeldasPintadasHandler);

        Button botonGuardarAlgoritmo = new Button();
        botonGuardarAlgoritmo.setText("Guardar este Algoritmo");

        TextField NombreAlgoritmo = new TextField();
        MenuButton AlgoritmosGuardados = new MenuButton("Algoritmos Guardados");

        BotonGuardarAlgoritmoEventHandler botonGuardarHandler = new BotonGuardarAlgoritmoEventHandler(juego, consola, NombreAlgoritmo, AlgoritmosGuardados);
        botonGuardarAlgoritmo.setOnAction(botonGuardarHandler);


        MenuButton repetirPorDos = new MenuButton("Repetir Por Dos");
        MenuButton repetirPorTres = new MenuButton("Repetir Por Tres");
        MenuButton invertirComportamiento = new MenuButton("Invertir Comportamiento");


        RepetirPorDos repetirPorDosBloque = new RepetirPorDos();
        RepetirPorTres repetirPorTresBloque = new RepetirPorTres();
        InvertirComportamiento invertirComportamientoBloque = new InvertirComportamiento();

        for (Accion accion :AccionesDisponibles) {
            MenuItem acciones = new MenuItem(accion.devolverNombre());
            BotonRepetibleEventhandler botonUsardarHandler = new BotonRepetibleEventhandler(juego, accion, consola,repetirPorTresBloque);
            acciones.setOnAction(botonUsardarHandler);

            repetirPorTres.getItems().add(acciones);
        }
        for (Accion accion :AccionesDisponibles) {
            MenuItem acciones = new MenuItem(accion.devolverNombre());
            BotonRepetibleEventhandler botonAccionEventhandler = new BotonRepetibleEventhandler(juego, accion, consola,invertirComportamientoBloque);
            acciones.setOnAction(botonAccionEventhandler);

            invertirComportamiento.getItems().add(acciones);
        }
        for (Accion accion :AccionesDisponibles) {
            MenuItem acciones = new MenuItem(accion.devolverNombre());
            BotonRepetibleEventhandler botonRepetibleEventhandler = new BotonRepetibleEventhandler(juego, accion, consola,repetirPorDosBloque);
            acciones.setOnAction(botonRepetibleEventhandler);

            repetirPorDos.getItems().add(acciones);
        }

        MenuItem guardarRepetiblePorDos = new MenuItem("Almacenar");
        BotonAlmacenarRepetibleEventhandler botonAlmacenarRepetiblePorDosEventhandler = new BotonAlmacenarRepetibleEventhandler(juego,consola,repetirPorDosBloque);
        guardarRepetiblePorDos.setOnAction(botonAlmacenarRepetiblePorDosEventhandler);
        repetirPorDos.getItems().add(guardarRepetiblePorDos);

        MenuItem guardarRepetibleTres = new MenuItem("Almacenar");
        BotonAlmacenarRepetibleEventhandler botonAlmacenarRepetiblePorTresEventhandler = new BotonAlmacenarRepetibleEventhandler(juego,consola,repetirPorTresBloque);
        guardarRepetibleTres.setOnAction(botonAlmacenarRepetiblePorTresEventhandler);
        repetirPorTres.getItems().add(guardarRepetibleTres);

        MenuItem guardarRepetibleInvertir = new MenuItem("Almacenar");
        BotonAlmacenarRepetibleEventhandler botonAlmacenarRepetibleInvertirEventhandler = new BotonAlmacenarRepetibleEventhandler(juego,consola,invertirComportamientoBloque);
        guardarRepetibleInvertir.setOnAction(botonAlmacenarRepetibleInvertirEventhandler);
        invertirComportamiento.getItems().add(guardarRepetibleInvertir);


        VBox botonera = new VBox(titulo, botonEjecutar, botonDevolverCeldasPintadas,AlgoritmosGuardados,NombreAlgoritmo,botonGuardarAlgoritmo,repetirPorDos,repetirPorTres,invertirComportamiento);

        for (Accion accion :AccionesDisponibles) {
            Button button = new Button();
            button.setText(accion.devolverNombre());
            BotonAccionEventhandler eventHandler = new BotonAccionEventhandler(juego, accion, consola);
            button.setOnAction(eventHandler);
            botonera.getChildren().add(button);
        }
        botonera.setAlignment( Pos.CENTER );
        botonera.setSpacing( 10 );
        this.getChildren().add(botonera);
    }

}
