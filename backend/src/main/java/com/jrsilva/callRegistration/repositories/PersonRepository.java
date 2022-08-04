package com.jrsilva.callRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrsilva.callRegistration.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
