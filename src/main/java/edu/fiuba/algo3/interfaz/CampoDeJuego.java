package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.campodejuego.Posicion;
import javafx.geometry.*;
import javafx.scene.layout.BorderPane;
import java.util.Observable;

public class CampoDeJuego extends BorderPane {
        AreaDeDibujado areaDeDibujado = new AreaDeDibujado();
        Consola consola = new Consola();
        BotonesDisponibles botonesDisponibles = new BotonesDisponibles(consola,areaDeDibujado);




        public CampoDeJuego() {

            Posicion posicionPersonaje = new Posicion();
            //posicionPersonaje.addObserver(areaDeDibujado);

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
