package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.UserDTO;
import com.jrsilva.callRegistration.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		List<com.jrsilva.callRegistration.entities.User> list = repository.findAll();
		return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
}