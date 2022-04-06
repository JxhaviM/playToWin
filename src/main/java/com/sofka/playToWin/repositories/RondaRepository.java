package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.RondaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RondaRepository extends MongoRepository<RondaCollection,String> {

    Optional<RondaCollection> findById(String idRonda);
}
