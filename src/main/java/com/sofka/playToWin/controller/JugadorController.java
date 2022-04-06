package com.sofka.playToWin.controller;

import com.sofka.playToWin.collections.JugadorCollection;
import com.sofka.playToWin.repositories.JugadorRepository;
import com.sofka.playToWin.services.JugadorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
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
