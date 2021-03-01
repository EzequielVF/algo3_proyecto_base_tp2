package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.*;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.XYChart;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class BotonEjecutarEventhandler implements EventHandler<ActionEvent> {

    private Juego juego;
    private Consola consola;

    public BotonEjecutarEventhandler(Juego juego, Consola consola){
        this.juego = juego;
        this.consola = consola;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        juego.ejecutar();
        this.reproducirSonido();
        consola.limpiar();
        juego.limpiar();
    }
    private void reproducirSonido() {
        String musicFile = "src/main/resources/sonidobotonplay.mp3";
        Media musica = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(musica);
        mediaPlayer.play();
    }
}