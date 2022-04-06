package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.CategoriaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends MongoRepository<CategoriaCollection, String> {

    CategoriaCollection findByNivelDificultad(int nivelDeDificultad);



}
