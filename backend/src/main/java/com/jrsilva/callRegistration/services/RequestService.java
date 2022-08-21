package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.RequestDTO;
import com.jrsilva.callRegistration.entities.Request;
import com.jrsilva.callRegistration.repositories.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	private RequestRepository repository;
	
	@Transactional(readOnly = true)
	public List<RequestDTO> findAll() {
		List<Request> list = repository.findAll();
		return list.stream().map(x -> new RequestDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public RequestDTO findById(Long id) {
		Optional<Request> obj = repository.findById(id);
		Request entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found - (Request)"));
		return new RequestDTO(entity);
	}
}
