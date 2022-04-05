package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.RespuestaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RespuestaRepository extends MongoRepository<RespuestaCollection,String> {
}
