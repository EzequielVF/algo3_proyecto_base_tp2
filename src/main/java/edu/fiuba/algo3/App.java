package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.acciones.*;
import edu.fiuba.algo3.modelo.botones.BotonAccionEventhandler;
import edu.fiuba.algo3.modelo.botones.BotonDevolverCeldasPintadasEventhandler;
import edu.fiuba.algo3.modelo.botones.BotonEjecutarEventhandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("AlgoBlocks");
        Juego juego = new Juego();

        Label consola = new Label();

        Button botonMoverALaDerecha = new Button();
        botonMoverALaDerecha.setText("Mover a la derecha");
        Button botonMoverALaIzquierda = new Button();
        botonMoverALaIzquierda.setText("Mover a la izquierda");
        Button botonMoverArriba = new Button();
        botonMoverArriba.setText("Mover arriba");
        Button botonMoverAbajo = new Button();
        botonMoverAbajo.setText("Mover abajo");
        Button botonSubirPincel = new Button();
        botonSubirPincel.setText("Subir pincel");
        Button botonBajarPincel = new Button();
        botonBajarPincel.setText("Bajar pincel");
        Button botonEjecutar = new Button();
        botonEjecutar.setText("Ejecutar");

        Button botonDevolverCeldasPintadas = new Button();
        botonDevolverCeldasPintadas.setText("devolverCeldasPintadas");


        HBox contenedorHorizontal = new HBox(botonMoverALaDerecha, botonMoverALaIzquierda, botonMoverArriba, botonMoverAbajo, botonSubirPincel, botonBajarPincel, botonEjecutar, botonDevolverCeldasPintadas);
        contenedorHorizontal.setSpacing(10);

        VBox contenedorPrincipal = new VBox(contenedorHorizontal, consola);
        contenedorPrincipal.setSpacing(10);

        BotonEjecutarEventhandler botonEjecutarHandler = new BotonEjecutarEventhandler(juego, consola);
        botonEjecutar.setOnAction(botonEjecutarHandler);

        BotonAccionEventhandler botonMoverALaDerechahandler = new BotonAccionEventhandler(juego, new MoverALaDerecha(), consola);
        botonMoverALaDerecha.setOnAction(botonMoverALaDerechahandler);

        BotonAccionEventhandler botonMoverALaIzquierdahandler = new BotonAccionEventhandler(juego, new MoverALaIzquierda(), consola);
        botonMoverALaIzquierda.setOnAction(botonMoverALaIzquierdahandler);

        BotonAccionEventhandler botonMoverArribahandler = new BotonAccionEventhandler(juego, new MoverArriba(), consola);
        botonMoverArriba.setOnAction(botonMoverArribahandler);

        BotonAccionEventhandler botonMoverAbajohandler = new BotonAccionEventhandler(juego, new MoverAbajo(), consola);
        botonMoverAbajo.setOnAction(botonMoverAbajohandler);

        BotonAccionEventhandler botonSubirPincelHandler = new BotonAccionEventhandler(juego, new SubirPincel(), consola);
        botonSubirPincel.setOnAction(botonSubirPincelHandler);

        BotonAccionEventhandler botonBajarPincelHandler = new BotonAccionEventhandler(juego, new BajarPincel(), consola);
        botonBajarPincel.setOnAction(botonBajarPincelHandler);

        BotonDevolverCeldasPintadasEventhandler botonDevolverCeldasPintadasHandler = new BotonDevolverCeldasPintadasEventhandler(juego);
        botonDevolverCeldasPintadas.setOnAction(botonDevolverCeldasPintadasHandler);

        Scene scene = new Scene(contenedorPrincipal, 1000, 1000);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}