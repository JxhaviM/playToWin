package com.sofka.playToWin.services;

import com.sofka.playToWin.collections.PreguntaCollection;
import com.sofka.playToWin.repositories.PreguntaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PreguntaServiceImpl implements PreguntaService{

    private  final PreguntaRepository preguntaRepository;

    @Override
    public PreguntaCollection crearPregunta(PreguntaCollection preguntaCollection) {
        return preguntaRepository.save(preguntaCollection);
    }
}
