package edu.fiuba.algo3.interfaz.botones;

import edu.fiuba.algo3.interfaz.Consola;
import edu.fiuba.algo3.modelo.acciones.Accion;
import edu.fiuba.algo3.modelo.acciones.Repetible;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class BotonRepetibleEventhandler implements EventHandler<ActionEvent> {

    private Accion accion;
    private Consola consola;
    private Repetible repetible;

    public BotonRepetibleEventhandler(Accion accion, Consola consola,Repetible repetible){
        this.accion = accion;
        this.consola = consola;
        this.repetible = repetible;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        this.repetible.almacenarAccion(accion);
        this.reproducirSonido();
        consola.displayRepetible(repetible,accion.devolverNombre()+".png");
    }
    private void reproducirSonido() {
        String musicFile = "src/main/resources/sonidobotonnormal.mp3";
        Media musica = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(musica);
        mediaPlayer.play();
    }
}