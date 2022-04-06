package com.sofka.playToWin.services;

import com.sofka.playToWin.collections.RespuestaCollection;
import com.sofka.playToWin.repositories.RespuestaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RespuestaServiceImpl implements RespuestaService {

    private final RespuestaRepository respuestaRepository;


    @Override
    public RespuestaCollection crearRespuesta(RespuestaCollection respuestaCollection) {
        return respuestaRepository.save(respuestaCollection);
    }

    @Override
    public boolean evaluarRespuesta(RespuestaCollection respuestaCollection) {
        Boolean esCorrecta=false;
        if(respuestaCollection.isEsRespuestaCorrecta()) {
            esCorrecta = true;
        }
        return esCorrecta;
    }
}
