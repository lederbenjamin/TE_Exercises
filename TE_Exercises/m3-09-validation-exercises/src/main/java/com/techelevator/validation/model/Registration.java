package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="Please enter your first name")			
	@Size(max=20)
	private String firstName;
	
	@NotBlank(message="Please enter your last name")			
	@Size(max=20)
	private String lastName;
	
	@NotBlank(message="Email address is required")
	@Email(message="invalid email")
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String confirmEmail;
	
	@NotBlank(message="A password  is required")
	@Size(min=8)
	@Pattern(regexp="[%&*\\()$#@!]+", message="Please enter a valid password")
	private String password;
	
	@NotBlank(message="Please confirm password")
	private String confirmPassword;
	
	@NotBlank(message="Please enter your birthday")
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate birthDate;
	
	
	@Min(1)
	@Max(10)
	//@Range(min=1, max=10)  //this is an alternative to using separate @Mix and @Max
	private int numOfTickets;
	
	private boolean emailMatching; 
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(confirmEmail);
		} else {
			return false;
		}
	}
	
	private boolean passwordMatching; 
	@AssertTrue(message="passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		} else {
			return false;
		}
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public int getNumOfTickets() {
		return numOfTickets;
	}
	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}
	

}