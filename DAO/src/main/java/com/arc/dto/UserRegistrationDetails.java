package com.arc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class UserRegistrationDetails {
	@Id
	private String rollNumber;
	@NotNull
	private String email;
	@NotNull
	private String passwordHash;
	
	public UserRegistrationDetails() {
		this.rollNumber = "";
		this.email = "";
		this.passwordHash = "";
	}
	
	public UserRegistrationDetails(String rollNumber, String email, String passwordHash) {
		this.rollNumber = rollNumber;
		this.email = email;
		this.passwordHash = passwordHash;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}	
}
