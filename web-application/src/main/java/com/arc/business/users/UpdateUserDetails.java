package com.arc.business.users;

import com.arc.dao.DB;
import com.arc.dto.PersonalDetails;
import com.arc.dto.academic.SSCDetails;

public class UpdateUserDetails {
	public static void updatePersonalDetails(PersonalDetails personalDetails) {
		PersonalDetails userDetails = (PersonalDetails) DB.get(PersonalDetails.class, personalDetails.getRollNumber());
		if(userDetails == null) {
			DB.save(personalDetails);
		}
		else {
			DB.update(personalDetails);
		}
	}
	
	public static void updateSSCdetails(SSCDetails sscDetails) {
		SSCDetails sscDetailsFromDB = (SSCDetails) DB.get(SSCDetails.class, sscDetails.getRollNumber());
		if(sscDetailsFromDB == null) {
			DB.save(sscDetails);
		}
		else {
			DB.update(sscDetails);
		}
	}
}
