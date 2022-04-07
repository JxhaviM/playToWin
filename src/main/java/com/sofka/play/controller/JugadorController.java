package com.sofka.play.controller;

import com.sofka.play.collections.JugadorCollection;
import com.sofka.play.services.JugadorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/jugador")
@AllArgsConstructor
public class JugadorController {


    private final JugadorService jugadorService;

    @PostMapping("/agregar")
    public Boolean crearJugador(@RequestBody JugadorCollection jugadorCollection){
        jugadorService.crearJugador(jugadorCollection);
        return  true;

    }


}
