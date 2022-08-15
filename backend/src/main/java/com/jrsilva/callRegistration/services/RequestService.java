package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrsilva.callRegistration.dto.RequestDTO;
import com.jrsilva.callRegistration.entities.Request;
import com.jrsilva.callRegistration.repositories.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	private RequestRepository repository;
	
	public List<RequestDTO> findAll(){
		List<Request> list = repository.findAll();
		return list.stream().map(x -> new RequestDTO(x)).collect(Collectors.toList());
	}

}
