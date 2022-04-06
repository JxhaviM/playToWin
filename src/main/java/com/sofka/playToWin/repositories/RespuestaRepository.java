package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.RespuestaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RespuestaRepository extends MongoRepository<RespuestaCollection,String> {
    List<RespuestaCollection> findAllByIdPregunta(String idPregunta);
}
