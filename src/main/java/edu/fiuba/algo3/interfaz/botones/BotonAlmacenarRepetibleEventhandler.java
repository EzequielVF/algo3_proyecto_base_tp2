package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.ventanas.Consola;
import edu.fiuba.algo3.modelo.actoresPrincipales.Juego;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

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
        this.juego.agregarAccion(repetible.copiar());
        this.reproducirSonido();
        //consola.display(repetible.devolverNombre()+".png");
    }

    private void reproducirSonido() {
        String musicFile = "src/main/resources/sonidobotonnormal.mp3";
        Media musica = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(musica);
        mediaPlayer.play();
    }
}