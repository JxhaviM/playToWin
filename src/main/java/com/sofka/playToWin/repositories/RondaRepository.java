package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.Ronda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RondaRepository extends MongoRepository<Ronda,String> {
}
