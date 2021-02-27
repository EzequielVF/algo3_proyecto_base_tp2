package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import edu.fiuba.algo3.modelo.excepciones.AlgoritmoNoTieneAccionesTodaviaExcepcion;
import edu.fiuba.algo3.modelo.excepciones.NombreNoValidoParaAlgoritmoExcepcion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class BotonGuardarAlgoritmoEventHandler implements EventHandler<ActionEvent> {
    private Juego juego;
    private Consola consola;
    private TextField nombreAlgoritmo;
    private MenuButton algoritmosGuardados;

    public BotonGuardarAlgoritmoEventHandler(Juego juego, Consola consola, TextField textField, MenuButton algoritmosGuardados){
        this.juego = juego;
        this.consola = consola;
        this.nombreAlgoritmo = textField;
        this.algoritmosGuardados = algoritmosGuardados;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        try{
            juego.crearAlgoritmoPersonalizado(nombreAlgoritmo.getText());
            //consola.display(nombreAlgoritmo.getText());
            MenuItem algoritmoPersonalizado = new MenuItem(nombreAlgoritmo.getText());
            BotonUsarAlgoritmoEventHandler botonUsardarHandler = new BotonUsarAlgoritmoEventHandler(juego, consola, nombreAlgoritmo.getText());
            algoritmoPersonalizado.setOnAction(botonUsardarHandler);
            algoritmosGuardados.getItems().add(algoritmoPersonalizado);
        }
        catch ( NombreNoValidoParaAlgoritmoExcepcion | AlgoritmoNoTieneAccionesTodaviaExcepcion e){
            consola.escribir(e.getMessage());
        }
    }
}
