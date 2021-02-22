package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.interfaz.AreaDeDibujado;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.pincel.EstadoPincel;
import edu.fiuba.algo3.modelo.pincel.Pincel;

public class ObservadorPincel implements Observer {

    private EstadoPincel estadoPincel;
    private Juego juego;
    private Pincel pincel;
    private AreaDeDibujado areaDeDibujado;

    public ObservadorPincel(Juego juego,AreaDeDibujado areaDeDibujado){
        this.juego = juego;
        this.areaDeDibujado = areaDeDibujado;
        this.estadoPincel = juego.devolverEstadoPincel();
        this.pincel = juego.devolverPincel();
        pincel.addObserver((Observer) this);
    }

    @Override
    public void change() {

        estadoPincel = juego.devolverEstadoPincel();
        estadoPincel.addObserver((Observer) areaDeDibujado);
        areaDeDibujado.nuevaSerie();
    }

    public EstadoPincel devolverEstadoPincel() {
        return estadoPincel;
    }
}
