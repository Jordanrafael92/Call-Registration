package com.jrsilva.callRegistration.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jrsilva.callRegistration.config.DescriptionStatus;

@Entity
@Table(name = "tb_request")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRequest;
	private Long idUser;
	private String description;
	private DescriptionStatus status;
	
	public Request() {
		
	}

	public Request(Long idRequest, Long idUser, String description, DescriptionStatus status) {
		super();
		this.idRequest = idRequest;
		this.idUser = idUser;
		this.description = description;
		this.status = status;
	}

	public Long getIdRequest() {
		return idRequest;
	}

	public void setIdRequest(Long idRequest) {
		this.idRequest = idRequest;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DescriptionStatus getStatus() {
		return status;
	}

	public void setStatus(DescriptionStatus status) {
		this.status = status;
	}
	
}
