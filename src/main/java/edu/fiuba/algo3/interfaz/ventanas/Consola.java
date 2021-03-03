package edu.fiuba.algo3.interfaz.ventanas;

import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Consola extends VBox {
    private Label log = new Label();
    private Integer ALTO = 125;
    private Integer ANCHO = 125;

    public Consola(){
        this.getStylesheets().add("style.css");
        this.getStyleClass().add("panel");
        this.getChildren().add(log);
        log.getStyleClass().add("error");
    }

    public void display(String rutaBloque){
        Image imagen = new Image(rutaBloque);
        ImageView vistaDeImagen = new ImageView(imagen);
        vistaDeImagen.setFitHeight(ALTO);
        vistaDeImagen.setFitWidth(ANCHO);
        this.getChildren().add(vistaDeImagen);
    }

    public void escribir(String texto){
        String aux = log.getText();
        log.setText(aux+"\n"+ texto);
    }

    public void limpiar() {
        getChildren().clear();
        log.setText("");
        getChildren().add(log);
    }

    public void displayRepetible(Repetible repetible, String rutaBloque) {
        HBox repetibleBox = new HBox();
        Image imagenRepetible = new Image(repetible.devolverNombre()+".png");
        ImageView vistaDeImagen = new ImageView(imagenRepetible);
        vistaDeImagen.setFitHeight(ALTO);
        vistaDeImagen.setFitWidth(ANCHO);
        repetibleBox.getChildren().add(vistaDeImagen);

        Image imagenBloque = new Image(rutaBloque);
        ImageView vistaDeImagenBloque = new ImageView(imagenBloque);
        vistaDeImagenBloque.setFitHeight(ALTO);
        vistaDeImagenBloque.setFitWidth(ANCHO);
        repetibleBox.getChildren().add(vistaDeImagenBloque);

        this.getChildren().add(repetibleBox);
    }
}
