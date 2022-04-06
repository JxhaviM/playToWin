package com.sofka.playToWin.controller;

import com.sofka.playToWin.collections.CategoriaCollection;
import com.sofka.playToWin.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/categoria")
@AllArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping("/agregar")
    public Boolean crearCategoria(@RequestBody CategoriaCollection categoria){
        categoriaService.crearCategoria(categoria);
        return true;

    }


}
