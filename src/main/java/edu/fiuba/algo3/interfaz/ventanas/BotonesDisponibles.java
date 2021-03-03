package edu.fiuba.algo3.interfaz.ventanas;

import edu.fiuba.algo3.interfaz.ventanas.Consola;
import edu.fiuba.algo3.modelo.actoresPrincipales.Juego;
import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.interfaz.botones.*;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class BotonesDisponibles extends VBox {
    private Consola consola;
    private Juego juego;

    public BotonesDisponibles(Consola consola, Juego juego) {
        this.setSpacing(50);
        this.consola = consola;
        this.juego = juego;
        this.getChildren().add(consola);
        this.getStylesheets().add("style.css");
        this.getStyleClass().add("panel");

        Label titulo = new Label("Acciones Disponibles");
        titulo.getStyleClass().add("titulo");

        ArrayList<Accion> AccionesDisponibles = juego.devolverAcciones();

        //Seteo boton ejecutar
        Button botonEjecutar = new Button();
        botonEjecutar.getStyleClass().add("botonEjecutar");
        botonEjecutar.setText("Ejecutar");
        BotonEjecutarEventhandler botonEjecutarHandler = new BotonEjecutarEventhandler(juego, consola);
        botonEjecutar.setOnAction(botonEjecutarHandler);

        //Seteo boton salir
        Button botonSalir = new Button();
        botonSalir.getStyleClass().add("botonSalir");
        botonSalir.setText("Salir");
        botonSalir.setOnAction(actionEvent -> Platform.exit());

        //Agrego Salir y Ejecutar a una botonera
        HBox botonera = new HBox(botonEjecutar, botonSalir);
        botonera.setAlignment( Pos.CENTER );
        botonera.setSpacing( 50 );

        //Configuracion Boton Algoritmo personalizado//
        Button botonGuardarAlgoritmo = new Button();
        botonGuardarAlgoritmo.getStyleClass().add("botones");
        botonGuardarAlgoritmo.setText("Guardar este Algoritmo");

        TextField NombreAlgoritmo = new TextField();
        NombreAlgoritmo.getStyleClass().add("botones");
        MenuButton AlgoritmosGuardados = new MenuButton("Algoritmos Guardados");
        AlgoritmosGuardados.getStyleClass().add("botones");

        BotonGuardarAlgoritmoEventHandler botonGuardarHandler = new BotonGuardarAlgoritmoEventHandler(juego, consola, NombreAlgoritmo, AlgoritmosGuardados);
        botonGuardarAlgoritmo.setOnAction(botonGuardarHandler);

        //Seteo los botones repetibles
        MenuButton repetirPorDos = new MenuButton("Repetir Por Dos");
        repetirPorDos.getStyleClass().add("botones");
        MenuButton repetirPorTres = new MenuButton("Repetir Por Tres");
        repetirPorTres.getStyleClass().add("botones");
        MenuButton invertirComportamiento = new MenuButton("Invertir Comportamiento");
        invertirComportamiento.getStyleClass().add("botones");

        RepetirPorDos repetirPorDosBloque = new RepetirPorDos();
        RepetirPorTres repetirPorTresBloque = new RepetirPorTres();
        InvertirComportamiento invertirComportamientoBloque = new InvertirComportamiento();

        crearBloquerepetible(AccionesDisponibles,repetirPorDosBloque,repetirPorDos);
        crearBloquerepetible(AccionesDisponibles,repetirPorTresBloque,repetirPorTres);
        crearBloquerepetible(AccionesDisponibles,invertirComportamientoBloque,invertirComportamiento);

        //Relleno los botones menu de los repetibles
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

        //Agrego los botones a una VBox
        VBox botoneraAcciones = new VBox(titulo,AlgoritmosGuardados,NombreAlgoritmo,botonGuardarAlgoritmo,repetirPorDos,repetirPorTres,invertirComportamiento);
        botoneraAcciones.setAlignment( Pos.CENTER );
        botoneraAcciones.setSpacing( 10 );

        //Agrego los botones de acciones simples//
        for (Accion accion :AccionesDisponibles) {
            Button button = new Button();
            button.setText(accion.devolverNombre());
            button.getStyleClass().add("botones");
            BotonAccionEventhandler eventHandler = new BotonAccionEventhandler(juego, accion, consola);
            button.setOnAction(eventHandler);
            botoneraAcciones.getChildren().add(button);
        }
        this.getChildren().addAll(botonera, botoneraAcciones);
    }

    private void crearBloquerepetible(ArrayList<Accion> AccionesDisponibles, Repetible repetible, MenuButton repetibleButton) {
        //Meto los items dentro del Boton menu//
        for (Accion accion :AccionesDisponibles) {
            MenuItem acciones = new MenuItem(accion.devolverNombre());
            BotonRepetibleEventhandler botonUsardarHandler = new BotonRepetibleEventhandler(accion, consola,repetible);
            acciones.setOnAction(botonUsardarHandler);

            repetibleButton.getItems().add(acciones);
        }
    }
}
