package com.sofka.play.services;

import com.sofka.play.collections.RondaCollection;

public interface RondaService {

    public RondaCollection crearRonda(String nombreJugador);
    public RondaCollection subirNivel(String idRonda);

}
