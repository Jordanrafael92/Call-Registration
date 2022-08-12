package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.PersonDTO;
import com.jrsilva.callRegistration.entities.Person;
import com.jrsilva.callRegistration.repositories.PersonRepository;
import com.jrsilva.callRegistration.services.exceptions.ResourceNotFoundException;

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
		Person entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
		return new PersonDTO(entity);
	}

	@Transactional
	public PersonDTO insert(PersonDTO dto) {
		Person entity = new Person();
		entity = entityValues(dto, entity);
		return new PersonDTO(entity);
	}

	private Person entityValues(PersonDTO dto, Person entity) {
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		return entity;
	}

	@SuppressWarnings("deprecation")
	@Transactional
	public PersonDTO update(Long id, PersonDTO dto) {
		try {
			Person entity = repository.getOne(id);
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity = repository.save(entity);
		return new PersonDTO (entity);
		} catch (javax.persistence.EntityNotFoundException e){
			throw new ResourceNotFoundException("Id not found " + id);
		}
		
	}
}
