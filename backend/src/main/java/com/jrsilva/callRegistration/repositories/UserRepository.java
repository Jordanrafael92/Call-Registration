package com.jrsilva.callRegistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrsilva.callRegistration.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
