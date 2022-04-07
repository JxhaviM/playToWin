package com.sofka.play.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sofka.play.collections.PreguntaCollection;
import com.sofka.play.collections.RespuestaCollection;
import lombok.Data;

import java.util.ArrayList;
@Data
public class CrearPreguntaDto {

    @JsonProperty("pregunta")
    private PreguntaCollection pregunta;
    @JsonProperty("respuestas")
    private ArrayList<RespuestaCollection> respuestas;
}
