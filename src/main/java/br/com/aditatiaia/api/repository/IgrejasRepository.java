package br.com.aditatiaia.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.aditatiaia.api.domain.Igreja;

public interface IgrejasRepository extends MongoRepository<Igreja, String> {

}
