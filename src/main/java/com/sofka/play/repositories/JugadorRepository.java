package com.sofka.play.repositories;

import com.sofka.play.collections.JugadorCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface JugadorRepository extends MongoRepository<JugadorCollection,String> {
}
