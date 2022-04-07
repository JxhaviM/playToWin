package com.sofka.play.services;

import com.sofka.play.collections.CategoriaCollection;


public interface CategoriaService {
    public CategoriaCollection crearCategoria(CategoriaCollection categoriaCollection);


    String consultarIdCategoria(String nombreCategoria);
}
