package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.interfaz.botones.*;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.ArrayList;

public class BotonesDisponibles extends VBox {
    private Consola consola;
    private Juego juego;

    public BotonesDisponibles(Consola consola, Juego juego) {
        this.setSpacing(50);
        this.consola = consola;
        this.juego = juego;
        this.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, new CornerRadii(78), new Insets(-5.0))));

        Label titulo = new Label("Acciones Disponibles");
        titulo.setMaxWidth(Double.MAX_VALUE);
        titulo.setAlignment(Pos.CENTER);
        titulo.setTextFill(Color.BLACK);
        titulo.setStyle("-fx-background-color: rgb(252, 252, 3);");
        titulo.setFont(Font.font("Times",14));

        ArrayList<Accion> AccionesDisponibles = juego.devolverAcciones();

        Button botonEjecutar = new Button();
        botonEjecutar.setText("Ejecutar");

        BotonEjecutarEventhandler botonEjecutarHandler = new BotonEjecutarEventhandler(juego, consola);
        botonEjecutar.setOnAction(botonEjecutarHandler);

        Button botonSalir = new Button();
        botonSalir.setText("Salir");
        botonSalir.setOnAction(actionEvent -> Platform.exit());

        //Configuracion Boton Algoritmo personalizado//
        Button botonGuardarAlgoritmo = new Button();
        botonGuardarAlgoritmo.setText("Guardar este Algoritmo");

        TextField NombreAlgoritmo = new TextField();
        MenuButton AlgoritmosGuardados = new MenuButton("Algoritmos Guardados");

        BotonGuardarAlgoritmoEventHandler botonGuardarHandler = new BotonGuardarAlgoritmoEventHandler(juego, consola, NombreAlgoritmo, AlgoritmosGuardados);
        botonGuardarAlgoritmo.setOnAction(botonGuardarHandler);

        //-----------------------------------------------------------//
        MenuButton repetirPorDos = new MenuButton("Repetir Por Dos");
        MenuButton repetirPorTres = new MenuButton("Repetir Por Tres");
        MenuButton invertirComportamiento = new MenuButton("Invertir Comportamiento");

        RepetirPorDos repetirPorDosBloque = new RepetirPorDos();
        RepetirPorTres repetirPorTresBloque = new RepetirPorTres();
        InvertirComportamiento invertirComportamientoBloque = new InvertirComportamiento();

        crearBloquerepetible(AccionesDisponibles,repetirPorDosBloque,repetirPorDos);
        crearBloquerepetible(AccionesDisponibles,repetirPorTresBloque,repetirPorTres);
        crearBloquerepetible(AccionesDisponibles,invertirComportamientoBloque,invertirComportamiento);

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

        HBox botonera = new HBox(botonEjecutar, botonSalir);
        botonera.setAlignment( Pos.CENTER );
        botonera.setSpacing( 50 );
        VBox botoneraAcciones = new VBox(titulo,AlgoritmosGuardados,NombreAlgoritmo,botonGuardarAlgoritmo,repetirPorDos,repetirPorTres,invertirComportamiento);

        //Agrega los bostones de acciones simples//
        for (Accion accion :AccionesDisponibles) {
            Button button = new Button();
            button.setText(accion.devolverNombre());
            BotonAccionEventhandler eventHandler = new BotonAccionEventhandler(juego, accion, consola);
            button.setOnAction(eventHandler);
            botoneraAcciones.getChildren().add(button);
        }

        botoneraAcciones.setAlignment( Pos.CENTER );
        botoneraAcciones.setSpacing( 10 );
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
