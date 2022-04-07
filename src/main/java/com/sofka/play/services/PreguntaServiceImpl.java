package com.sofka.play.services;

import com.sofka.play.collections.PreguntaCollection;
import com.sofka.play.repositories.PreguntaRepository;
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
