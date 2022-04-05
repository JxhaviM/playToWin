package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.JugadorCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface JugadorRepository extends MongoRepository<JugadorCollection,String> {
}
