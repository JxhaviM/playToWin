package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.Respuesta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RespuestaRepository extends MongoRepository<Respuesta,String> {
}
