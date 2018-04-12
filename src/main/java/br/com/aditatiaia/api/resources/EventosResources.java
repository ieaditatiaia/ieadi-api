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
import br.com.aditatiaia.api.domain.Evento;
import br.com.aditatiaia.api.services.EventosServices;

@RestController
@RequestMapping("/eventos")
public class EventosResources {

	@Autowired
	private EventosServices eventosServices;
	
	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody Evento evento) {
		evento = eventosServices.salvar(evento);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(evento.getId()).toUri();
		return ResponseEntity.created(uri).build();		
	}
	
	@GetMapping
	public ResponseEntity<List<Evento>> listar(){
		CacheControl cacheControl = CacheControl.maxAge(5, TimeUnit.SECONDS);
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(eventosServices.listar());
	}
}
