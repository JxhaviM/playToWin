package com.sofka.play.services;

import com.sofka.play.collections.JugadorCollection;
import com.sofka.play.repositories.JugadorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JugadorServiceImpl  implements JugadorService{

    private final JugadorRepository jugadorRepository;


    @Override
    public JugadorCollection crearJugador(JugadorCollection jugadorCollection) {
        return  jugadorRepository.save(jugadorCollection);
    }
}
