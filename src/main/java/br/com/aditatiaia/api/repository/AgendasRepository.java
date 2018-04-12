package br.com.aditatiaia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.aditatiaia.api.domain.Agenda;

public interface AgendasRepository extends MongoRepository<Agenda, String> {

}
