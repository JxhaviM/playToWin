package com.sofka.play.services;

import com.sofka.play.collections.RespuestaCollection;

public interface RespuestaService {

    public RespuestaCollection crearRespuesta(RespuestaCollection respuestaCollection);
    public boolean evaluarRespuesta(RespuestaCollection respuestaCollection);

}
