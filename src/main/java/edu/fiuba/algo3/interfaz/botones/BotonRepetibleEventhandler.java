package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.acciones.Accion;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRepetibleEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Accion accion;
    private Consola consola;
    private Repetible repetible;

    public BotonRepetibleEventhandler(Juego juego, Accion accion, Consola consola,Repetible repetible){
        this.juego = juego;
        this.accion = accion;
        this.consola = consola;
        this.repetible = repetible;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.repetible.almacenarAccion(accion);
        consola.display(accion.devolverNombre());
    }
}