package edu.fiuba.algo3.modelo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BotonAccionEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Accion accion;
    private Label consola;

    public BotonAccionEventhandler(Juego juego, Accion accion, Label consola){
        this.juego = juego;
        this.accion = accion;
        this.consola = consola;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.agregarAccion(accion);
        String aux = consola.getText();
        consola.setText(aux+"\n"+ "Bloque de "+accion.devolverNombre()+" ha sido agregado");
    }
}