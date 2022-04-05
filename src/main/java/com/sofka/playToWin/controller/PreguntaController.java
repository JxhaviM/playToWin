package com.sofka.playToWin.controller;

import com.sofka.playToWin.collections.PreguntaCollection;
import com.sofka.playToWin.collections.RespuestaCollection;
import com.sofka.playToWin.dtos.CrearPreguntaDto;
import com.sofka.playToWin.services.PreguntaServiceImpl;
import com.sofka.playToWin.services.RespuestaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/pregunta")
public class PreguntaController {

    private final PreguntaServiceImpl preguntaService;
    private final RespuestaServiceImpl respuestaService;

    @RequestMapping("/crear")
    private Boolean crearPregunta(@RequestBody CrearPreguntaDto crearPreguntaDto){
        PreguntaCollection preguntaCollection=preguntaService.crearPregunta(crearPreguntaDto.getPregunta());
        String idPreguntaCollection=preguntaCollection.getId();
        crearPreguntaDto.getRespuestas().forEach(respuestaCollection -> {
           respuestaCollection.setIdPregunda(idPreguntaCollection);
           respuestaService.crearRespuesta(respuestaCollection);
        });

        return true;
    }
}
