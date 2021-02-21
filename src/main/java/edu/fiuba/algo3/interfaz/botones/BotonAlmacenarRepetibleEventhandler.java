package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAlmacenarRepetibleEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Consola consola;
    private Repetible repetible;

    public BotonAlmacenarRepetibleEventhandler(Juego juego, Consola consola, Repetible repetible){
        this.juego = juego;
        this.consola = consola;
        this.repetible = repetible;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.juego.agregarAccion(repetible.copiar());//repetible.copiar();
        consola.display(repetible.devolverNombre());
    }
}