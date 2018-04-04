package com.sopra.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
public AppRole findByRoleName(String roleName );
}
