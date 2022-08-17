package com.jrsilva.callRegistration.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrsilva.callRegistration.dto.RequestDTO;
import com.jrsilva.callRegistration.services.RequestService;

@RestController
@RequestMapping(value = "/request")
public class RequestResource {
	
	@Autowired
	private RequestService service;
	
	public ResponseEntity<List<RequestDTO>> findAll() {
		List<RequestDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
