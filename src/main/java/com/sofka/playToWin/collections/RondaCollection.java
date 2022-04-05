package com.sofka.playToWin.collections;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class RondaCollection {
    @Id
    private String id;
    private String idJugador;
    private double premioAcumulado;
    private String nivelDificultad;
    private String idPregunda;
    private ArrayList<RespuestaCollection> idRespuesta;


}
