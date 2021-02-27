package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.*;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

public class CampoDeJuego extends BorderPane {

        Consola consola = new Consola();
        Juego juego = new Juego();
        private ScrollPane scroll = new ScrollPane(consola);

        AreaDeDibujado areaDeDibujado = new AreaDeDibujado(juego.devolverPersonaje());
        BotonesDisponibles botonesDisponibles = new BotonesDisponibles(consola, juego);

        public CampoDeJuego() {

            //this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
            scroll.setMinWidth(15);
            scroll.setMaxWidth(1500);



            posicionarSectores();

            BorderPane.setMargin(areaDeDibujado, new Insets(20,50,300,30));
            BorderPane.setMargin(botonesDisponibles, new Insets(20,50,50,30));
            BorderPane.setMargin(consola, new Insets(100,100,100,10));
        }
        private void posicionarSectores() {
            this.setRight(botonesDisponibles);
            this.setCenter(scroll);
            this.setLeft(areaDeDibujado);
        }
}
