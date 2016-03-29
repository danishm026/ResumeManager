package com.arc.business.registration;

import com.arc.dao.DB;
import com.arc.dto.UserRegistrationDetails;

public class UserRegistration {
	public static boolean registerUser(UserRegistrationDetails user) {
		 UserRegistrationDetails databaseUser= (UserRegistrationDetails)DB.get(UserRegistrationDetails.class, user.getRollNumber());
		 if(databaseUser != null)
			 return false;
		 DB.save(user);
		return true;
	}
}
