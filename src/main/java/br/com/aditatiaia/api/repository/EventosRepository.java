package br.com.aditatiaia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.aditatiaia.api.domain.Evento;

public interface EventosRepository extends MongoRepository<Evento, String> {

}
