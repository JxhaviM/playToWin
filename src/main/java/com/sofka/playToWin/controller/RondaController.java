package com.sofka.playToWin.controller;


import com.sofka.playToWin.collections.RondaCollection;
import com.sofka.playToWin.services.RondaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/ronda")
public class RondaController {

    private final RondaService rondaService;

    @PostMapping("/crear_ronda/{nombreJugador}")
    public RondaCollection crearRonda(@PathVariable String nombreJugador){
        return  rondaService.crearRonda(nombreJugador);


    }




}
