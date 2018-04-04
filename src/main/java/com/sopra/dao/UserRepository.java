package com.sopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findByEmail(String email);
}
