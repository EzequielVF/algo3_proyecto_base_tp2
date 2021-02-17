package edu.fiuba.algo3;

import edu.fiuba.algo3.interfaz.CampoDeJuego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {


    private static final String nombreVentana = "Tp2 - AlgoBlocks - Grupo 6";

    @Override
    public void start(Stage stage) {

        CampoDeJuego tablero = new CampoDeJuego();

        var scene = new Scene(tablero, 1100, 800);

        stage.setTitle(nombreVentana);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}