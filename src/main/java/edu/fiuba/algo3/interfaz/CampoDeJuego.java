package edu.fiuba.algo3.interfaz;

import edu.fiuba.algo3.modelo.*;
import javafx.geometry.*;
import javafx.scene.layout.BorderPane;

public class CampoDeJuego extends BorderPane {

        AreaDeDibujado areaDeDibujado = new AreaDeDibujado();
        Consola consola = new Consola();
        BotonesDisponibles botonesDisponibles = new BotonesDisponibles(consola,areaDeDibujado);


        public CampoDeJuego() {

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
