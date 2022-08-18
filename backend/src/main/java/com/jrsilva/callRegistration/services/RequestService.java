package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.RequestDTO;
import com.jrsilva.callRegistration.repositories.RequestRepository;
import com.jrsilva.callRegistration.entities.Request;

@Service
public class RequestService {
	
	@Autowired
	private RequestRepository repository;
	
	@Transactional(readOnly = true)
	public List<RequestDTO> findAll() {
		List<Request> list = repository.findAll();
		return list.stream().map(x -> new RequestDTO(x)).collect(Collectors.toList());
	}
}
