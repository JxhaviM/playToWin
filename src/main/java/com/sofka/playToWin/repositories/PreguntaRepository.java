package com.sofka.playToWin.repositories;

import com.sofka.playToWin.collections.PreguntaCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PreguntaRepository extends MongoRepository<PreguntaCollection,String> {

    List<PreguntaCollection> findAllByIdCategoria(String idCategoria);


}
