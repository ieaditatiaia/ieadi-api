package br.com.aditatiaia.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.aditatiaia.api.domain.Evento;
import br.com.aditatiaia.api.repository.EventosRepository;

@Service
public class EventosServices {

	@Autowired
	private EventosRepository eventosRepository;
	
	public Evento salvar(Evento evento) {
		evento.setId(null);
		evento = eventosRepository.save(evento);
		return evento;
	}
	
	public List<Evento> listar(){
		return eventosRepository.findAll();
	}	
}
