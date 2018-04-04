package com.sopra.web;

public class RegisterForm {
	private String email;
	private String password;
	private String repassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public RegisterForm(String username, String password, String repassword) {
		super();
		this.email = username;
		this.password = password;
		this.repassword = repassword;
	}
	public RegisterForm() {
		super();
	}
	

}
