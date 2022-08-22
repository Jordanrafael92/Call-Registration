package com.jrsilva.callRegistration.dto;

import java.io.Serializable;

import com.jrsilva.callRegistration.entities.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long idPerson;
	private String login;
	private String password;
	private Boolean admin;
	
	public UserDTO() {
		
	}

	public UserDTO(User entity) {
		this.id = entity.getId();
		this.idPerson = entity.getIdPerson();
		this.login = entity.getLogin();
		this.password = entity.getPassword();
		this.admin = entity.getAdmin();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
}
