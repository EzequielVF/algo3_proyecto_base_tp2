package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.App;
import edu.fiuba.algo3.interfaz.botones.BotonJugarEventHandler;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class VentanaPresentacion extends VBox {
    private static final String RUTA_ICONO = "logo.png";
    private static final int ANCHO = 250;
    private static final int ALTO = 250;
    private Stage stage; // si falla mirar acar

    public VentanaPresentacion(Stage stage){
       this.stage = stage;
        this.setAlignment(Pos.CENTER);

        Button botonJugar = new Button();
        Button botonSalir = new Button();
        botonSalir.setText("Salir");
        botonJugar.setText("Jugar");


       BotonJugarEventHandler botonJugarEventHandler  = new BotonJugarEventHandler(stage);
       botonJugar.setOnAction(botonJugarEventHandler);

       botonSalir.setStyle(("-fx-background-color: rgb(252,3,3)"));
       botonSalir.setTextFill(Color.WHITE);
       botonSalir.setOnAction(actionEvent -> Platform.exit());

        HBox botonera = new HBox(botonJugar, botonSalir);
        botonera.setAlignment(Pos.CENTER);
        botonera.setSpacing( 20 );

        Image imagen = new Image(RUTA_ICONO);
        ImageView vistaDeImagen = new ImageView(imagen);
        vistaDeImagen.setFitWidth(ANCHO);
        vistaDeImagen.setFitHeight(ALTO);

        Label etiqueta = new Label("Bienvenidos a AlgoBlocks!");
        //etiqueta.getStyleClass().add("titulo");

        this.getChildren().addAll(etiqueta, vistaDeImagen, botonera);
    }
}
