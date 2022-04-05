package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JugadorRepository extends MongoRepository<Jugador,String> {
}
