package br.com.aditatiaia.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.aditatiaia.api.domain.Agenda;
import br.com.aditatiaia.api.services.AgendasServices;

@RestController
@RequestMapping("/agendas")
public class AgendasResources {

	@Autowired
	private AgendasServices agendasServices;
	
	@PostMapping
	public void salvar(@RequestBody Agenda agenda) {
		agendasServices.salvar(agenda);
	}
	
	@GetMapping
	public List<Agenda> listar(){
		return agendasServices.listar();
	}
}
