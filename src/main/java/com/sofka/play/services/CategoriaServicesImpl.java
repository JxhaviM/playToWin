package com.sofka.play.services;


import com.sofka.play.collections.CategoriaCollection;
import com.sofka.play.repositories.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaServicesImpl implements CategoriaService{


    private final CategoriaRepository categoriaRepository;



    @Override
    public CategoriaCollection crearCategoria(CategoriaCollection categoriaCollection) {
        return categoriaRepository.save(categoriaCollection);
    }

    @Override
    public String consultarIdCategoria(String nombreCategoria) {

        return categoriaRepository.findByNombreCategoria(nombreCategoria).getId();
    }
}
