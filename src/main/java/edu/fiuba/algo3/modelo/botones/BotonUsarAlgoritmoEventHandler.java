package edu.fiuba.algo3.modelo.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;

public class BotonUsarAlgoritmoEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private Consola consola;
    private String nombre;

    public BotonUsarAlgoritmoEventHandler(Juego juego, Consola consola, String nombre){
        this.juego = juego;
        this.consola = consola;
        this.nombre = nombre;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        juego.usarAlgoritmoPersonalizado(nombre);
        //String historialDeConsola = consola.getText();
        //consola.setText(historialDeConsola+"\n"+"Se ha utilizado un Algoritmo Personalizado con nombre "+nombre);
        consola.display(nombre);
    }
}