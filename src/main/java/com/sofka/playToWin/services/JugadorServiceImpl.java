package com.sofka.playToWin.services;

import com.sofka.playToWin.collections.JugadorCollection;
import com.sofka.playToWin.repositories.JugadorRepository;
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
