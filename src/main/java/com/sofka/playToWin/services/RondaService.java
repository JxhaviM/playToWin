package com.sofka.playToWin.services;

import com.sofka.playToWin.collections.RondaCollection;

public interface RondaService {

    public RondaCollection crearRonda(String nombreJugador);
    public RondaCollection subirNivel(String idRonda);

}
