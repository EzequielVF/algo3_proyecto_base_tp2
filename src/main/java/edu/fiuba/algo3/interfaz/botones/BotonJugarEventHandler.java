package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.App;
import edu.fiuba.algo3.interfaz.CampoDeJuego;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class BotonJugarEventHandler implements EventHandler<ActionEvent> {
    private App app;
    private Stage stage;

    public BotonJugarEventHandler(Stage stage){
        this.stage = stage;
    }
    @Override
    public void handle(ActionEvent actionEvent){
        CampoDeJuego vistaPrincipal = new CampoDeJuego();
        Scene nuevaScena = new Scene(vistaPrincipal);
        stage.setScene(nuevaScena);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setMinHeight(600);
        stage.setMinWidth(1200);
    }
}
