package com.sopra.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class AppRole {
	@Id
	@GeneratedValue
	private Long id;
	private String roleName;

	public Long getId() {
		return id;
	}

	public AppRole(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public AppRole() {
		super();
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
