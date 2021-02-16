package edu.fiuba.algo3.interfaz;

import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class Consola extends Pane {
    private Label consola = new Label();

    public Consola(){
        this.getChildren().add(consola);
    }

    public void display(String nombreBloque){
        String aux = consola.getText();
        consola.setText(aux+"\n"+ "Bloque de "+nombreBloque+" ha sido agregado");
    }
}
