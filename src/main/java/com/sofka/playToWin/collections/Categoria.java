package com.sofka.playToWin.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    private String id;
    private String nombreCategoria;
    private String nivelDificultad;

}
