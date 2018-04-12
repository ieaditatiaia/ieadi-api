package br.com.aditatiaia.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.aditatiaia.api.domain.Agenda;
import br.com.aditatiaia.api.repository.AgendasRepository;

@Service
public class AgendasServices {

	@Autowired
	private AgendasRepository agendasRepository;
	
	public Agenda salvar(Agenda agenda) {
		agenda.setId(null);
		agenda = agendasRepository.save(agenda);
		return agenda;
	}
	
	public List<Agenda> listar(){
		return agendasRepository.findAll();
	}
	
	
}
