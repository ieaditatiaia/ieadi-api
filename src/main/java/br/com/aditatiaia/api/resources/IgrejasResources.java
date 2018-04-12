package br.com.aditatiaia.api.resources;

import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.validation.Valid;
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
import br.com.aditatiaia.api.domain.Igreja;
import br.com.aditatiaia.api.services.IgrejasServices;

@RestController
@RequestMapping("/igrejas")
public class IgrejasResources {

	@Autowired
	private IgrejasServices igrejasServices;
	
	@PostMapping
	public ResponseEntity<Void> salvar(@Valid @RequestBody Igreja igreja) {
		igreja = igrejasServices.salvar(igreja);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(igreja.getId()).toUri();
		return ResponseEntity.created(uri).build();		
	}
	
	@GetMapping
	public ResponseEntity<List<Igreja>> listar(){
		CacheControl cacheControl = CacheControl.maxAge(5, TimeUnit.SECONDS);
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(igrejasServices.listar());
	}
}
