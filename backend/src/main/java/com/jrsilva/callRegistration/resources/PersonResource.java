package com.jrsilva.callRegistration.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jrsilva.callRegistration.dto.PersonDTO;
import com.jrsilva.callRegistration.services.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public ResponseEntity<List<PersonDTO>> findAll(){
		List<PersonDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PersonDTO> findById(@PathVariable Long id){
		PersonDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<PersonDTO> insert(@RequestBody PersonDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getIdPerson()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PersonDTO> update(@PathVariable Long id, @RequestBody PersonDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}

}
