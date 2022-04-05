package com.sofka.playToWin.services;


import com.sofka.playToWin.collections.CategoriaCollection;
import com.sofka.playToWin.repositories.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaServicesImpl implements CategoriaService{


    private final CategoriaRepository categoriaRepository;



    @Override
    public CategoriaCollection crearCategoria(CategoriaCollection categoria) {
        return categoriaRepository.save(categoria);
    }
}
