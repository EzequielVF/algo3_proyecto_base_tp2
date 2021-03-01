package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.Juego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

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
        this.reproducirSonido();
        consola.display("Algoritmo personalizado.png");
    }
    private void reproducirSonido() {
        String musicFile = "src/main/resources/sonidobotonnormal.mp3";
        Media musica = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(musica);
        mediaPlayer.play();
    }
}