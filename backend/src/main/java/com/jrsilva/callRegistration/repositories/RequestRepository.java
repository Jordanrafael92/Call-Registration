package com.jrsilva.callRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrsilva.callRegistration.entities.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

}
