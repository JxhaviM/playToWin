package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.PreguntaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PreguntaRepository extends MongoRepository<PreguntaCollection,String> {
}
