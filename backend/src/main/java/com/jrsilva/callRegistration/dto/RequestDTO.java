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

}
