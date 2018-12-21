package com.techelevator.validation.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	
	@Email
	@NotBlank(message="Please enter your email")			
	private String email;
	
	@NotBlank(message="Please enter your password")			
	@Size(min=8)
	@Pattern(regexp="[%&*\\()$#@!]+")
	private String password;

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
	
}