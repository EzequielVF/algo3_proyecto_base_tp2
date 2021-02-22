package edu.fiuba.algo3.interfaz;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Consola extends Pane {
    private Label consola = new Label();

    public Consola(){
        this.getChildren().add(consola);
        this.setBackground(new Background(new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, new Insets(-2.0))));

    }

    public void display(String nombreBloque){
        String aux = consola.getText();
        consola.setText(aux+"\n"+ "Bloque de "+nombreBloque+" ha sido agregado");
    }

    public void escribir(String texto){
        String aux = consola.getText();
        consola.setText(aux+"\n"+ texto);
    }
}
