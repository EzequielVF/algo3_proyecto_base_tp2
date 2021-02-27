package edu.fiuba.algo3;

import edu.fiuba.algo3.interfaz.CampoDeJuego;
import edu.fiuba.algo3.interfaz.VentanaPresentacion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * JavaFX App
 */
public class App extends Application {
    private static final String RUTA_ICONO = "logo.png";
    private static final int ANCHO = 500;
    private static final int ALTO = 500;
    private static final String nombreVentana = "Tp2 - AlgoBlocks - Grupo 6";


    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) {
        VentanaPresentacion ventanaPresentacion = new VentanaPresentacion(stage);
        Scene presentacion = new Scene(ventanaPresentacion, ANCHO, ALTO);

        stage.setScene(presentacion);
        stage.setTitle(nombreVentana);
        Image imagen = new Image(RUTA_ICONO);
        stage.getIcons().add(imagen);
        stage.show();
    }
}