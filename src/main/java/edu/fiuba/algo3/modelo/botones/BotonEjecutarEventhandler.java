package edu.fiuba.algo3.modelo.botones;

import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class BotonEjecutarEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Label consola;

    public BotonEjecutarEventhandler(Juego juego, Label consola){
        this.juego = juego;
        this.consola = consola;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.ejecutar();
    }
}