package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.RondaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RondaRepository extends MongoRepository<RondaCollection,String> {
}
