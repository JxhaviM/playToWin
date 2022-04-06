package com.sofka.playToWin.services;

import com.sofka.playToWin.collections.RespuestaCollection;

public interface RespuestaService {

    public RespuestaCollection crearRespuesta(RespuestaCollection respuestaCollection);
    public boolean evaluarRespuesta(RespuestaCollection respuestaCollection);

}
