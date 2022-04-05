package com.sofka.playToWin.dtos;

import com.sofka.playToWin.collections.PreguntaCollection;
import com.sofka.playToWin.collections.RespuestaCollection;
import lombok.Data;

import java.util.ArrayList;
@Data
public class CrearPreguntaDto {

    private PreguntaCollection pregunta;
    private ArrayList<RespuestaCollection> respuestas;
}
