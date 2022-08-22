package com.jrsilva.callRegistration.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrsilva.callRegistration.dto.UserDTO;
import com.jrsilva.callRegistration.entities.User;
import com.jrsilva.callRegistration.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional
	public UserDTO insert(UserDTO dto) {
		User entity = new User();
		entity.setIdPerson(dto.getIdPerson());
		entity.setLogin(dto.getLogin());
		entity.setPassword(dto.getPassword());
		entity.setAdmin(dto.getAdmin());
		return new UserDTO(entity);
	}
	
}
