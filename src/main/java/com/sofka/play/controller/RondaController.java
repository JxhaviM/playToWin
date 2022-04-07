package com.sofka.play.controller;


import com.sofka.play.collections.RondaCollection;
import com.sofka.play.services.RondaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@RequestMapping("/ronda")
public class RondaController {

    private final RondaService rondaService;

    @PostMapping("/crear-ronda/{nombreJugador}")
    public RondaCollection crearRonda(@PathVariable String nombreJugador){
        return  rondaService.crearRonda(nombreJugador);
    }

    @PutMapping("/subir-nivel/{idRonda}")
    public RondaCollection subirNivel(@PathVariable String idRonda){
        return rondaService.subirNivel(idRonda);
    }






}
