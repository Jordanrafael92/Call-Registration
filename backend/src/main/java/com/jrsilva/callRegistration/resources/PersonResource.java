package com.jrsilva.callRegistration.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsilva.callRegistration.entities.Person;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll(){
		List<Person> list = new ArrayList<>();
		list.add(new Person(1L,"Rafael", 111111));
		list.add(new Person(2L,"Silva", 2222222));
		return ResponseEntity.ok().body(list);
	}

}
