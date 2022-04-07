package com.sofka.play.collections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class RondaCollection {
    @Id
    private String id;
    private String nombreJugador;
    private double premioAcumulado;
    private CategoriaCollection categoriaCollection;
    private PreguntaCollection pregunta;
    private List<RespuestaCollection> respuestas;
    private boolean pasoUltimoNivel;



}
