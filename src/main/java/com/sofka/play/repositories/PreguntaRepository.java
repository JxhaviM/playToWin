package com.sofka.play.repositories;

import com.sofka.play.collections.PreguntaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PreguntaRepository extends MongoRepository<PreguntaCollection,String> {

    List<PreguntaCollection> findAllByIdCategoria(String idCategoria);


}
