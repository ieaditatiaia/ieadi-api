package br.com.aditatiaia.api.resources;

import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.aditatiaia.api.domain.Agenda;
import br.com.aditatiaia.api.services.AgendasServices;

@RestController
@RequestMapping("/agendas")
public class AgendasResources {

	@Autowired
	private AgendasServices agendasServices;
	
	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody Agenda agenda) {
		agenda = agendasServices.salvar(agenda);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(agenda.getId()).toUri();
		return ResponseEntity.created(uri).build();		
	}
	
	@GetMapping
	public ResponseEntity<List<Agenda>> listar(){
		CacheControl cacheControl = CacheControl.maxAge(5, TimeUnit.SECONDS);
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(agendasServices.listar());
	}
}
