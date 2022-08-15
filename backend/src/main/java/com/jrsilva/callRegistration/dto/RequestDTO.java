package com.jrsilva.callRegistration.dto;

import java.io.Serializable;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.jrsilva.callRegistration.config.DescriptionStatus;

public class RequestDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idRequest;
	private Long idUser;
	private String description;

	@Enumerated(EnumType.STRING)
	private DescriptionStatus status = DescriptionStatus.ABERTO;
	
	public RequestDTO() {
		
	}

	public RequestDTO(Long idRequest, Long idUser, String description, DescriptionStatus status) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
