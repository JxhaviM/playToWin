package com.sofka.play.controller;

import com.sofka.play.collections.PreguntaCollection;
import com.sofka.play.dtos.CrearPreguntaDto;
import com.sofka.play.services.PreguntaServiceImpl;
import com.sofka.play.services.RespuestaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/pregunta")
public class PreguntaController {

    private final PreguntaServiceImpl preguntaService;
    private final RespuestaServiceImpl respuestaService;

    @PostMapping("/crear")
    private Boolean crearPregunta(@RequestBody CrearPreguntaDto crearPreguntaDto){
        PreguntaCollection preguntaCollection=preguntaService.crearPregunta(crearPreguntaDto.getPregunta());
        String idPreguntaCollection=preguntaCollection.getId();
        crearPreguntaDto.getRespuestas().forEach(respuestaCollection -> {
           respuestaCollection.setIdPregunta(idPreguntaCollection);
           respuestaService.crearRespuesta(respuestaCollection);
        });

        return true;
    }
}
