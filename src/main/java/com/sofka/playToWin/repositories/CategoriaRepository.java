package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.CategoriaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<CategoriaCollection, String> {



}
