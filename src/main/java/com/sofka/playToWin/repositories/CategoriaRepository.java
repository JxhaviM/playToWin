package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {



}
