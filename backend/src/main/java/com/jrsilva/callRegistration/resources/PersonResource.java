package com.jrsilva.callRegistration.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsilva.callRegistration.entities.Person;
import com.jrsilva.callRegistration.services.PersonService;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll(){
		List<Person> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
