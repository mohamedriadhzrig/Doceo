package com.sopra.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.entities.AppUser;
import com.sopra.service.AccountService;

@RestController
public class AccountRestController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/register")
	public AppUser register(@RequestBody RegisterForm userForm) {
		if (!userForm.getPassword().equals(userForm.getRepassword()))
			throw new RuntimeException("You must confirm your password");
		AppUser user = accountService.findUserByEmail(userForm.getEmail());
		if (user != null)
			throw new RuntimeException("This user Already exist");
		AppUser appUser = new AppUser();
		appUser.setEmail(userForm.getEmail());
		appUser.setPassword(userForm.getPassword());
		accountService.saveUser(appUser);
		accountService.addRoleToUse(userForm.getEmail(), "USER");
		return appUser;
	}
}
