package com.sofka.play.services;

import com.sofka.play.collections.CategoriaCollection;
import com.sofka.play.collections.PreguntaCollection;
import com.sofka.play.collections.RespuestaCollection;
import com.sofka.play.collections.RondaCollection;
import com.sofka.play.repositories.CategoriaRepository;
import com.sofka.play.repositories.PreguntaRepository;
import com.sofka.play.repositories.RespuestaRepository;
import com.sofka.play.repositories.RondaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class RondaServiceImpl implements RondaService {

    private final RondaRepository rondaRepository;
    private final CategoriaRepository categoriaRepository;
    private final PreguntaRepository preguntaRepository;
    private final RespuestaRepository respuestaRepository;

    @Override
    public RondaCollection crearRonda(String nombreJugador) {
        double premioAcumulado = 0;
        int nivelDificultad = 1;
        CategoriaCollection categoriaCollection = categoriaRepository.findByNivelDificultad(nivelDificultad);
        List<PreguntaCollection> preguntas = preguntaRepository.findAllByIdCategoria(categoriaCollection.getId());
        int numeroPreguntaAleatorio = preguntaRandom(preguntas.size());
        PreguntaCollection preguntaCollection = preguntas.get(numeroPreguntaAleatorio);
        List<RespuestaCollection> respuestas = respuestaRepository.findAllByIdPregunta(preguntaCollection.getId());
        RondaCollection rondaCollection = new RondaCollection(null, nombreJugador, premioAcumulado, categoriaCollection, preguntaCollection, respuestas, false);
        return rondaRepository.save(rondaCollection);

    }


    private int preguntaRandom(int tamanoArreglo) {
        int min = 0;
        Random random = new Random();
        return random.nextInt(tamanoArreglo + min) + min;
    }


    @Override
    public RondaCollection subirNivel(String idRonda) {

        RondaCollection rondaCollection = rondaRepository.findById(idRonda).orElse(null);
        int nivelDificultad = rondaCollection.getCategoriaCollection().getNivelDificultad();
        if (nivelDificultad < 5) {
            nivelDificultad++;
            double premioAcumulado = aumentarPremioAcumulado(rondaCollection.getPremioAcumulado(), nivelDificultad);
            CategoriaCollection categoriaCollection = categoriaRepository.findByNivelDificultad(nivelDificultad);
            List<PreguntaCollection> preguntas = preguntaRepository.findAllByIdCategoria(categoriaCollection.getId());
            int numeroPreguntaAleatorio = preguntaRandom(preguntas.size());
            PreguntaCollection preguntaCollection = preguntas.get(numeroPreguntaAleatorio);
            List<RespuestaCollection> respuestas = respuestaRepository.findAllByIdPregunta(preguntaCollection.getId());
            rondaCollection.setRespuestas(respuestas);
            rondaCollection.setPregunta(preguntaCollection);
            rondaCollection.setCategoriaCollection(categoriaCollection);
            rondaCollection.setPremioAcumulado(premioAcumulado);
            return rondaRepository.save(rondaCollection);

        } else if (nivelDificultad == 5) {
            rondaCollection.setPasoUltimoNivel(true);
            rondaCollection.setPremioAcumulado(aumentarPremioAcumulado(rondaCollection.getPremioAcumulado(), 6));
            return rondaRepository.save(rondaCollection);
        }


        return rondaCollection;
    }

    private double aumentarPremioAcumulado(double actualPremioAcumulado, int nivelDificultad) {

        double premioActualizado = actualPremioAcumulado;

        switch (nivelDificultad) {
            case 2:
                premioActualizado = 100000;
                break;
            case 3:
                premioActualizado = premioActualizado + 150000;
                break;
            case 4:
                premioActualizado = premioActualizado + 200000;
                break;
            case 5:
                premioActualizado = premioActualizado + 250000;
                break;
            case 6:
                premioActualizado = premioActualizado + 500000;
                break;

            default:
        }
        return premioActualizado;

    }


}
