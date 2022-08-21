package com.jrsilva.callRegistration.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jrsilva.callRegistration.dto.RequestDTO;
import com.jrsilva.callRegistration.services.RequestService;

@RestController
@RequestMapping(value = "/request")
public class RequestResource {

	@Autowired
	private RequestService service;
	
	@GetMapping
	public ResponseEntity<List<RequestDTO>> findAll() {
		List<RequestDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<RequestDTO> findById(@PathVariable Long id) {
		RequestDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<RequestDTO> insert(@RequestBody RequestDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getIdRequest()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
