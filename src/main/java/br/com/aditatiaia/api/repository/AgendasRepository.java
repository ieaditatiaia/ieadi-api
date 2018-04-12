package br.com.aditatiaia.api.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.aditatiaia.api.domain.Agenda;

public interface AgendasRepository extends MongoRepository<Agenda, String> {
	List<Agenda> findByDataBetween(LocalDate dataInicial, LocalDate dataFinal);
}
