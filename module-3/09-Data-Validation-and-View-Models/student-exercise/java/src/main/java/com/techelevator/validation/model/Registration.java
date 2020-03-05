package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {

	
	
	/*
	 * Annotations determine what is validated.
	 * The message is the Text displayed the user
	 */
	
	@NotBlank(message="Please give us your name, you moron")
	private String firstName;
	

	@NotBlank(message="Please give us your last name too, stupid")
	private String lastName;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address")
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String verifyEmail;
	
	@NotBlank(message="Password cannot be empty")
	private String password;

	@NotBlank(message="Verify password is required")
	private String verifyPassword;
	
	@NotBlank(message="Provide a date")
	private String birthday;
	
	@NotNull(message="Enter a valid number")
	@Min(value=1, message="You must enter a valid 1-10")
	@Max(value=10, message="You must enter a valid 1-10")
	private Integer numberOfTickets;
	
	

	
	/*
	 * Dummy property that tells the validator to validate the emailMatching property, meaning it will call our method,
	 * and give our message if it returns false.
	 */
	private boolean emailMatching; 
	
	
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}
	private boolean passwordMatching; 
	
	
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(verifyPassword);
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


public String getVerifyEmail() {
	return verifyEmail;
}


public void setVerifyEmail(String verifyEmail) {
	this.verifyEmail = verifyEmail;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getVerifyPassword() {
	return verifyPassword;
}


public void setVerifyPassword(String verifyPassword) {
	this.verifyPassword = verifyPassword;
}


public String getBirthday() {
	return birthday;
}


public void setBirthday(String birthday) {
	this.birthday = birthday;
}


public Integer getNumberOfTickets() {
	return numberOfTickets;
}


public void setNumberOfTickets(Integer numberOfTickets) {
	this.numberOfTickets = numberOfTickets;
}


public void setEmailMatching(boolean emailMatching) {
	this.emailMatching = emailMatching;
}
}
