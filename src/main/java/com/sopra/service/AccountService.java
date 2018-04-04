package com.sopra.service;



import com.sopra.entities.*;


public interface AccountService {
	
	
	public AppUser saveUser(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUse(String username, String roleName);
	public AppUser findUserByEmail(String email);
}
