package br.com.aditatiaia.api.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.aditatiaia.api.domain.Igreja;
import br.com.aditatiaia.api.repository.IgrejasRepository;

@Service
public class IgrejasServices {

	@Autowired
	private IgrejasRepository igrejasRepository;
	
	public Igreja salvar(Igreja igreja) {
		igreja.setId(null);
		igreja = igrejasRepository.save(igreja);
		return igreja;
	}
	
	public List<Igreja> listar(){
		return igrejasRepository.findAll();
	}
	
}
