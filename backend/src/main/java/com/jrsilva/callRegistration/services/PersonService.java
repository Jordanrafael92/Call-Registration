package com.jrsilva.callRegistration.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrsilva.callRegistration.entities.Person;
import com.jrsilva.callRegistration.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	public List<Person> findAll() {
		return repository.findAll();
	}
}
