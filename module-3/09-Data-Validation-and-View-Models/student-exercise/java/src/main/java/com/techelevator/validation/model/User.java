package com.techelevator.validation.model;

import org.hibernate.validator.constraints.NotBlank;

public class User {

	private String username;
	private String email;
	private String name;
	
	
	@NotBlank(message="Please give us your username, you moron")
	private String userName;
	
	@NotBlank(message="Password cannot be empty")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPassword() {
		return password;
	}
	
}
