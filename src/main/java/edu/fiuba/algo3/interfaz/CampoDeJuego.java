package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import javafx.geometry.*;
import javafx.scene.layout.BorderPane;

public class CampoDeJuego extends BorderPane {

        Consola consola = new Consola();

        Juego juego = new Juego();

        AreaDeDibujado areaDeDibujado = new AreaDeDibujado(juego);
        BotonesDisponibles botonesDisponibles = new BotonesDisponibles(consola, areaDeDibujado, juego);




        public CampoDeJuego() {

            //posicionPersonaje = new Posicion();
            //posicionPersonaje.addObserver((Observer) observadorGrafico);
            //observadorGrafico.agregarObservable(posicionPersonaje);

            posicionarSectores();

            BorderPane.setMargin(areaDeDibujado, new Insets(20,50,300,30));
            BorderPane.setMargin(botonesDisponibles, new Insets(20,50,50,30));
            BorderPane.setMargin(consola, new Insets(20,50,50,30));
        }
        //Separator separator = new Separator(Orientation.VERTICAL);
        private void posicionarSectores() {
            this.setRight(botonesDisponibles);
            this.setCenter(consola);
            this.setLeft(areaDeDibujado);
        }
}
