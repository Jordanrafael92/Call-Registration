package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.PersonDTO;
import com.jrsilva.callRegistration.entities.Person;
import com.jrsilva.callRegistration.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	@Transactional(readOnly = true)
	public List<PersonDTO> findAll() {
		List<Person> list = repository.findAll();

		return list.stream().map(x -> new PersonDTO(x)).collect(Collectors.toList());

	}

	@Transactional(readOnly = true)
	public PersonDTO findById(Long id) {
		Optional<Person> obj = repository.findById(id);
		Person entity = obj.get();
		return new PersonDTO(entity);
	}
}
