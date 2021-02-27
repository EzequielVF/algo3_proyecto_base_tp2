package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Consola extends VBox {
    private Label consola = new Label();
    private HBox repetibleBox = new HBox();

    public Consola(){
        this.getChildren().add(consola);
        this.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, new Insets(-2.0))));
        consola.setStyle(("-fx-background-color: rgb(252,3,3)"));
    }

    public void display(String rutaBloque){
        //String aux = consola.getText();
        Image imagen = new Image(rutaBloque);
        ImageView vistaDeImagen = new ImageView(imagen);
        vistaDeImagen.setFitHeight(85);
        vistaDeImagen.setFitWidth(66);
        this.getChildren().add(vistaDeImagen);
        //consola.setText(aux+"\n"+ "Bloque de "+nombreBloque+" ha sido agregado");
    }

    public void escribir(String texto){
        String aux = consola.getText();
        consola.setText(aux+"\n"+ texto);
    }

    public void limpiar() {
        getChildren().clear();
    }

    public void displayRepetible(Repetible repetible, String rutaBloque) {
        Image imagenRepetible = new Image(repetible.devolverNombre()+".png");
        ImageView vistaDeImagen = new ImageView(imagenRepetible);
        vistaDeImagen.setFitHeight(85);
        vistaDeImagen.setFitWidth(66);
        repetibleBox.getChildren().add(vistaDeImagen);


        Image imagenBloque = new Image(rutaBloque);
        ImageView vistaDeImagenBloque = new ImageView(imagenBloque);
        vistaDeImagenBloque.setFitHeight(85);
        vistaDeImagenBloque.setFitWidth(66);
        repetibleBox.getChildren().add(vistaDeImagenBloque);

        this.getChildren().add(repetibleBox);
    }

    public void limpiarRepetible() {
        repetibleBox.getChildren().clear();
    }
}
