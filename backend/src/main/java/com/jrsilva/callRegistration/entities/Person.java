package com.jrsilva.callRegistration.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idPerson;
	private String name;
	private Number cpf;
	
	public Person () {
		
	}

	public Person(Long idPerson, String name, Number cpf) {
		super();
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

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPerson);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(idPerson, other.idPerson);
	}
	
}
