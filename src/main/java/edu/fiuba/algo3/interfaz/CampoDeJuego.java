package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class CampoDeJuego extends BorderPane {

        Consola consola = new Consola();
        Juego juego = new Juego();

        AreaDeDibujado areaDeDibujado = new AreaDeDibujado(juego.devolverPersonaje());
        BotonesDisponibles botonesDisponibles = new BotonesDisponibles(consola, juego);

        public CampoDeJuego() {

            this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

            posicionarSectores();

            BorderPane.setMargin(areaDeDibujado, new Insets(20,50,300,30));
            BorderPane.setMargin(botonesDisponibles, new Insets(20,50,50,30));
            BorderPane.setMargin(consola, new Insets(20,50,50,30));
        }
        private void posicionarSectores() {
            this.setRight(botonesDisponibles);
            this.setCenter(consola);
            this.setLeft(areaDeDibujado);
        }
}
