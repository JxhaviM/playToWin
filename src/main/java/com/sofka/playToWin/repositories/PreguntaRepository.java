package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.Pregunta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PreguntaRepository extends MongoRepository<Pregunta,String> {
}
