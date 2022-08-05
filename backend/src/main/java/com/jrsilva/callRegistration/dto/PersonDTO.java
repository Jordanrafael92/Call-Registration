package com.jrsilva.callRegistration.dto;

import java.io.Serializable;

import com.jrsilva.callRegistration.entities.Person;

public class PersonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long idPerson;
	private String name;
	private Long cpf;
	
	public PersonDTO() {
		
	}

	public PersonDTO(Person entity) {
		this.idPerson = entity.getIdPerson();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
	}
	
	public PersonDTO(Long idPerson, String name, Long cpf) {
		this.idPerson = idPerson;
		this.name = name;
		this.cpf = cpf;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
}
