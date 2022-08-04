package com.jrsilva.callRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrsilva.callRegistration.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
