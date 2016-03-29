package com.arc.business.login;

import com.arc.dao.DB;
import com.arc.dto.UserRegistrationDetails;

public class UserLogin {
	public static boolean login(String rollNumber, String passwordHash) {
		UserRegistrationDetails user = (UserRegistrationDetails)DB.get(UserRegistrationDetails.class, rollNumber);
		if(user == null || user.getPasswordHash().equals(passwordHash) == false) {
			return false;
		}
		return true;
	}
}
