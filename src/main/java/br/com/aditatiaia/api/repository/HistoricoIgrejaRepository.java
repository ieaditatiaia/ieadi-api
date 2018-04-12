package br.com.aditatiaia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.aditatiaia.api.domain.HistoricoIgreja;

public interface HistoricoIgrejaRepository extends MongoRepository<HistoricoIgreja, String> {

}
