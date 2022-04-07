package com.sofka.play.controller;

import com.sofka.play.collections.CategoriaCollection;
import com.sofka.play.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/categoria")
@AllArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    @PostMapping("/agregar")
    public Boolean crearCategoria(@RequestBody CategoriaCollection categoriaCollection){
        categoriaService.crearCategoria(categoriaCollection);
        return true;
    }

    @GetMapping("/consultar/{nombreCategoria}")
    public String consultarIdCategoria(@PathVariable String nombreCategoria){
        return categoriaService.consultarIdCategoria(nombreCategoria);

    }



}
