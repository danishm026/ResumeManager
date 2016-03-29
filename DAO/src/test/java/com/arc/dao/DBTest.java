package com.arc.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.arc.dto.UserRegistrationDetails;

public class DBTest {
	@Test
	public void saveGetDeleteTest() {
		UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
		assertNotNull(userRegistrationDetails);
		
		String testRollNumber = "testRollNumber";
		String testEmail = "testEmail";
		String testPasswordHash = "testPasswordHash";
		
		userRegistrationDetails.setRollNumber(testRollNumber);
		userRegistrationDetails.setEmail(testEmail);
		userRegistrationDetails.setPasswordHash(testPasswordHash);
		
		
		DB.save(userRegistrationDetails);
		
		userRegistrationDetails = null;
		assertNull(userRegistrationDetails);
		
		userRegistrationDetails = (UserRegistrationDetails) DB.get(UserRegistrationDetails.class, testRollNumber);
		
		assertNotNull(userRegistrationDetails);
		
		assertEquals(userRegistrationDetails.getRollNumber(),testRollNumber);
		assertEquals(userRegistrationDetails.getEmail(), testEmail);
		assertEquals(userRegistrationDetails.getPasswordHash(), testPasswordHash);
		
		DB.delete(userRegistrationDetails);
		userRegistrationDetails = (UserRegistrationDetails) DB.get(UserRegistrationDetails.class, testRollNumber);
		
		assertNull(userRegistrationDetails);
	}
}
